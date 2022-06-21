package com.javadoc;

public class Presentada {
	private String tu;
	
	public Presentada(String presentada) {
        tu = presentada;
    }
	
	public void printPresentacion() {
        System.out.println("Hola, te presento a " + tu + ".");
    }
}
