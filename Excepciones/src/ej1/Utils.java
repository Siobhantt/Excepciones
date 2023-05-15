package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner lee) {
		double num=0.0;
		try {
		num = lee.nextDouble();
		lee.nextLine();
		}catch(InputMismatchException e){
			System.out.println("El numero no es decimal.");
		} 
		return num;
	}

	public static int readInt(Scanner lee) {
		int num=0;
		try {
		num = lee.nextInt();
		lee.nextLine();
		} catch (InputMismatchException e){
		System.out.println("El numero no es entero.");
		}
		
		return num;
	}
}
