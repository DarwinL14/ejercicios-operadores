package co.edu.sena.soy;

import java.util.Scanner;

public class potenciación {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "3. Ingresar un número y visualizar el número elevado al cuadrado" );
        System.out.println( "Ingrese el número a elevar: ");

        Scanner src = new Scanner(System.in);
        double num = src.nextDouble();

        //procesos
        double result = (num * num);

        //salida
        System.out.println("El número elevado al cuadrado es: " + result);
    }
}
