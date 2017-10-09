package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//Pantalla
        System.out.println("Escribe un número: ");

    // Teclado
        int a = Integer.parseInt(br.readLine());

    //Instrucciones
        if(a >= 1 && a <= 7)
        {
            //Verdad
            switch (a)
            {
                case 1:
                    System.out.println("Lunes");
                    break;

                case 2:
                    System.out.println("Martes");
                    break;

                case 3:
                    System.out.println("Miércoles");
                    break;

                case 4:
                    System.out.println("Jueves");
                    break;

                case 5:
                    System.out.println("Viernes");
                    break;

                case 6:
                    System.out.println("Sábado");
                    break;

                case 7:
                    System.out.println("Domingo");
                    break;
            }
        }
        else
        {
            //Falso
            System.out.println("Has puesto un número incorrecto.");
        }
    }
}
