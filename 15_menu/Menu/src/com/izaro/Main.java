package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int respuesta = 0;
	String opcion;

        System.out.println("Escribe un número: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Escribe otro número: ");
        int n2 = Integer.parseInt(br.readLine());
        do {

        System.out.println("Escoge una opción");
        opcion = br.readLine();


            switch (opcion)
            {
                case "A":
                case "a":
                    respuesta = n1+n2;
                    System.out.println("La respuesta es: "+respuesta+".");
                    break;

                case "B":
                case "b":
                    respuesta = n1-n2;
                    System.out.println("La respuesta es; "+respuesta+".");
                    break;

                case "C":
                case "c":
                    respuesta = n1*n2;
                    System.out.println("La respuesta es: "+respuesta+".");
                    break;

                case "D":
                case "d":
                    respuesta = n1/n2;
                    System.out.println("La respuesta es: "+respuesta+".");
                    break;

                case "E":
                case "e":
                    respuesta = n1%n2;
                    System.out.println("La respuesta es: "+respuesta+".");
                    break;

                case "F":
                case "f":
                    System.out.println("El programa ha terminado.");
                    break;


            }
        }
        while (!opcion.equalsIgnoreCase("F"));



    }
}
