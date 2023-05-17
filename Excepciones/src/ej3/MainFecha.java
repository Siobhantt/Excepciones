package ej3;

import java.util.Scanner;

public class MainFecha {

	public static void main(String[] args) {
		int opcionUser;
		Fecha fecha = new Fecha();
		Scanner lee = new Scanner(System.in);
	
		try {
			fecha.setDia(12);
			fecha.setMes(4);
			fecha.setAnio(0);
		}catch (ExcepcionDiaIncorrecto e){
			System.out.println(e.toString());
		}catch (ExcepcionMesIncorrecto e) {
			System.out.println(e.toString());
		} catch (ExcepcionAñoIncorrecto e) {
			System.out.println(e.toString());
		}
		

		
	}
}
