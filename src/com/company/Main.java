package com.company;

public class Main {

    public static void main(String[] args) {

        String example = "Hello World, it's world of RegExp";
        System.out.println("Czy tekst zawiera słowo: 'World': " + example.matches("World"));
        System.out.println("Czy teskt zawiera słowo 'World':" + example.matches(".*World*."));
        System.out.println("Czy tekst zawiera literę 'a': " + example.matches(".*a") );
        System.out.println("Czy tekst zawiera literę 'o':" + example.matches(".*o?"));





    }

}
