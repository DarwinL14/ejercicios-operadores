package co.edu.sena.soy;

import java.util.Scanner;

public class area_perimetro_cuadrado {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "5. área y perimetro de un cuadrado a partir de un lado" );
        System.out.println( "Ingrese el lado del cuadrado: ");

        Scanner src = new Scanner(System.in);
        double lado = src.nextDouble();

        //procesos
        double área = (lado * lado);
        double perimetro = lado * 4;

        //salida
        System.out.println("El área del cuadrado es: " + área + " y su perimetro es:" + perimetro);
    }
}
