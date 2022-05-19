package jStrings;

import libs.Input;

public class Apellidos {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = Input.get_string();
        String[] nombres = nombreCompleto.split(" ");
        if (nombres.length>=3) {
            int posicionMaterno = nombres.length - 1;
            int posicionPaterno = nombres.length - 2;
            System.out.println(nombres.length);
            System.out.println("Apellido Paterno: " + nombres[posicionPaterno]);
            System.out.println("Apellido Materno: " + nombres[posicionMaterno]);
        }else{
            System.out.println("Tu nombre esta corto o no incluye ambos apellidos");
        }
    }
}
