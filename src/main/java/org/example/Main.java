package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        System.out.println((new StringArray().toString()));
//
//        StringArray newString = new StringArray();
//
//        System.out.println(newString.printNumber(3));
//
//        Hundred hundert = new Hundred();
//        hundert.printZahlen();

        Scanner scanner = new Scanner(System.in);

        Woerterbuch wbuch = new Woerterbuch();
        boolean x = true;
        while(x == true) {
            System.out.println("Für weiter = j; Programm stoppen = n");
            String jn = scanner.nextLine();
            switch (jn) {
                case "j":
                    System.out.println("Gib dein wort:");
                    String wort = scanner.nextLine();
                    wbuch.addMethod(wort);

                    break;
                case "n":
                    System.out.println(wbuch.getListe());
                    x = false;
                    break;
                default:
                    System.out.println("die Programm ist beendet");
            }
        }






    }
}