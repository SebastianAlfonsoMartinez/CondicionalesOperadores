package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clase Scanner para solicitar 3 números

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero:");
        int num1 = miScanner.nextInt();
        System.out.println("este es el numero 1: " + num1);

        System.out.println("Ingresa el sengudo numero:");
        int num2 = miScanner.nextInt();
        System.out.println(num2);

        System.out.println("Ingresa el trecer numero:");
        int num3 = miScanner.nextInt();
        System.out.println(num3);
    /*método llamado foundBiggerNumber, el cual use la clase Scanner para solicitar 3
    números y buscar mayor de los 3, que imprima por consola el mayor “The number N is
    the bigest” y retorne el numero.  */
        int numeroMayor = foundBiggerNumber(num1, num2, num3);


        System.out.println("<---------------------------->");
        System.out.println("El numero " + numeroMayor + " es el mayor");

    /*Invocar el método recién creado en el método, con el valor retornado incrementarlo
    en 1. */
        numeroMayor++;

      /*Usar el operador ternario para guardar en una variable int el valor de 1 si el
      numero es par o el valor 0 si es impar.   */
        System.out.println("<---------------------------->");
        int esPar = numeroMayor % 2 == 0 ? 1 : 0 ;
        System.out.println("1 = Par | 0 = Impar \n resultado: " + esPar);

      /*Usar un switch para evaluar la variable con el resultado y si es 1 imprimir en
      consola “n is even number” o si es 0 “N is odd number”  */
        System.out.println("<---------------------------->");
        switch (esPar){
            case 1:
                System.out.println("El numero " + numeroMayor + " es par");
                break;
            case 0:
                System.out.println("El numero " + numeroMayor + " es impar");
                break;
        }
    }
    /*Método llamado foundBiggerNumber, el cual use la clase Scanner para
    solicitar 3 números y buscar mayor de los 3*/
    static int foundBiggerNumber(int num1, int num2, int num3){
        int numeroMayor = num1;

        if(num2 > numeroMayor){
            numeroMayor = num2;
        }
        if (num3 > numeroMayor){
            numeroMayor = num3;
        }
        return numeroMayor;
    }
}