package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escribe un valor, por favor.");
        int n = Integer.parseInt(br.readLine());
        int respuesta = 0;

        for (int i = 0; i < n; i++) {
            respuesta = respuesta + n;

        }

        System.out.println("La respuesta es: " + respuesta + ".");
    }
}
