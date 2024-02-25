package co.edu.sena.soy;

import java.util.Scanner;

public class suma {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "2. Ingresar dos números por teclado y sumarlos" );
        System.out.println( "Ingrese el primer número: ");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();

        System.out.println("Ingrese  el segundo número: ");
        double num2 = src.nextDouble();

        //procesos
        double suma = (num1 + num2);

        //salida
        System.out.println("La suma de los dos números es: " + suma);
    }
}
