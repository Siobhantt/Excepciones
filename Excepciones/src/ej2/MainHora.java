package ej2;

import java.util.Scanner;

public class MainHora {

	public static void main(String[] args) {
		/*
		 * Prueba esta clase de forma que en el main se pida la cantidad de segundos a
		 * incrementar y muestre por pantalla el resultado de incrementar esos segundos.
		 */
		Hora hora = new Hora(0,0,0);
		Hora hora1 = new Hora(0,0,0);
		Hora hora2 = new Hora(0,0,0);
		int cantIncrementar = 0; //variable que guarda la cantidad a incrmeentar
		//Try catch de los segundos
		try {
			hora.setSegundo(-1);
		}catch(NegativeSecondException e){
			System.out.println(e.toString());
		}
	System.out.println(hora.toString()); //imprimimos el to string del objeto
	
	//Try catch de los minutos
	try {
	hora1.setMinuto(-1);
	}catch (NegativeMinuteException e) {
		System.out.println(e.toString());
	}
	
	//try catch de las horas
	try {
		hora2.setHora(-2);
	}catch (NegativeHourException e) {
		System.out.println(e.toString());
	}
}
}