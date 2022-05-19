package cVariables;

public class EstadiaInfoquePocesa {

    /*AMAZON*/
    static String nombreProducto;
    static double calificacionGlobal;
    static String descripcionProducto;
    static double precioProducto;
    static String detallesProducto;
    static String resenaproducto;

    /*FACEBOOK LOGIN*/
    static int numerotelefono;
    static String contrasena;

    /*SONGS BY SINATRA*/
    static String artist;
    static String country;
    static String title;
    static int durationseccons;
    static String lyrics;


    public static void main(String[] args) {
        /*AMAZON*/
        nombreProducto = "Kirby and the Forgotten Land - Standard Edition - Nintendo Switch";
        calificacionGlobal = 4.9;
        descripcionProducto ="Únete a Kirby en una travesía inolvidable a través de un misterioso mundo en esta encantadora aventura de plataformas en 3D";
        precioProducto = 1199;
        detallesProducto ="Fecha de lanzamiento \u200F : \u200E 25 marzo 2022";

        resenaproducto = "\tRodrix 778\n" +
                "5.0 de 5 estrellas INCRÍBLE JOYA\n" +
                "Revisado en México el 29 de marzo de 2022\n" +
                "Compra verificada\n" +
                "Pues es un juegazo, de los pocos que sientes que sí valieron esos 1400 pesos.\n" +
                "Apto para todos pero con reto y dificultad para quienes buscamos.\n" +
                "Imagen del cliente";
        System.out.println(nombreProducto);
        System.out.println(precioProducto);

        /*FACEBOOK LOGIN*/
        numerotelefono = 81823444;
        contrasena = "hola12uu";

        /*SONGS BY SINATRA*/
        artist = "Michael Graves";
        title = "Scream";
        durationseccons = 3000;
        lyrics = "The freezing touch of fear";

        }
    }

