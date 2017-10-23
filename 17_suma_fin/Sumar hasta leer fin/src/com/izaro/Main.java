package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String n;
	int respuesta = 0;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
    do {
        System.out.println("Escribe un número o escribe FIN para terminar el programa. ");
        n = br.readLine();

        if(!n.equalsIgnoreCase("FIN"))
        {

                int n1 = Integer.parseInt(n);

                if(n1>max)
                {
                    max = n1;
                }
                if(n1<min)
                {
                    min = n1;
                }
                respuesta = respuesta + n1;
        }


    }
    while (!n.equalsIgnoreCase("FIN"));
        System.out.println("La suma total de los números introducidos es: "+respuesta+".");
        System.out.println("El máximo valor es "+max+" y el mínimo valor es "+min+".");






    }
}
