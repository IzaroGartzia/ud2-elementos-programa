package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dividor = 2;

        System.out.println("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());

        while (n > dividor && n % dividor != 0) {
            dividor++;

        }
        if (n % dividor == 0) {
            System.out.println("No es primo.");
        } else {
            System.out.println("Es primo");
        }


    }
}
