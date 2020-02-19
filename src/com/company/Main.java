package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Przykład szukania znaków słów w tekście
        String example = "Hello World, it's world of RegExp";
        System.out.println("Czy tekst zawiera słowo: 'World': " + example.matches("World"));
        System.out.println("Czy teskt zawiera słowo 'World':" + example.matches(".*World*."));
        System.out.println("Czy tekst zawiera literę 'a': " + example.matches(".*a") );
        System.out.println("Czy tekst zawiera literę 'o':" + example.matches(".*o?"));

        //Przykład zamiany sowa w tekście
        System.out.println("Zamiana słoawa 'World' na 'mooo': " + example.replace("World", "mooo"));
        System.out.println("Zamiana wszystkich liter 'o' na 'a': " + example.replace('o', 'a'));

        //Przykład zamiana wszystkich słów World i world na mooo
        System.out.println("Zamiana wszystkich słów 'World' i 'world' na 'mooo' :" + example.replaceAll("[Ww]orld","mooo"));

        //Podział tekstu na poszczególne wyrazy
        String[] spilittekst = example.split(" ");
        System.out.println("Wynikowa tabica po podziale na znaku spacji" + Arrays.toString(spilittekst));
        String[] splittext2 = example.split(",");
        System.out.println("Wynikowa tablica po podziale na znaku ','" + Arrays.toString(splittext2));
    }

}
