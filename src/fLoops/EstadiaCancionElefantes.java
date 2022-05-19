package fLoops;

public class EstadiaCancionElefantes {
    /*Escriba un programa que escriba la letra de la cancion de los elefantes,
    hasta que sean 100 elefantes.

            Ejemplo:

            1 elefante se columpiaba sobre la tela de una araña,
    como veia que resistia, fue a llamar a otro elefante

2 elefantes se columpiaban sobre la tela de una araña,
    como veian que resistia, fueron a llamar a otro elefante.*/

    public static void main(String[] args) {

        int numeroElefantes = 100;


        System.out.println("un elefante se columpiaba sobre la tela de una araña, como veia que resistia, fue a llamar a otro elefante");


        for (int i = 2; i < 101; i++) {

            String letra = " elefantes se columpiaban sobre la tela de una araña, como veian que resistia, fueron a llamar a otro elefante";

            System.out.println(i + letra);
        }
    }

}
