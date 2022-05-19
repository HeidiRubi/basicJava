package cVariables;

import libs.Input;

public class EstadiaHolanombre {

    public static void main(String[] args) {
        String nombre = Input.get_string("Como te llamas? ");
        System.out.println("Hola, " + nombre);
    }
}
