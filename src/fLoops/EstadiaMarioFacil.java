package fLoops;

import libs.Input;
import  java.util.Scanner;

public class EstadiaMarioFacil {
    /*Implementa un programa que imprima una media piramide de una altura especificada por el usuario, como abajo:
     $ ./mario
     Altura: 5
     ##
     ###
     ####
     #####
     ######

     $ ./mario
     Altura: 3
     ##
     ###
     ####
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        int numFilas = sc.nextInt();

        for(int i=1; i<=numFilas; i++){
            for(int j=1; j<=i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }

        sc.close();
    }
}


