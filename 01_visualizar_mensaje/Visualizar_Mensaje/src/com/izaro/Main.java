package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// Pantalla
        System.out.println("Escribe un mensaje: ");
    //Teclado
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String texto = br.readLine();
    //Pantalla
        System.out.println("Has escrito: " +texto);
    }
}
