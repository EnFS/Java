package com.enfs;

/* Barnian
 * Only using while, do..while, for, if, scanner, println and variables
 * Only one method (main method) allowed
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Init
        Scanner input = new Scanner(System.in);
        boolean drunkmode = false;
        String inpString = "";
        boolean login = false;
        int emptycounter = 0;

        //Sysinfo
        String barnian = "Barnian 1.0";

        //Start

        //bootup
        System.out.println("Booting....");
        System.out.println("Setting up Java VM");
        System.out.println("That's it!");
        System.out.println("Nice and fast Barnian boot!\n\n\n");

        //Welcome Message
        System.out.println(barnian + " Alles geht mit Java und while!\n");

        while (!inpString.equals("exit")) {

            if (!login) {
                boolean correct = false;
                do {
                    System.out.println("Benutzername: ");
                    String name = input.nextLine();
                    System.out.println("Passwort: ");
                    String pw = input.nextLine();
                    if (name.equals("barner") && pw.equals("bier")) {
                        correct = true;
                        login = true;
                        System.out.println("Anmeldung erfolgreich!");
                    } else {
                        System.out.println("Anmeldung fehlgeschlagen.\nBitte rasieren Sie einen Affen und probieren es erneut.\n");
                    }
                } while(correct != true);
            } //end login

            //Main screen
            System.out.println("barner@Barnian ~ $ ");
            inpString = input.nextLine();


            //Funktionen

            //switch drunkmode on and off
            if (inpString.equals("drunk")) {
                if (drunkmode) {
                    drunkmode = false;
                } else {
                    drunkmode = true;
                }
                System.out.println("Drunkmode: " + drunkmode);
            }

            //Addition
            if (inpString.equals("plus")) {
                double z1 = 0, z2 = 0;
                if (drunkmode) {
                    System.out.println("Zaaaaahl: ");
                    z1 = input.nextDouble();
                    System.out.println("Nivea Creme: ");
                    z2 = input.nextDouble();
                    int rnd = (int) ((Math.random() * 49) + 1);
                    System.out.println("Bier: " + (z1 + z2 + rnd));
                } else {
                    System.out.println("Zahl 1: ");
                    z1 = input.nextDouble();
                    System.out.println("Zahl 2: ");
                    z2 = input.nextDouble();
                    System.out.println("Ergebnis: " + (z1 + z2));
                }
            } //End addition

            //Subtraktion
            if (inpString.equals("minus")) {
                double z1 = 0, z2 = 0;
                if (drunkmode) {
                    System.out.println("Zaahl: ");
                    z1 = input.nextDouble();
                    System.out.println("18 Bier: ");
                    z2 = input.nextDouble();
                    int rnd = (int) ((Math.random() * 9) + 1);
                    System.out.println("Bier: " + (z1 - z2 - rnd));
                } else {
                    System.out.println("Zahl 1: ");
                    z1 = input.nextDouble();
                    System.out.println("Zahl 2: ");
                    z2 = input.nextDouble();
                    System.out.println("Ergebnis: " + (z1 - z2));
                }
            } //End subtraktion

            if (inpString.equals("info")) {
                System.out.println(barnian + "\nKernel: While/DoWhile, weil mehr kann man den Prozessor net auslasten.");
                System.out.println("Hostname: B138-Barner\nIP: N/A\nBrain: N/A\nGateway: Rückenmark\n");
            }

            if (inpString.equals("hostname")) {
                System.out.println("B138-Barner");
            }

            if (inpString.equals("breakfast")) {
                if (drunkmode) {
                    System.out.println("Apotheke!");
                } else {
                    System.out.println("In der Schule");
                }
            }

            if (inpString.equals("v3")) {
                if (drunkmode) {
                    System.out.println("Wenn ihr googeln wollt, könnt ihr das auch beim V3 machen. Dann aber auf Papier!");
                } else {
                    System.out.println("Wenn ihr so unruhig seid,\nkönnt ihr auch ein kostenloses V3 Ticket bekommen.\n" +
                    "Danach seid ihr nicht mehr so zappelig, da das V3 beruhigt.\n");
                }
            }

            if (inpString.equals("flussdiagramm")) {
                System.out.println("Kein Flussdiagramm zu zeichnen ist genauso,\nwie nen Affen zu rasieren," +
                " den mit Niveacreme einzucremen,\nin einen Anzug zu stecken und vor die Tastatur zu setzen.\n");
            }

            if (inpString.equals("help")) {
                System.out.println("Kommandos:");
                System.out.println("exit\ndrunk\nflussdiagramm\nbreakfast\nhostname\nv3\ninfo\nminus\nplus\nbier\neditor\n");
            }

            if (inpString.equals("bier") && drunkmode) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Bieeeeeeer!");
                    System.out.println("und die Apotheke rauchen!");
                }
            }

            if (inpString.equals("editor")) {
                String text = input.nextLine();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Spaaaaaaaaaam");
                    System.out.println(text);
                }
            }

            //Empty Inputstring
            if (inpString.isEmpty()) {
                if (drunkmode) {
                    System.out.println("Was soll deeees?");
                } else {
                    if (emptycounter > 2) {
                        System.out.println("Gleich gibt's V3");
                    }
                    if (emptycounter > 6) {
                        System.out.println("Nach V3 kommt der K2 Berg");
                        emptycounter = 0;
                    }
                    emptycounter++;
                }
            }


            //end main while
        }

    }
}
