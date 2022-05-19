package dNumericTypes;

import libs.Input;

import java.text.DecimalFormat;


public class EstadiaAreaYCircunferencia {
 //declaramos variables
    static double pi = 3.14;

    //pedimos que se introduzca el valor del radio
    static double radio= Input.get_int("Ingresa el radio del circulo: \n");

    //operaciones
    static double area = Math.pow(radio, 2) * pi;
    static double perimetro = 2*pi*radio;

    public static void main(String[] args) {
        //especificamos que solo nos permita dos cifras despues del punto decimal
        DecimalFormat format = new DecimalFormat("0.00");
        //imprimimos el area con el formato del decimal
        System.out.println("Area: "+ format.format(area));

        //se imprime el perimetro
        System.out.println("Perimetro: "+ format.format(perimetro));
    }

}
