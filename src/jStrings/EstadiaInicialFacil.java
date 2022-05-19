package jStrings;

import java.util.Scanner;

public class EstadiaInicialFacil {

    public static void main(String[] args) {

        System.out.println("Escribe tu nombre: ");
        Scanner input = new Scanner(System.in);
        String[] nombrecompleto = input.nextLine().split(" ");
        System.out.print(imprimirIniciales(nombrecompleto));

    }

    public static String imprimirIniciales(String[] fullArray) {
        String result = "";
        for (String s : fullArray) {
            result += s.toUpperCase().charAt(0);
        }

        return result;
    }
}

