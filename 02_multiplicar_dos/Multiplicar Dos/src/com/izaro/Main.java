package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Pantalla
        System.out.print("Escribe un número: ");

        // Teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        // Pantalla
        System.out.print("Escribe otro número: ");

        // Teclado
        int b = Integer.parseInt(br.readLine());

        int resultado = a * b;

        // Pantalla
        System.out.println("El resultado es: " +resultado);


    }
}
