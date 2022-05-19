package fLoops;

import libs.Input;

public class EstadiaMarioDificil {
    public static void main(String[] args) {

            System.out.println("Altura: ");
            int altura = Input.get_int();
            if (altura > 1){
                String r = "";
                for(int i = 1; i <= altura; i++){
                    int espacio = altura - i;
                    for(int j = 0; j < espacio; j++){
                        r = r + " ";
                    }
                    int hashtag = 1;
                    for(int k = 0; k < hashtag; k++){
                        r =r +"#";

                    }
                    r = r+ "  ";
                    hashtag = i;
                    for(int k = 0; k< hashtag; k++){
                        r=r+"#";
                    }
                    System.out.println(r+"  ");
                    r = "";
                }
            }
        }
    }

