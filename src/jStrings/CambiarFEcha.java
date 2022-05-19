package jStrings;

import libs.Input;

public class CambiarFEcha {
    public static void main(String[] args) {
        String fecha = Input.get_string("Introduce una fecha dia/mes/anio: ");
        String[] fechanospaces= fecha.split ("/");

        int numeroDia = Integer.parseInt(fechanospaces[0]);
        int numeroMes = Integer.parseInt(fechanospaces[1]);
        int numeroAnio = Integer.parseInt(fechanospaces[2]);
        if(numeroMes >= 1 && numeroMes <=12 && numeroDia >= 1 && numeroDia <=30){
            System.out.println("Dia: "+ fechanospaces[0]);
            System.out.println("Mes: "+ fechanospaces[1]);
            System.out.println("Anio: "+ fechanospaces[2]);
        }else{
            System.out.println("La fecha esta equivocada " + fecha);
        }

    }

}
