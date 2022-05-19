package jStrings;

public class EjemploClaseDescifrado {
    public static void main(String[] args) {
        String cifrado = "MTQF HTRT JXYFX?";
        int clave = 5;

        for (int i = 1; i < 25; i++) {
            decifraMensaje(cifrado, i);
        }
    }
    private static void decifraMensaje(String cifrado, int clave ) {
            for(int posicion = 0; posicion< cifrado.length(); posicion++){
                char actual = cifrado.charAt(posicion);
                if(actual>= 'A' && actual <= 'z'){
                    int numeroActual= actual - clave;
                    if(numeroActual < 65){
                        numeroActual=numeroActual + 26;
                    }
                    char letrasActual = (char) numeroActual;
                    System.out.println(letrasActual);
                }else {
                    System.out.println(actual);
                }
            }
            System.out.println();
        }
    }
