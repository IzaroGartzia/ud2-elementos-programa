package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// Pantalla
        System.out.print("Escribe la base del triángulo: ");

    // Teclado
        int a = Integer.parseInt(br.readLine());

    // Pantalla
        System.out.print("Escribe la altura del triángulo: ");

    // Teclado
        int b = Integer.parseInt(br.readLine());

    // Instrucción
        int area = a*b/2;

    // Pantalla
        System.out.print("El área del triángulo es: "+area);

    }
}
