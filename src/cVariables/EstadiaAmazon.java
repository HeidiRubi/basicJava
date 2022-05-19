package cVariables;

public class EstadiaAmazon {
    static String nombreProducto;
    static double calificacionGlobal;
    static String descripcionProducto;
    static double precioProducto;
    static String detallesProducto;
    static String resenaproducto;


    public static void main(String[] args) {
        /*AMAZON*/
        nombreProducto = "Kirby and the Forgotten Land - Standard Edition - Nintendo Switch";
        calificacionGlobal = 4.9;
        descripcionProducto = "Unete a Kirby en una travesia inolvidable a traves de un misterioso mundo en esta encantadora aventura de plataformas en 3D";
        precioProducto = 1199;
        detallesProducto = "Fecha de lanzamiento : 25 marzo 2022\n";

        resenaproducto = "\tRodrix 778\n" +
                "5.0 de 5 estrellas INCRIBLE JOYA\n" +
                "Revisado en Mexico el 29 de marzo de 2022\n" +
                "Compra verificada\n" +
                "Pues es un juegazo, de los pocos que sientes que si valieron esos 1400 pesos.\n" +
                "Apto para todos pero con reto y dificultad para quienes buscamos.\n";
        System.out.println(nombreProducto);
        System.out.println(calificacionGlobal);
        System.out.println(descripcionProducto);
        System.out.println(precioProducto);
        System.out.println(detallesProducto);
        System.out.println(resenaproducto);
    }
}
