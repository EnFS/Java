package pyramide;

import java.util.Scanner;


public class Pyramide {

    public static void main(String[] args) {
        
        int anzahl = 0, leerzeichen = 0;
        String zeichen = "*";
        String out = "";
        Scanner inp = new Scanner(System.in);
        System.out.println("Geben sie die Anzahl der Schichten ein: ");
        anzahl = inp.nextInt();
        
        
        for (int i = 0; i < anzahl; i++) {
            leerzeichen = anzahl - i;
            for (int y = 0; y < leerzeichen; y++) {
                out += " ";
            }
            for (int z = 1; z < i * 2; z++) {
                out += zeichen;
            }
            out += "\n";
        }
        System.out.println(out);
        
    }
    
}
