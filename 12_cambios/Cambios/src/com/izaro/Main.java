package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	double precio1 = 0;
	double cantidad1 = 0;


        System.out.println("¿Cuánto vale el producto?");
        precio1 = Double.parseDouble(br.readLine());


        System.out.println("¿Qué cantidad has introducido?");
        cantidad1 = Double.parseDouble(br.readLine());



        //Instrucciones
        precio1 = precio1*100;
        cantidad1 = cantidad1*100;

        int precio = (int) precio1;
        int cantidad = (int) cantidad1;

        if (precio%5==0 && cantidad%5==0)
        {
            if(precio>cantidad)
            {
                System.out.println("Lo siento, pero necesitas meter más monedas.");
            }
            else
            {
                int moneda = 0;
                int cambio = cantidad-precio;


                moneda = cambio/200;
                System.out.println("Vas a tener "+moneda+ " moneda(s) de 2€.");

                cambio = cambio%200;


                moneda = cambio/100;
                System.out.println("Vas a tener "+moneda+ " moneda(s) de 1€.");

                cambio = cambio%100;


                moneda = cambio/50;
                System.out.println("Vas a tener "+moneda+" moneda(s) de 0.5€.");

                cambio = cambio%50;


                moneda = cambio/20;
                System.out.println("Vas a tener "+moneda+" moneda(s) de 0.2€.");

                cambio = cambio%20;

                moneda = cambio/10;
                System.out.println("Vas a tener "+moneda+" moneda(s) de 0.1€.");

                cambio = cambio%10;

                moneda = cambio/5;
                System.out.println("Vas a tener "+moneda+" moneda(s) de 0.05€.");

            }
        }
        else
        {
            System.out.println("El precio o la cantidad introducida son erróneas.");
        }

    }
}
