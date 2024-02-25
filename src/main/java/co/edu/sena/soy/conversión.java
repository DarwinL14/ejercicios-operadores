package co.edu.sena.soy;

import java.util.Scanner;

public class conversión {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "4. Convertir de Euros  Dólares" );
        System.out.println( "Ingrese la cantidad de Euros a convertir: ");

        Scanner src = new Scanner(System.in);
        double euro = src.nextDouble();

        double dolar = 1.08;

        //procesos
        double conversion = (euro * dolar);

        //salida
        System.out.println("Usted tiene " + conversion + " Dólares");
    }
}
