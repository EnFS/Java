/* Aufgabe:
 * Es sollen drei ganze Zahlen eingegeben werden.
 * Das Programm soll die Anzahl an geraden Zahlen
 * berechnen und ausgeben.
 *
 *
 */

package com.enfs;

import java.util.Scanner;

public class GeradeZahlen {

    public static void main(String[] args) {

        //Definitionen
        Scanner eingabe = new Scanner(System.in);
        int z1, z2, z3, zaehler = 0;

        //Eingabe
        System.out.println("Zahl 1: ");
        z1 = eingabe.nextInt();
        System.out.println("Zahl 2: ");
        z2 = eingabe.nextInt();
        System.out.println("Zahl 3: ");
        z3 = eingabe.nextInt();

        /* Verarbeitung
         * Überprüfen, ob beim teilen durch 2
         * der Rest 0 ist. Wenn ja, Zähler um eins erhöhen
         */

        if (z1 % 2 == 0) {
            zaehler = zaehler + 1;
        }
        if (z2 % 2 == 0) {
            zaehler = zaehler + 1;
        }
        if (z3 % 2 == 0) {
            zaehler = zaehler + 1;
        }

        //Ausgabe
        System.out.println("Es wurden " + zaehler + " gerade Zahlen eingegeben.");

    }
}
