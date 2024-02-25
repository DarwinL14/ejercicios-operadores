package co.edu.sena.soy;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "Calcular el área de un triángulo" );
        System.out.println( "Ingrese la base del triángulo: ");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println("Ingrese la altura del triángulo");
        double height = src.nextDouble();

        //procesos
        double result = (base * height) /2;

        //salida
        System.out.println("El área del triángulo es: " + result);
    }
}

