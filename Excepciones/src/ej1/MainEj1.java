package ej1;

import java.util.Scanner;

public class MainEj1 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int entero=0;
		double decimal=0;
		System.out.println("Por favor introduzca un numero entero.");
		entero = Utils.readInt(lee);
		lee.nextLine();
		System.out.println("Por favor introduzca un numero decimal.");
		decimal = Utils.readDouble(lee);
		
	}

}
