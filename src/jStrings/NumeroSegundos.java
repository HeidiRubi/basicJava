package jStrings;

import libs.Input;

public class NumeroSegundos {
    public static void main(String[] args) {
        String tiempoMinutosSegundos = pedirMinutosSegundos();
        mostarSegundos(tiempoMinutosSegundos);
    }

    private static String pedirMinutosSegundos() {
        boolean formatoCorrecto = false;
        String minSegs="";
        while (!formatoCorrecto) {
            System.out.println("Dame la duracion del video en formato mm:ss ");
            String temp = Input.get_string();
            if(temp.contains(":") && temp.split(":").length ==2){
                String[] partes = temp.split(":");
                if(esNumerico(partes[0]) && esNumerico(partes[1]) && esValido(partes[0]) && esValido(partes[1])){
                    minSegs = temp;
                    formatoCorrecto = true;
                }else{
                    System.out.println("El formato mm:ss esta incorrecto");
                }

            }else{
                System.out.println("El formato mm:ss esta incorrecto");
            }

        }
        return minSegs;
    }

    private  static boolean esValido(String parte){
        int num = Integer.parseInt(parte);
        return num >=0 && num <= 59;
    }
    private static boolean esNumerico(String parte){
        try {
            Integer.parseInt(parte);
            return true;
        }catch(NumberFormatException d){
            System.out.println(parte + " no es numerico");
            return false;
        }
    }

    private static void mostarSegundos(String tiempoMinutoSegundos){
        int numSegundos = Integer.parseInt(tiempoMinutoSegundos.split(":")[0]) * 68 + Integer.parseInt(tiempoMinutoSegundos.split(":")[1]);
        System.out.println("El video dura " + numSegundos +  " segundos");
    }
}