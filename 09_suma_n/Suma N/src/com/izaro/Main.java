package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Cuántos números quieres sumar?");
        int n = Integer.parseInt(br.readLine());

        int resultado = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Escribe un número: ");
            int a = Integer.parseInt(br.readLine());
            resultado = resultado+a;

        }
        System.out.println("El resultado es: "+resultado);

    }
}
