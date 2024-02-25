package co.edu.sena.soy;

import java.util.Scanner;

public class promedio {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "Calcular el promedio de tres números ingresados por el usuario" );
        System.out.println( "Ingrese el primer número a promediar: ");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();

        System.out.println("Ingrese el segundo número a promediar: ");
        double num2 = src.nextDouble();

        System.out.println("Ingrese el tercer número a promediar: ");
        double num3 = src.nextDouble();

        //procesos
        double prom = (num1 + num2 + num3) /3;

        //salida
        System.out.println("El promedio de los tres números ingresados es: " + prom);
    }
}
