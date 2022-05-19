package cVariables;

public class EstadiaSongSinatra {
    static String artist;
    static String country;
    static String title;
    static int durationseccons;
    static String lyrics;

    public static void main(String[] args) {

        /*SONGS BY SINATRA*/
        artist = "Michael Graves";
        title = "Scream";
        durationseccons = 3000;
        lyrics = "The freezing touch of fear";
        System.out.println("Artista: "+artist);
        System.out.println("Titulo: "+title);
        System.out.println("Segundos: "+ durationseccons);
        System.out.println("Letra: "+lyrics);
    }
}
