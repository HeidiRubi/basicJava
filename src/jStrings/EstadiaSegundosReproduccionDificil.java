package jStrings;

import com.sun.source.tree.BreakTree;
import libs.Input;

public class EstadiaSegundosReproduccionDificil {
    public static void main(String[] args) {
        //Dada la duracion de una cancion en segundos, obtenga el numero de minutos y segundos en el formato del ejemplo
        //Ejemplo:
        //Duracion en segundos: 360
        //La cancion dura 6 minutos y 0 segundos
        System.out.println("Duracion del video ss: ");
        int duracionSegundos = getPositiveNumber();
        int minutos = duracionSegundos / 60;
        int segundos = duracionSegundos % 60;
        System.out.println("La cancion dura " + minutos + " y " + segundos + " segundos");
    }

    private static int getPositiveNumber() {
        int numero = -1;
        while (numero < 0) {
            numero = Input.get_int();
        }
        if (numero < 0) {
            System.out.println("El numero es negativo, debe ingresar un numero positivo.");
        }
        return numero;
    }
}
