package co.edu.sena.soy;

import java.util.Scanner;

public class longitud_área_circunferencia {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "Calcular la longitud y el área de una circunferencia" );
        System.out.println( "Ingrese el radio de la circunferencia ");

        Scanner src = new Scanner(System.in);
        double radio = src.nextDouble();

        //procesos
        double diámetro = radio * 2;
        double longitud = (diámetro * 3.1416);
        double área = (3.1416 * (radio * radio));

        //salida
        System.out.println("La longitud de la circunferencia es de: " + longitud + " y su área es de: " + área);
    }
}
