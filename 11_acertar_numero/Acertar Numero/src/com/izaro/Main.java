package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Random r = new Random();
	int aleatorio = r.nextInt(100);
	int repeticion = 0;

	System.out.println(aleatorio);
	System.out.println("¡MINIJUEGO! Acierta el número entre 0 y 100. Si quieres terminar el juego escribe FIN.");

	String texto = br.readLine();
	int a;

        do {
        System.out.println("¡MINIJUEGO! Acierta el número entre 0 y 100. Si quieres terminar el juego escribe FIN.");
        texto=br.readLine();


            if (!texto.equals("FIN")) {
                a = Integer.parseInt(texto);

                if(a==aleatorio)
                {
                    System.out.println("¡HAS ACERTADO EL NÚMERO!");
                }
                else
                {
                    if(a>aleatorio)
                    {
                        System.out.println("El número es menor.");
                    }
                    else
                    {
                        System.out.println("El número es mayor.");
                    }
                }
            }

        } while(!texto.equals("FIN") && a!=aleatorio);
        System.out.println("¡MINIJUEGO! Acierta el número entre 0 y 100. Si quieres terminar el juego escribe FIN.");
        texto = br.readLine();

    }

}
