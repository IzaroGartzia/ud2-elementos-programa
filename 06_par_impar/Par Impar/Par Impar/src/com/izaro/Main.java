package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Pantalla
            System.out.println("Escribe un número: ");

            // Teclado
            int a = Integer.parseInt(br.readLine());

            // Instrucciones
            if (a%2==0)
            {
                System.out.println("El número que has introducido es PAR.");
            }
            else
            {
                System.out.println("El número que has introducido es IMPAR.");
            }


        } catch (NumberFormatException a) {
            System.out.println("¡Error! Escribe un número válido.");
        }
    }
}
