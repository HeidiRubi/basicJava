package mArrays;

import libs.Input;

import java.util.Arrays;

public class EstadiaEFindDificil {
    public static void main(String[] args) {
        int numeros[] = {11195,49145,6315,57046,37834,51498,45363,24167,57272,48830,29232,23181,48006,17053,25840,50907,55380,37734,46893,5439,29872,7205,35732,25604,37262,62853,56866,10694,18055,17063,60561,28568,51738,8363,5387,61645,1676,10106,25046,10140,34690,57465,28220,17295,20551,50468,7037,50531,46215,14328,49924,26982,42521,60945,32926,45052,28579,39865,37785,41459,30371,41434,9063,62964,9461,29273,21271,62428,23473,26096,6637,62592,64527,37746,56748,9822,59582,42680,4185,62586,63324,51481,52767,37437,18519,63081,37976,28629,24604,60516,1880,50388,47389,38729,27911,42083,48939,4523,3492,50745};
        int numberoABuscar= Input.get_int("Introduzca un numero 5 cifras: ");
        Arrays.sort(numeros);
        if (Arrays.binarySearch(numeros, numberoABuscar)>0)
            System.out.println("El numero " + numberoABuscar + " SI se encuentra en el arreglo");
        else
            System.out.println("El numero " + numberoABuscar + " NO está en el arreglo");
    }
}
