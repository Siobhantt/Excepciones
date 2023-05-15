package ej2;

public class Hora {
	/**
	 * Atributo de la clase que representa la hora
	 */
	private int hora;
	/**
	 * Atributo de la clase que representan los minutos
	 */
	private int minuto;
	/**
	 * Atributo de la clase que representa los segundos
	 */
	private int segundo;

	/**
	 * Constructor sin parametros
	 */
	public Hora() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(int hora, int minuto, int segundo) {
		if(hora>0 && hora<24) {
			this.hora=hora;
		}
		if(minuto>0&&minuto<60) {
			this.minuto = minuto;
		}
		if(segundo>0&& segundo<60) {
			this.segundo = segundo;
		}
	}

	/**
	 * Obtiene la hora
	 * 
	 * @return
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Obtiene el minuto
	 * 
	 * @return
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Establece los minutos en caso de que esten correctos
	 * 
	 * @param minuto
	 */
	public void setMinuto(int minuto) throws NegativeMinuteException{
		if (minuto > 59 || minuto < 0) {
			throw new NegativeMinuteException();
		} else {
			this.minuto = minuto;
		}
	}

	/**
	 * Obtiene el segundo
	 * 
	 * @return
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Metodo que imprime un mensaje de error
	 */
	public void error() {
		System.out.println();
		System.err.println("Error, valor incorrecto.");
	}

	/**
	 * Establece los segundos despues de comprobar que son correctos
	 * 
	 * @param segundo
	 */
	public void setSegundo(int segundo) throws NegativeSecondException{
		if (segundo > 59 || segundo < 0) {
			throw new NegativeSecondException();
		} else {
			this.segundo = segundo;
		}
	}

	/**
	 * Establece la hora en caso de ser correcta
	 * 
	 * @param hora
	 */
	public void setHora(int hora) throws NegativeHourException{
		if (hora > 23 || hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
	}
/**
 * Metodo que imprime la hora en un formato ordenado
 */
	public String toString() {
		String mensaje = "La hora es: " + this.hora + ":" + this.minuto + ":" + this.segundo;
		return mensaje;
	}
/**
 * Incrimenta un segundo a la hora 
 */
	public void incrementaSegundo() {

		segundo++;// incremento un segundo al principio

		if (this.segundo > 59) { // en caso de que los segundos obtenidos del parametro sean mayor a 59
			this.minuto++; // y aunmentamos 1 minuto
			this.segundo=0; // usamos el set para establecer el segundo del objeto a 0
		}
		if (this.minuto > 59) { // en caso de que el minuto del objeto sea mayor a 59
			this.hora++; // y se aumenta la hora en 1
			this.minuto=0; // se establece el minuto a 0
		
		}
		if (this.hora > 23) { // en caso de que la hora del objeto sea mayor a 23
			this.hora=0;// se establece la hora a 0
		}
		
	}//fin del metodo

}
