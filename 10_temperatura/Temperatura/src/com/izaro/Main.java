package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un número: ");
        double a = Double.parseDouble(br.readLine());

        System.out.println("A que tipo de temperatura quieres convertirlo: ¿Fahrenheit o Kelvin?");
        char c = br.readLine().charAt(0);

        switch (c)
        {
            case 'f':
                double resultado = 1.8*a+32;
                System.out.println("El resultado es: "+resultado);
                break;
            case 'k':
                double resultado2 = a+273.15;
                System.out.println("El resultado es: "+resultado2);
                break;
            default:
                System.out.println("Lo siento, no tengo respuesta :(");
        }






    }
}
