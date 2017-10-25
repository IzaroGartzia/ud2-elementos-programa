package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int resto;

        System.out.println("Vamos a comprobar el DNI. Escribe el DNI:");
        int dni = Integer.parseInt(br.readLine());

        System.out.println("Ahora, escribe la letra de tu DNI: ");
        String letra = br.readLine();

        resto = dni%23;

        switch (resto)
        {
            case 0:
                if(letra.equalsIgnoreCase("T"))
            {
                System.out.println("OK. DNI correcto.");
            }
            break;

            case 1:
                if(letra.equalsIgnoreCase("R"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 2:
                if(letra.equalsIgnoreCase("W"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 3:
                if(letra.equalsIgnoreCase("A"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 4:
                if(letra.equalsIgnoreCase("G"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 5:
                if(letra.equalsIgnoreCase("M"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 6:
                if(letra.equalsIgnoreCase("Y"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 7:
                if(letra.equalsIgnoreCase("F"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 8:
                if(letra.equalsIgnoreCase("P"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 9:
                if(letra.equalsIgnoreCase("D"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 10:
                if(letra.equalsIgnoreCase("X"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 11:
                if(letra.equalsIgnoreCase("B"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 12:
                if(letra.equalsIgnoreCase("N"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 13:
                if(letra.equalsIgnoreCase("J"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 14:
                if(letra.equalsIgnoreCase("Z"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 15:
                if(letra.equalsIgnoreCase("S"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 16:
                if(letra.equalsIgnoreCase("Q"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 17:
                if(letra.equalsIgnoreCase("V"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 18:
                if(letra.equalsIgnoreCase("H"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 19:
                if(letra.equalsIgnoreCase("L"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 20:
                if(letra.equalsIgnoreCase("C"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 21:
                if(letra.equalsIgnoreCase("K"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;

            case 22:
                if(letra.equalsIgnoreCase("E"))
                {
                    System.out.println("OK. DNI correcto.");
                }
                else
                {
                    System.out.println("ERROR. DNI incorrecto.");
                }
                break;


        }
    }
}
