package jStrings;
import libs.Input;

import java.util.StringTokenizer;
public class Prueba {
    public static void main(String arg[]) {
        String myStr = Input.get_string("Texto: ");
        String[] words = myStr.split("\\s+");
        String line = System.getProperty("line.separator");
        String demo = "hola mundo " + line + " esto " + line + " es " + line + " un " + line + " ejemplo";
        System.out.println("Original: " + demo);
        System.out.println("Sin saltos: " + demo.replace(line, "")); //reemplaza el salto de line por nada, es decir lo elimina
        StringTokenizer tokenizer = new StringTokenizer(demo, line); //creo un tokenize con la cadena y como delimitador el salto de linea

        System.out.println("Hay " + tokenizer.countTokens() + " cadenas entre saltos de linea "); //numero de cadenas
        /*Texto: Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other
time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night.
 And he also happened to be a wizard.
Grado: 5 Primaria
El texto tiene 214 letras, 4 oraciones y 56 palabras, o  382.14 letras por cada 100 palabras, y 7.14 oraciones por 100
palabras.  Por la fórmula de Coleman-Liau, obtenemos 5o Grado de comprensión lectora.
*/// Points assigned to each letter of the alphabet int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        //0.0588 *  - 0.296 * s - 15.8;

    }

}
