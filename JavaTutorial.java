

//Das ist ein einzeiliger Kommentar

/*
Das hier
ist ein
mehrzeiliger Kommentar
 */

public class JavaTutorial {     //Klasse mit dem Namen Main wird erstellt und in den folgenden Zeilen mit Inhalt befüllt

    public static void main(String[] args) {        //"Main" - Methode wird immer beim Programmstart aufgerufen
        /* Datentypen für Variablen:
         * Der Inhalt den eine Variable haben kann muss vordefiniert werden.
         * Variablennamen sollten mit einem kleinen Buchstaben anfangen.
         * Er darf Zahlen enthalten, muss aber am Stück geschrieben werden.
         * Bsp.:
         * Gültig: tESt1
         * Ungültig: t es t 1
         *
         */

        //Wichtige Datentypen

        /* Integer oder kurz int:
         * Mit diesem Datentypen wird eine Ganzzahl definiert
         * Vorsicht: Beim speichern von Kommazahlen in einen Ganzzahl Datentypen
         * werden alle Kommastellen abgeschnitten und es wird nicht gerundet
         * Syntax:
         */


        int ganzzahl;
        int dasIstAuchEineGanzzahl = 1; //Ein Wert kann auch direkt zugewiesen werden
        int z1, z2, z3 = 5, z4 = 0; //Es können auch mehrere Zahlen auf einmal definiert werden (mit Komma getrennt)


        /* double:
         * Diesem Datentypen können Kommazahlen zugewiesen werden
         * Wichtig: Kommazahlen werden in Java mit Punkt anstelle mit einem Komma getrennt
         * Bsp.:
         * Richtig: 1.5
         * Falsch: 1,5
         * Syntax:
         */

        double kommazahl;
        double kommzahlMitWert = 0;
        double d1, d2, d3 = 2, d4 = 13.37;

        /* String:
         * Dieser Datentyp kann Zeichenketten enthalten.
         * Dabei ist es egal, ob es Buchstaben oder Zahlen sind.
         * Es kann nur nicht direkt damit gerechnet werden.
         * Vorsicht: Der Datentyp String muss mit einem großen S geschrieben werden.
         * Syntax:
         */

        String zeichenkette;
        String zeichenketteMitWert = "Hallo 1234"; //Anführungszeichen stehen für eine Zeichenkette
        String zk1 = "Hallo", zk2 = "Welt", zk3 = ""; //"" --> Nichts wird angezeigt. Wird zum leeren eines Strings genutzt.


        /**********************************************************************/

        //Grundrechenarten:

        //Addition von Zahlen. Genauso mit Variablen möglich
        z1 = 2 + 3 + 2; //z1: 7

        //Subtraktion
        z2 = 7 - 5 - 3; //z2: -1

        //Multiplikation
        kommazahl = 1.2 * 3.5; //kommazahl: 4,2

        //Division
        kommazahl = 5.5 / 3.1; //kommazahl: 1,774193548387097 ;)

        //Modulo (Teilen mit Rest)
        z3 = 5 % 2; //z3: 1


        /* Zahlen inkrementieren (hochzählen)
         * Dies wird später oft in Schleifen benötigt,
         * um z.B. zu überprüfen wie oft ein Vorgang schon ausgeführt wurde
         */

        z1 = z1 + 1;
        //Kurzschreibweise
        z1++;

        //Zahlen dekrementieren
        z1 = z1 - 1;
        //Kurzschreibweise
        z1--;

        /* Vergleichsoperatoren
         * a > b --> Größer Zeichen
         * a < b --> Kleiner Zeichen
         *
         * a >= b --> Größer oder gleich Zeichen
         * a <= b --> Kleiner oder gleich Zeichen
         * Vorsicht: Das = Zeichen muss immer hinter dem Größer/kleiner Zeichen stehen
         * Richtig: a >= b
         * Falsch: a => b
         *
         * a == b --> Gleich Zeichen (2x = --> Vergleich; 1x = --> Zuweisung)
         * a != b --> Ungleich Zeichen
         *
         * Vorsicht beim vergleichen von Strings:
         * Strings sollten nicht mit == verglichen werden, da dies zu Fehlern führen kann.
         * Lösung:
         * a.equals(b) --> Vergleiche ob a und b gleich sind
         * !a.equals(b) --> Vergleiche ob a und b ungleich sind
         */

        /* If - Verzweigung
         * Gebrauch:
         * If wird benötigt, wenn ein Code nur zu einer bestimmten Bedingung ausgeführt werden soll.
         * Die Bedingung muss also erfüllt (wahr) sein, damit der kommende Abschnitt ausgeführt wird.
         * Bsp. in Textform:
         * Problem: Die ersten 100 Leute bei einer Ladeneröffnung sollen ein Werbegeschenk erhalten.
         * Lösung im Programm:
         * Wenn personenZaehler kleiner oder gleich 100,
         * dann verteile Werbegeschenk.
         *
         * Syntax:
         */

        int personenZaehler = 0;

        personenZaehler++; //Personen werden gezählt

        if (personenZaehler <= 100) {
            //Person bekommt ein Geschenk (Wird nur ausgeführt wenn Bedingung wahr ist)
        }

        /* If - else - Verzeigung
         * Gebrauch:
         * If else wird benötigt, wenn eine bestimmte Bedingung ausgeführt werden soll.
         * Ist diese Bedingung jedoch falsch, soll (nur dann) ein anderer Code ausgeführt werden.
         * Bsp. in Textform:
         * Problem: Bei einer Verlosung sollen die Gewinner einen Preis erhalten und die Verlierer
         * eines Trostpreis bekommen.
         * Lösung im Programm:
         * Wenn gewinner gleich 1 ist,
         * dann erhält er einen Preis.
         * Ansonsten
         * erhält er einen Trostpreis.
         *
         * Syntax:
         */

        int gewinner;

        //Verlosung startet --> Gewinner wird bestimmt
        gewinner = 1;

        if (gewinner == 1) {
            //Preis wird ausgeteilt
        } else {
            //Trostpreis wird ausgeteilt
        }

        //To be continued
    }
}
