package com.enfs;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        /* Switch:
         * Wird verwendet, wenn es mehrere definierte Werte/Fälle für eine Variable gibt.
         * Z.B.: Ein Programm bekommt zur besseren Bedienbarkeit ein Auswahlmenü.
         * Dabei gibt es 5 Menüpunkte.
         *
         * Erste Möglichkeit:
         * Jeden Zustand mit if-Abfragen überpüfen. Man braucht also 5 If-Abfragen.
         * Das wird schnell unübersichtlich, deshalb gibt es dafür die Funktion switch.
         */

        //Eingabe initialisieren
        Scanner tastatur = new Scanner(System.in);

        //Nun sollen zwei Zahlen zur Berechnung eingegeben werden.
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int z1 = tastatur.nextInt();
        System.out.println("Bitte geben Sie noch eine Zahl ein: ");
        int z2 = tastatur.nextInt();
        int ergebnis = 0; //Variable in die das Ergebnis geschrieben wird.

        //Menü anzeigen
        System.out.println("Auswahl Menü:");
        System.out.println("Addieren(1)");
        System.out.println("Subtrahieren(2)");
        System.out.println("Dividieren(3)");
        System.out.println("Multiplizieren(4)");
        System.out.println("Beenden(5)");
        System.out.println("Bitte geben Sie die gewünschte Zahl ein: ");


        //Zahl abfragen
        int auswahl = tastatur.nextInt();

        /* Hier wird jetzt die Variable auswahl abgefragt.
         * Dabei darf nur die Variable in der Klammer stehen,
         * also keine Bedingung wie bei If.
         *
         * Ein Fall wird mit case x: eingeleitet und mit break; beendet.
         */

        switch (auswahl) {
            case 1:
                ergebnis = z1 + z2;
                break;
            case 2:
                ergebnis = z1 - z2;
                break;
            case 3:
                ergebnis = z1 / z2;
                break;
            case 4:
                ergebnis = z1 * z2;
                break;
            case 5:
                System.exit(0);
                break;
            default: //Wenn keine der Fälle zutrifft wird ddefault ausgeführt
                System.out.println("Fehler. Falsche Auswahl.");
                ergebnis = 1337;
                break;
        }
        //Ausgabe der Berechnung
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }
}
