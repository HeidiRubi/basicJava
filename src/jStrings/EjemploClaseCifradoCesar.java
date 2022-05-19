package jStrings;

public class EjemploClaseCifradoCesar {
    public static void main(String[] args) {
        int clave = 5;
        String nombre = "Heidi";
        for(int posicion = 0; posicion < nombre.length(); posicion++){
            char actual = nombre.charAt(posicion);
            int numeroActual = actual + clave;
            if (numeroActual > 90){
                numeroActual= numeroActual -26;
            }
            char letraActual =(char) numeroActual;
            System.out.println(letraActual);
        }
    }
}
