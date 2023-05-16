package ej2;

public class NegativeHourException extends Exception {
	public String toString() {
		return "No se puede insertar una hora menor a cero";
	}
}
