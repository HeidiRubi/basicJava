package jStrings;

import libs.Input;

public class EstadiaSegundosReproduccion {

    public static void main(String[] args) {
        String duracion = Input.get_string("Duracion del video mm:ss: ");
        String[] duracionvideo = duracion.split(":");

        int duracionminutos = Integer.parseInt(duracionvideo[0]);
        int duracionsegundos = Integer.parseInt(duracionvideo[1]);
        int operacion = duracionminutos * 60 + duracionsegundos;
        if (duracionminutos > 0) {

            System.out.println("El video dura " + operacion + " segundos.");
        } else {
            System.out.println("Solo se admiten numeros positivos.");
        }
        //se podria hacer otro para un erros de formato
        //if(tiempo.contains(:)){
        // String[] tiempoParte = tiempo.split(":");
        //try{
        // int minutos = parseInt(tiempoParte[0]));
        // int segundos = parseInt(tiempoParte[1]));
        //sout("El video dura " + (minutos*60+segundos)+ " segundos")
        // }catch (NumberFormaatException e){
        //sout("formato debe contener num ")
        //}

        // } else{
        // sout("formato incorrecto");
        // }
    }
}
