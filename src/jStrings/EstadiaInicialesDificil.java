package jStrings;

import libs.Input;
import java.util.Scanner;
import java.util.Arrays;

public class EstadiaInicialesDificil {

    public static void main(String[] args) {


        System.out.println("Escribe tu nombre: ");
        Scanner input = new Scanner(System.in);
        String[] nombrecompleto = input.nextLine().split(" ");
        System.out.print(imprimirIniciales(nombrecompleto));

    }

    public static String imprimirIniciales(String[] fullArray) {
        String result = "";
        for (String s : fullArray) {
            result += s.toUpperCase().trim().charAt(0);
        }

        return result;
    }
}



