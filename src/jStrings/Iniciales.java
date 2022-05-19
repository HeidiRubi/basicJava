package jStrings;

import libs.Input;

public class Iniciales {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre completo: ");
        String nombreCompleto = Input.get_string();
        for (int posicion = 0; posicion < nombreCompleto.length(); posicion++) {
            char caracterActual = nombreCompleto.charAt(posicion);
            if (Character.isUpperCase(caracterActual)) {
                // if (caracterActual >= 'A' && caracterActual <= 'Z') {
                Input.print(nombreCompleto.charAt(posicion));
            }
        }
    }
}
