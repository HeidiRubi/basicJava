package fLoops;

import libs.Input;

public class Ciclos {

	public static void main(String[] args) {
		//imprimir numeros del 0 al 10 (0  1  2  3  4  5  6  7  8  9  10)
		int numero  = 0;
		while(numero <= 10) {
			Input.print(numero);
			Input.print("  ");
			numero += 1;
		}
		Input.print("\n");
		//imprimir la cuenta regresiva de un cohete,  cuando llegue a cero, diga 'despegar'
		numero=10;
		while (numero >= 0) {
			if(numero == 0) {
				Input.print("que tragon eres");
				
			}
			else {
				Input.print(numero);
				Input.print("  ");
				
			}
			numero -= 1;
		}

		Input.print("\n");

	System.out.println("Cuantas repeticiones quieres? ");
		int numeroRepeticiones = Input.get_int();
		for(int i = 0; i < numeroRepeticiones; i++) {
			hagoAlgo();
		}
	}

	private static void hagoAlgo() {
		System.out.println("repeticion");
	}


}
