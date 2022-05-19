package dNumericTypes;

import libs.Input;

public class EstadiaBotellasDeAgua {

    static int minutos = Input.get_int("Minutos: ");
    static int botellasagua =12;
    static int convert = botellasagua * minutos;

    public static void main(String[] args) {
        System.out.println("Botellas: " + convert);
    }



}
