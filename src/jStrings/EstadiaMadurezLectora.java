package jStrings;

import libs.Input;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;

public class EstadiaMadurezLectora {

    static public int countSyllables(String s) {
        int counter = 0;
        s = s.toLowerCase(); // converting all string to lowercase
        if (s.contains("the ")) {
            counter++;
        }
        String[] split = s.split("e!$|e[?]$|e,|e |e[),]|e$");

        ArrayList<String> al = new ArrayList<String>();
        Pattern tokSplitter = Pattern.compile("[aeiouy]+");

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            Matcher m = tokSplitter.matcher(s1);

            while (m.find()) {
                al.add(m.group());
            }
        }

        counter += al.size();
        return counter;
    }

    public static void main(String[] args) throws IOException {
        int cantidadpuntos = 0;
        String myStr = Input.get_string("Texto: ");
        String[] words = myStr.split("\\s+");
        String line = System.getProperty("line.separator");
        System.out.println("\nPalabras: " + words.length);
        int stringLengthWithoutSpaces = myStr.replace(" ", "").length();
        System.out.println("Letras: " + stringLengthWithoutSpaces);
        StringTokenizer tokenizer = new StringTokenizer(myStr, line);
        System.out.println("Hay " + tokenizer.countTokens() + " cadenas entre saltos de linea ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        myStr = br.readLine();

        String ans = "Regal";
        System.out.println("syllables for string " + ans + " is " + countSyllables(ans));
        String[] palabras = myStr.split(" ");


        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == '.') cantidadpuntos++;
        }
        System.out.println("Parrafos: " + cantidadpuntos);


        int[] POINTS = {90 - 100, 80 - 90, 70 - 80, 60 - 70, 50 - 60, 30 - 50, 1 - 30};
        String[] grados = {"Prescolar", "Primaria", "Escolar", "Educacion basica", "Bachiller", "Profesional", "Posgrado"};


       /* for (int i = 0; i < POINTS.length(); i++) {
            if (myStr >= POINTS[i]) {
                grados[i] = Math.floor(myStr / POINTS[i]);

                myStr = myStr - (grados[i] * POINTS[i]);

            }
        }

        for (int i = 0; i < POINTS.length; i++) {
            if (grados[i] > 0) {
                if (POINTS[i] > 2) {
                    System.out.println("Grado: " + POINTS);
                }*/
            }
        }
    //}
//}
 /*Texto: Harry Potter was a highly unusual boy in many ways. For one thing, he hated the summer holidays more than any other
time of year. For another, he really wanted to do his homework, but was forced to do it in secret, in the dead of the night.
 And he also happened to be a wizard.
Grado: 5 Primaria
El texto tiene 214 letras, 4 oraciones y 56 palabras, o  382.14 letras por cada 100 palabras, y 7.14 oraciones por 100
palabras.  Por la fórmula de Coleman-Liau, obtenemos 5o Grado de comprensión lectora.
*/// Points assigned to each letter of the alphabet int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};


// public class Main {
// 0.0588 * line - 0.296 * s - 15.8;
// for (int i = myStr)
