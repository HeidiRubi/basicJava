package eConditionals;
import libs.Input;


public class EstadiaMinimoMonedas {
    public static void main(String[] args) {
        double cambioTotal = pedirCambio();
        int numeroMonedas = calcularMinimoMonedas(cambioTotal);
        System.out.println(numeroMonedas);
    }

    private static double pedirCambio() {
        double cambio = -1.25;// se repite hasta que entres un alor mayor a cero
        while (cambio < 0){
            System.out.println("Cuanto te debo? ");
            cambio = Input.get_double();
            if (cambio<0){
                System.out.println("Cantidad incorrecta, ingrese numeros positivos");
            }
        }

        return cambio;
    }
    private static int calcularMinimoMonedas(double cambioTotal) {
        int numeroCentavos = (int) (cambioTotal * 100);
        int numeroMonedas = 0;
        int numeroMonedas25 = 0;
        int numeroMonedas10 = 0;
        int numeroMonedas5 = 0;
        int numeroMonedas1;
        numeroMonedas = numeroCentavos / 25;
        numeroCentavos = numeroCentavos % 25;
        numeroMonedas = numeroCentavos / 10;
        numeroCentavos = numeroCentavos % 10;
        numeroMonedas = numeroCentavos / 5;
        numeroMonedas1 = numeroCentavos;
        numeroMonedas = numeroMonedas1 + numeroMonedas5 + numeroMonedas10 + numeroMonedas25;
        numeroMonedas = numeroCentavos / 1;
        numeroCentavos = numeroCentavos % 1;
        System.out.println("Para " + cambioTotal + " se requieren ");
        System.out.println(numeroMonedas25 + " monedas de 25c");
        System.out.println(numeroMonedas10 + " monedas de 10c");
        System.out.println(numeroMonedas5 + " monedas de 5c");
        System.out.println(numeroMonedas1 + " monedas de 1c");
        return numeroMonedas;
    }
}

