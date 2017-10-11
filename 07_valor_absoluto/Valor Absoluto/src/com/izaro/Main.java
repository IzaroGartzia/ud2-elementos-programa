package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int a;
        do {
            System.out.println("Escribe un número: ");
            a = Integer.parseInt(br.readLine());
            if (a > 0)
            {
                int resultado = a*(-1);
                System.out.println("El valor absoluto es "+a+" y "+resultado);
            }
            else
            {
                if (a < 0)
                {
                    int resultado = a * (-1);
                    System.out.println("El valor absoluto es " + resultado + " y " + a);
                }
                else
                {
                    System.out.println("FIN.");
                }
            }
        }
        while (a!=0);

    }


}
