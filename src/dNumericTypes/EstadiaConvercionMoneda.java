package dNumericTypes;
import java.util.Scanner;
import java.text.DecimalFormat;
import libs.Input;
public class EstadiaConvercionMoneda {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("00.#");
        Scanner sc = new Scanner(System.in);

        double dolares = Input.get_double("Ingrese la cantidad en dolares: ");

        do {

            if (dolares > 0) {
                double cambio = Input.get_double("Ingrese el tipo de cambio: ");
                double pesos = dolares * cambio;
                System.out.println(format.format(dolares) + " USD son " + pesos + " en tu moneda");
                break;
            } else {
                System.out.println("Error, el numero debe de ser positivo");

            }
            dolares = 0;
            Input.get_double("Ingrese la cantidad en dolares: ");
            double cambio = Input.get_double("Ingrese el tipo de cambio: ");

              if(cambio < 0) {
                        System.out.println("Error, el tipo de cambio debe de ser positivo");
                    }
        }while (dolares > 0) ;
    }
}


