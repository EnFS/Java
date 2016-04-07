
package schleifenkapital;

import java.util.Scanner;

public class SchleifenKapital {

    public static void main(String[] args) {
        double kapital, p;
        int jahre;
        Scanner tastatur = new Scanner(System.in);
        
        
        //Variablen vom Nutzer initialisieren lassen
        System.out.print("Bitte geben Sie das Kapital ein: ");
        kapital = tastatur.nextDouble();
        System.out.print("Bitte geben Sie den Zinssatz in % an: ");
        p = tastatur.nextDouble();
        //p durch 100 um den Faktor zu bekommen
        p /= 100;
        //p + 1 um das Kapital nicht zu veringern
        p += 1;
        System.out.print("Geben Sie die Laufzeit in Jahren ein: ");
        jahre = tastatur.nextInt();
        
        for (int i = 0; i < jahre; i++) {
            kapital = kapital * p;
        }
        kapital = Math.round(kapital);
        System.out.println("Kapital nach " + jahre + " Jahren: " + kapital + "€");
        
        
        
    }
    
}
