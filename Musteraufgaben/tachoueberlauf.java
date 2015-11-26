/*
    Aufgabenstellung:
    Erstelle ein Programm, welches den Benzinverbrauch eines Autos auf 100 Kilometer berechnet.
    Eingabewerte für den Benutzer sollen sein:
       - Tachostand in Kilometer vor Fahrtantritt,
       - Tachostand in Kilometer nach Fahrtende,
       - Verbrauchte Benzinmenge in Liter.
    Beachte, dass der Tacho nur drei Dezimalstellen anzeigt (000km-999km), das Auto pro Tankfüllung aber
    über 1000km fahren kann.

    Verwende dabei sinnvolle Datentypen (soweit erlernt) und IF-Anweisung(en).

    Problem:
    Das Programm muss anhand der Kilometerstände automatisch ermitteln, ob ein Tachoüberlauf stattfand.
    Tachoüberlauf bedeutet in diesem Fall, dass der Tacho während der Fahrt von 999km auf 000km oder mehr
    gegangen ist. Beispiel: Vor Fahrtantritt stand der Tacho bei 950km, nach der Fahrt dann bei 150km.
*/

import java.util.Scanner;

public class tachoueberlauf {

    public static void main(String[] args) {

        /* Verwendung des Datentyps 'double' */
        double tachostandVorFahrt, tachostandNachFahrt, gefahreneKm, benzinverbrauch, benzinverbrauchPro100Kilometer;

        Scanner tastatur = new Scanner(System.in);

        /* Eingabe Tachostand vor Fahrtantritt */
        System.out.println("Tachostand in Kilometern vor der Fahrt: ");
        tachostandVorFahrt = tastatur.nextDouble();

        /* EIngabe Tachostand nach Fahrtende */
        System.out.println("Tachostand in Kilometern nach der Fahrt: ");
        tachostandNachFahrt = tastatur.nextDouble();

        /* Eingabe der bei der Fahrt verbrauchten Benzinmenge */
        System.out.println("Benzinverbrauch in Liter: ");
        benzinverbrauch = tastatur.nextDouble();

        /* Wir prüfen ob ein Tachoüberlauf stattgefunden haben muss und korrigieren
           gegebenenfalls den 'tachostandNachFahrt'. Andernfalls funktioniert die nachfolgende Rechnung nicht. */
        if (tachostandNachFahrt < tachostandVorFahrt) {
            tachostandNachFahrt = tachostandNachFahrt + 1000;
        }

        /* Berechnung der gefahrenen Strecke. Diese Rechnung darf nie negative Ergebnisse bringen.
           Daher der vorherige Check auf einen möglichen Tachoüberlauf. */
        gefahreneKm = tachostandNachFahrt - tachostandVorFahrt;

        /* Mit der gefahrenen Strecke und dem Gesamtverbrauch an Benzin kann der Benzinerbrauch
           pro 100km berechnet werden. */
        benzinverbrauchPro100Kilometer = (benzinverbrauch / gefahreneKm) * 100;

        /* Ausgabe der Ergebnisse. */
        System.out.println("Das Auto verbrauchte " + benzinverbrauchPro100Kilometer + " Liter pro 100km.");
        System.out.println("Der Wert wurde über eine Fahrtstrecke von " + gefahreneKm + "km bei einem Gesamtverbrauch" +
                " von " + benzinverbrauch + "l Benzin ermittelt.");

    }
}