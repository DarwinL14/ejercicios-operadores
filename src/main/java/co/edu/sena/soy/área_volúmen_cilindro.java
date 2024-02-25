package co.edu.sena.soy;

import java.util.Scanner;

public class área_volúmen_cilindro {
    public static void main( String[] args )
    {
        //entradas
        System.out.println( "Calcular el área y el volúmen de un cilindro" );
        System.out.println( "Ingrese el diámetro de la base del cilindro: ");

        Scanner src = new Scanner(System.in);
        double diámetro = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro");
        double altura = src.nextDouble();

        //procesos
        double radio =diámetro / 2;
        double área = (2 * 3.1416 * (radio * radio)) + (2* 3.1416 * radio) * altura;
        double volúmen = (3.1416 * altura * (radio * radio));

        //salida
        System.out.println("El área del cilindro es: " + área + " y su volúmen es de: " + volúmen);
    }
}
