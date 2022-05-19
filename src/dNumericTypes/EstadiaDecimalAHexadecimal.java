package dNumericTypes;

import libs.Input;

import java.util.Scanner;

public class EstadiaDecimalAHexadecimal {


    public static <decimal> void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int decimal = Input.get_int("Ingrese un numero positivo: \n");


        do {
            Integer.toHexString(decimal);
            if (decimal > 0) {
                String letrasMayu = Integer.toHexString(decimal);
                System.out.println("Hexadecimal: " + letrasMayu.toUpperCase());
                break;
            } else
                System.out.println("Error. El numero debe ser positivo");
            {
            }
        } while (decimal > 0);
        {
        }
    }
}