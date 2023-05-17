package ej3;

public class Fecha {
	/**
	 * Atributo que recoge el dia
	 */
	private int dia;
	/**
	 * Atributo que recoge el mes
	 */
	private int mes;
	/**
	 * Atributo que recoge el anio
	 */
	private int anio;
/**
 * Constructor sin parametros
 */
	public Fecha() {

	}
/**
 * Constructor con los parametros de dia, mes, anio
 * @param dia
 * @param mes
 * @param anio
 */
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes = mes;
		this.anio = anio;
	}
/**
 * Obtiene el valor del dia
 * @return 
 */
	public int getDia() {
		return dia;
	}
/**
 * Establece el dia introducido en el atributo
 * @param dia
 */
	public void setDia(int dia) throws ExcepcionDiaIncorrecto {
		if (dia < 1 || dia > 31) {
			throw new ExcepcionDiaIncorrecto();
		}else {
			this.dia = dia;
			
		}
	}
/**
 * Obtiene el mes
 * @return
 */
	public int getMes() {
		return mes;
	}
/**
 * Establece el mes introducido en el atributo 
 * @param mes
 */
	public void setMes(int mes) throws ExcepcionMesIncorrecto{
		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}else {
			throw new ExcepcionMesIncorrecto(); 
		}
	}
/**
 * Obtiene el anio
 * @return
 */
	public int getAnio() {
		return anio;
	}
/**
 * Establece el anio
 * @param anio
 */
	public void setAnio(int anio) throws ExcepcionAñoIncorrecto {
		if(anio<1 || anio >12) {
			throw new ExcepcionAñoIncorrecto();
		}else {
		this.anio = anio;
		}
		}
/**
 * Metodo que compueba si el anio es bisiesto
 * @return
 */
	private boolean esBisiesto() {
		//Los getters son para obtener un valor fuera de la clase, en la clase tengo acceso a los atributos entonces no necesito usar el get
		boolean bisiesto;
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			bisiesto = true;
		} else {
			bisiesto = false;
		}
		return bisiesto;
	}
/**
 * Comprueba si los valores introducidos en la fecha son correctos
 * @return
 */
	public boolean fechaCorrecta() {
		boolean fechaCorrecta = false;
//Si esta en el rango de 1 y 31 
		if (dia > 0 && dia <= 31) {
			if (esBisiesto() && mes == 2 && dia <= 29 || !esBisiesto()&&mes==2&&dia<=28) {
				fechaCorrecta = true;
			} else if (mes30() && dia <= 30) {
				fechaCorrecta = true;
			}else if(getMes()!=2 && dia<=31) {
				fechaCorrecta =true;
			}
		}
		//if (getMes() < 1 || getMes() > 12) {
			//fechaCorrecta = false;
		//}

		return fechaCorrecta;

	}// fin de fechaCorrecta
/**
 *Metodo que añade un dia a la fecha y modifica la hora segun el caso correspondiente 
 */
	public void diaSiguiente() {
		// si es un mes de 30 y estamos en el dia 30 se reinicia a 1 el dia y se
		// incrementa el mes
		if (mes30() && dia == 30) {
			dia = 1;
			mes++;
		} else if (mes != 2 && dia == 31) {//si es 
			if (mes == 12) {
				mes = 1;
				dia = 1;
				anio++;
			} else {
				mes++;
				dia++;
			}
		} else if (esBisiesto() && mes == 2 && dia == 29) {
			mes++;
			dia = 1;
		} else if (mes == 2 && dia == 28) {
			mes++;
			dia = 1;
		} else {
			dia++;
		}
	}
/**
 * Metodo que devuelve true si el mes contiene 30 dias
 * @return meses de 30 dias
 */
	public boolean mes30() {
		boolean dias30 = false;
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias30 = true;
		}
		return dias30;
	}

	@Override
	public String toString() {
		String fecha="";
		if(dia<=9) {
			fecha+="0";
		}
		return fecha;
	}

}
