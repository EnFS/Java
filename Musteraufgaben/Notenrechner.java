/* Aufgabenstellung:
 * Der Mittelwert zweier Zahlen soll eingegeben werden
 * - Noten sollen reelle Zahlen sein
 * - Wenn eine der Zahlen keine Note ist soll das Programm sofort beendet werden
 * - Wenn beide Zahlen Noten sind, soll "Der Mittelwert ihrer Noten ist: ..." ausgegeben werden.
 *
 * Zusatz:
 * - In Abhängigkeit der Eingabe sollen die Fehlermeldungen
 *   "Die 1. eingegeben Zahl ist keine Note" oder
 *   "Die 2. eingegeben Zahl ist keine Note"
 *   ausgegeben werden
 */





package com.enfs;

import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {

        //Variablen definieren
        double wert1, wert2, mittelwert;    //double wegen reellen Zahlen
        String ausgabe;

        //Eingabe initialisieren
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Geben Sie nacheinander Ihre beiden Noten ein und bestätigen Sie diese mit der Enter-Taste.");

        //Eingabe von Note 1
        System.out.println("Note 1: ");
        wert1 = eingabe.nextDouble();

        /* Verzweigung mit zwei Bedingungen
         * Verknüpfung mit && (logisches UND),
         * damit sich die Zahl nur im gewünschten Bereich befinden kann
         */
        if (wert1 >= 1 && wert1 <= 6) {
            //Note 1 zwischen 1 und 6

            //Eingabe von Note 2
            System.out.println("Note 2: ");
            wert2 = eingabe.nextDouble();

            /* Zweite Note wird überprüft
             * mit selber Bedingung wie erste Note
             */
            if (wert2 >= 1 && wert2 <= 6) {
                //Note 2 zwischen 1 und 6

                //Verarbeitung
                //Wird nur ausgeführt wenn wert1 und wert2 Noten sind
                mittelwert = (wert1 + wert2) / 2;
                ausgabe = "Der Mitelwert ihrer Noten ist " + mittelwert + ".";

            } else {
                //wert2 außerhalb des Bereichs
                //Wird nur ausgeführt bei Fehler
                ausgabe = "Die zweite Zahl ist keine Note";
            }

        } else {
            //wert1 außerhalb des Bereichs
            //Wird nur ausgeführt bei Fehler
            ausgabe = "Die erste Zahl ist keine Note";
        }

        //Ausgabe
        //Wird in jedem Fall ausgeführt
        System.out.println(ausgabe);
    }
}
