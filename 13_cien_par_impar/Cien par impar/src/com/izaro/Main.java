package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Escoge: PAR o IMPAR.");
        String respuesta = br.readLine();

        if (respuesta.equalsIgnoreCase("PAR") || respuesta.equalsIgnoreCase("IMPAR")) {
            for (int i = 0; i < 200; i++) {
                if (respuesta.equalsIgnoreCase("PAR") && i % 2 == 0) {
                    System.out.println(i);
                } else {
                    if (respuesta.equalsIgnoreCase("IMPAR") && i%2==1) {
                        System.out.println(i);
                    }
                }

            }
        } else

        {
            System.out.println("error");


        }
    }
}