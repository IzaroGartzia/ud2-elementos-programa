package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// Pantalla
        System.out.print("Escribe un número: ");

        // Teclado
        int a = Integer.parseInt(br.readLine());

        // Pantalla
        System.out.print("Escribe otro número: ");

        // Teclado
        int b = Integer.parseInt(br.readLine());

        // Pantalla
        System.out.print("Escribe el último número: ");

        // Teclado
        int c = Integer.parseInt(br.readLine());

        // Pantalla
        System.out.print("Los números en orden inverso son así: " +c+", "+b+", "+a );

    }
}
