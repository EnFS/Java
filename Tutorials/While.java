package com.enfs;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {


        /* Schleifen:
         * While-Schleife:
         * Wird ausgeführt, solange eine Bedingung erfüllt ist,
         * bzw. wird abgebrochen sobald eine Bedingung unwahr wird.
         */

        /* Bsp.: Benutzer gibt eine Zahl ein.
         * Solange diese größer 10 ist, darf er weitere Zahlen eingeben.
         */

        Scanner eingabe = new Scanner(System.in);
        int zahl = 11; //Muss 11 sein, damit die Bedingung wahr wird (11 > 10)

        /* Zuerst wird die Bedingung in der Klammer überprüft,
         * wenn diese wahr ist wird der darauf folgende Code ausgeführt.
         */
        while (zahl > 10) {
            System.out.println("Bitte geben Sie eine Zahl ein: ");
            zahl = eingabe.nextInt();
        }
        System.out.println("Zahl ist kleiner oder gleich 10. Ende.");

        //---------------------------------------------------------------

        /* Alternative do-while-Schleife
         * Wird benötigt wenn der Code innerhalb der Schleife mindestens
         * einmal ausgeführt werden soll. Dabei ist es egal, ob beim ersten
         * Durchgang die Bedingung wahr oder falsch ist, da erst am Ende die Bedingung
         * geprüft wird.
         */

        //Bsp.:
        zahl = 0; //Bedingung ist momentan falsch
        do {
            System.out.println("Bitte geben Sie eine Zahl ein: ");
            zahl = eingabe.nextInt();
        } while (zahl > 10); //Wenn die Zahl jetzt immernoch kleiner 10 ist, beenden.
        System.out.println("Zahl ist kleiner oder gleich 10. Ende.");
    }
}
