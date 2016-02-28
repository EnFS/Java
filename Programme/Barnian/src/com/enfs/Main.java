package com.enfs;

/* Barnian
 * Only using while, do..while, for, if, scanner, println and variables
 * Only one method (main method) allowed
 */

/* Changelog:
 * Version 1.0:
 * - Initial release
 * - bootscreen
 * Version 1.1 (28.02.16):
 * - reboot function
 * - bugfix: exit only for logout
 * - poweroff to shutdown the system
 * - quote command for a random fortune
 * - overclocking ability with overbarn
 * - visio
 * - powerpoint
 * - raten (Minispiel)
 * TODO: Befehlsliste aktualisieren
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
        String username = "root";
        boolean boot = true;
        //for-Schleife
        double bootsteps = 0.0001;
        boolean overbarned = false;

        //Sysinfo
        String barnian = "Barnian 1.0";

        //Debugging aktivieren.
        boolean debugging = false;



        while (!inpString.equals("poweroff")) {

            if (debugging) {
                bootsteps = 40;
                login = true;
                username = "root";
            }

            //Start
            if (boot) {
                //bootup
                System.out.println("Booting....");

                for (double x = 1; x <= 100; x = x + 1) {
                    System.out.println("+++?Z~::::::::::::::::::::::::::::::::~~==~~::::::::::::::::::::::::::,,:,,::::M");
                    System.out.println("?++?Z~~~~~::,,,::::::::~~~~~~~~~~~~?ZOOOOO8OOZZ$I~+7OO::::::::,,::::::,:,,,,,,,M");
                    System.out.println("+++?$::::~~~~~~~~~~:::=I~::::=?$ZZZOOOOO888888DD888O8Z::,::::,,,,,,,,,,,,,,,,,,M");
                    System.out.println("+++?++++====~:::::~~~~+IIZOZZZ$ZOOO8D8DD88NN8888DD8D8D::::,,,,,,,,,,,,,,,,,,,,,M");
                    System.out.println("+++?+==+=====~:~~===~7O888OOZZOZOOOOO8ODD8O8NNN8DDDD888OI:::,,,,,,,,,,,,,,,,,,,M");
                    System.out.println("+++?++=+=====:,,,,:$88888888OZOO8OO8DD888NNND8DDDDDDDDDDD$+::::::::,,,.,.,.,.,,M");
                    System.out.println("+++?++===+===:,,,=O888OOOOOOOOOOZ88O88ODNDD88NDDDDDDDDDDDD88=:,,,,,,,::,:,,,,,.M");
                    System.out.println("+++?+===+==++=7ZOOOOOO8888OZO8OZ8OZOODODD888DD8DDD8DDDDDNND8$+=~~~~:::,,,,,,,,,M");
                    System.out.println("+++?+==+===++?$88888OO88DDD888ZOZZZOOZO8DDDD8DDDD8888888DND88Z+~~~======~~~=?=~M");
                    System.out.println("==+?++======7ZDD88D88D888OZ$$$Z$$$$$$$ZO888D888888888888888N88Z=,,,::~~::~==?==M");
                    System.out.println("==+?=+====++7ONND8DDD8Z7I??++??I?I?II7ZOO8O8O8D8888888888O8D888O=,,,,,,,,,,,:~~M");
                    System.out.println("==+?======+?I8NNNND8ZI?++========+++?7$ZZ8OOO888O88OOOO88O88DO8O+,,,,,,,,,,,,,,M");
                    System.out.println("==+?======+I?$DDNMNI?+====~~~~~~~~~=II7ZZOZZOOO8O8OO8OO8OOOO8OOO$++=~:::::,,,,,M");
                    System.out.println("==+?:,:,,,,=+7ODNMI++====~~~~~~~~~~?+?7ZOOZZOZOOOOZOOO8ZOOOZ8OOZ$???????++?++=~M");
                    System.out.println("==+?:,,,,,,::+Z8D$+=====~~~~~~~~~~~~~=IZ$ZZZOOOOOOOOOZOOZOZOO8OZI?+??++???+????M");
                    System.out.println("===?:,.,,,,,,:Z8D++=====~=~~" + x + "%~~~~~~+7$ZZ$ZOZOOOZOOZZOOOOOO88Z$++?++++???????M");
                    System.out.println("7I+?,.,,,,,,,:7OZ+=====~~~~~~~~~~~~~~~=I7$$$OZZZOZZOZOZOZOO8OOOZ7??+???+???????M");
                    System.out.println("$$??,,,.,.,,.,?O$+=====~~~~~~=~~~~~~~~~?I77$$ZZZOO$ZZZZZZZO8ZOOZ7???+??????????M");
                    System.out.println("?I+?:,.,,,,..,~O7+====~~=~~~~~~~~~~~~~~=?I?I7$$ZZZZZZZZZZZZ8OOZZI?+????????+???M");
                    System.out.println("$7+?,,,,,..,.,:I?==========~~~~~=~~~=~~~++++I7$$ZZZ$$Z77??=ZOOZ$?+?+???????????M");
                    System.out.println(":~=+,,,,,,,,,,,:+++++++??I77ZZ$$ZOZZ$$$ZZ$$$7$77I7777III+?Z+OOZI???????????????M");
                    System.out.println("::=+:,......,,,,=++?$ZO88OOZZ$ZZO7:?$Z8OOOO8ZZOOZZZZZ77I==?I?ZZI???????????????M");
                    System.out.println("=~++===========?I7ZZO888DDND8OOI,,,=O88O88O888888OOOOOOZZ$77II77???????????????M");
                    System.out.println("==++==========$ZZO88888OO8DDNN~,:DND8888DD8DDDDDDDDOOOOO$OZZZ$77?I7????????????M");
                    System.out.println("::++==========OO8DNNDDDDD888D?,7NNDDNDDNNNMMMMMMMMMMMMN88OOZZZZZ$77$7?::,::????M");
                    System.out.println("~:++==========I8NOZZZZOO88DDD,8NNNND888DDDDNNNNMMMMMMMNNND8ZZZZZZZ$$$$$7I=:????M");
                    System.out.println("==++==========7OZO88DDDDD88O,?DD8DDNNNDDD888DDDDNNNNNMMDDDNDD8OZZZZZ$Z$$77~????M");
                    System.out.println("~~~,:::~~~==Z$ZZO88DDDDDD::D8OOOOOOZO88888888DDND8ODDMNNNNNNDD8D8OOZZ$Z$77I+???M");
                    System.out.println(":::,..,.,,,:OOOO8888OD8ZZ::OOOZOOO8OOZOZZZO8OOO88DDOO8DNMNNNNDDD88OZ$$ZZ$77+???M");
                    System.out.println(":::,......,$ZZOZZZZZZOZZO~,ZOOZZZZOZOOOOOZZZZ$Z$ZOO888O8NNNMMNDDD8OOZZ$Z$77+~~~M");
                    System.out.println(":::,.....,+ZOZOOOOOOZOZZOO.=OOZZZZZZZZOOOOZZZZZZZZ$$$$ZOODMNNMNNDD88ZZ$$$$7I,,:M");
                    System.out.println(":::......,IOOOOOOOOZZZOOOO?,?OZZZZ$ZZZZZZZZOOZOZZZZZZZ$ZZ$7$8NNNND88ZZZ$$$77,,,M");
                    System.out.println("=~:...,.,,ZOOOOOZZZZOZOOOOOI,=ZZZ$$ZZZ$$ZZZOOOOOOOZOZOOOZ$$ZOOOOZO$D88Z$$$$I,,,M");
                    System.out.println("~~:....,,,ZZ$Z$ZZ$ZZZZOOOO8OO:,?$$$ZZ?7I$ZZZZZZOOOZOOOOO8O88OZZZZZZ$Z8OZ$$$I,,,M");
                    System.out.println("~=:,.,,,,,$ZZZZZZZZZOZOO8O88O8Z7:,:,,::=ZZZZZZZZZZ$$O88OOZZ$ZZZ$ZZZZZZZ7$77I,,,M");
                    System.out.println("==,,..,,,:::?ZZ:?ZOOOOZOO88OO8ZOO88+~=,:~$ZZZZZZOOO8OZZZ$ZZZZZZZZZ$$Z$ZZ$$7I,,,M");
                    System.out.println("==,,,,.,,:~~$Z:,,$ZOOOOOO88888ZZZOO888OZZZ$$ZZ8OZZZZ$$7$$$Z$ZZZZZ$$$$$$$$$777IIM");
                    System.out.println("==,,..,,,,~+Z::,:ZZOOOOOO8O888ZZZZ$ZZ$$$ZO8OOZZZZ$ZZZZ$$$$$$$$$$$Z$$$$$$7$$7777M");
                    System.out.println("=+,,,....,~?$::,+ZOOO7:::=OO8OZZZZZZ$ZZO8O$$$$ZZZZ7$$Z$$$$777777777Z$$$$$$$77$$M");
                    System.out.println("++,,.....?~Z~:,:ZOOOI:,,:::~Z8ZZZZOZZOOOZZZZ$Z$$ZZ$$$ZZZZO888888OOOZ$$$77$$$$$$M");
                    System.out.println("++,.....~:=I::,+ZOO:,:,~=:::~8ZZZZZZO8OZZ$ZZZ$Z$ZZOO8DDNND88OOOZZOZOOZZZZZ$$7$7M");
                    System.out.println("++,.....?~?::::OOO::::=OZ:::=8OOZZZO88ZZZ$ZZOOOO88NNN8ZZZZZZZ$$ZZZZ$$$Z$$$$$$$7M");
                    System.out.println("++,....7~~~::,?OO::::=7$O7:~8OOOZOO8OOZZZZZO88DNN8ZZZZZOZOZZZZ$$ZZ$$$$$$$$$$$$ZM");
                    System.out.println("==,..,$OOZ::::Z:~:::O~::~7OO8$:ZZZOOZZZZO8DNNNZZZZZZ$ZZZ$ZZZZZZZZOZZ$$$$$ZZZ$$$M");
                    System.out.println("+=?O8ZZOOI==:7Z,:::OO:::~+88~::ZOOOOZZ8DNMD$$$ZZZ$$$ZZZZZZZOZZZ$$$Z$ZZ$$Z7ZZ$$$M");
                    System.out.println("O88OZZOOO$?Z$I?:::=O::::IOO::~~OZ88ZODDNOZ$OOZZZ$$$$7ZZZZZZZZOZZZZ$ZZZ$$Z$$Z$$ZM");
                    System.out.println("8OOOOZOO8Z?ZZOO+::::::~OO~:::~$ZODZODNDZODNMNDD8O$ZZZ$Z$$7$$ZZZZ$ZZZ$7$Z$Z7$$$$M");
                    System.out.println("OOOOOZO88O+ZOOOOZ~:::~8+::::::~7888DNOO8ZZOOOOO88OZZZZZZZZZ$Z$$$$$$$$$$7Z$Z$$$$M");
                    System.out.println("OO8OOZOOO$=ZOOOOOO8O8$::::=O+~~O8D8DD$$ZZZ$ZZZZZZOOOOOZOZO8OZOOOOZZO$ZZ7$$$$$$$M");

                    for (int y = 0; y < 300; y++) {
                        for (double xy = 0.0001; xy < 40; xy = xy + bootsteps) {
                            // System.out.print("");
                        }
                        // System.out.println();
                    }
                }

                System.out.println("Setting up Java VM");
                System.out.println("That's it!");
                System.out.println("Nice and fast Barnian boot!\n\n\n");

                //Welcome Message
                if (overbarned) {
                    System.out.println(barnian + " Alles geht mit Java und while!\nBarnian wurde overbarned! Nutzung auf eigene Gefahr!\n");
                } else {
                    System.out.println(barnian + " Alles geht mit Java und while!\n");
                }
                boot = false;
            }

            if (!login) {
                boolean correct = false;
                do {
                    System.out.println("Benutzername: ");
                    String name = input.nextLine();
                    System.out.println("Passwort: ");
                    String pw = input.nextLine();
                    if (name.equals("barner") && pw.equals("bier") || name.equals("lowski") && pw.equals("keinstress") || name.equals("samed") && pw.equals("hygienefreak")) {
                        correct = true;
                        login = true;
                        System.out.println("Anmeldung erfolgreich!");
                        username = name;
                    } else {
                        System.out.println("Anmeldung fehlgeschlagen.\nBitte rasieren Sie einen Affen und probieren es erneut.\n");
                    }
                } while(!correct);
            } //end login

            //Main screen
            System.out.println(username + "@Barnian ~ $ ");
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

            if (inpString.equals("exit") || inpString.equals("logout") || inpString.equals("bye")) {
                login = false;
            }

            if (inpString.equals("samedcleaner")) {
                //Viren sind für mich tabu!
                System.out.println("Hier wird geputzt. Aber anständig!");
            }

            if (inpString.equals("reboot")) {
                System.out.println("Briefbeschwerer wird neugestartet!");
                boot = true;
                login = false;
            }

            if (inpString.equals("quote")) {
                int anzahl = 2; //Anzahl der Sprüche
                int zufall = (int) ((Math.random() * anzahl - 1) + 1);

                if (zufall == 1) {
                    System.out.println("Wenn ein Programm keine Ausgabe hat, ist der PC ein teurer Briefbeschwerer.");
                }
                if (zufall == 2) {
                    System.out.println("Teilen mit Rest. Also wir haben 5 Kinder und 18 BIER!");
                }
            }

            if (inpString.equals("overbarn")) {
                System.out.println("Barnian wurde overbarned!\nDer PC muss nun neugestartet werden.\nENTER drücken zum neustarten: ");
                String reboot = "1337";

                while (!reboot.isEmpty()) {
                    reboot = input.nextLine();
                    if (reboot.isEmpty()) {
                        System.out.println("System wird neugestartet.");
                        boot = true;
                        login = false;
                        overbarned = true;
                    } else {
                        System.out.println("Rasieren sie einen Affen und drücken danach ENTER!");
                    }
                }
            }

            if (inpString.equals("visio") && username.equals("lowski")) {
                System.out.println("Visio ist auf diesem Barnian System leider nicht installiert.");
            }

            if (inpString.equals("powerpoint") || inpString.equals("barnipoint")) {
                System.out.println("public static void main(\nString args[\n])\n{\nScanner tastatur =\nnew Scanner(System\n.in);\n\n}");
            }

            if (inpString.equals("raten")) {
                System.out.println("Zahlenraten.\nErrate eine Zahl von 1-1000");
                int rndzahl = (int) ((Math.random() * 1000 - 1) + 1);
                int eingabe = 0;
                int versuche = 0;
                while (eingabe != rndzahl) {
                    System.out.println("Eingabe: ");
                    eingabe = input.nextInt();
                    versuche = versuche + 1;
                    if (eingabe == rndzahl) {
                        System.out.println("Gewonnen!");
                    } else {
                        if (eingabe < rndzahl) {
                            System.out.println("Zahl zu klein!");
                        } else {
                            System.out.println("Zahl zu groß!");
                        }
                    }
                }
                System.out.println("Benötigte Versuche: " + versuche);
            }

            //Empty Inputstring
            if (inpString.isEmpty()) {
                if (drunkmode) {
                    int zufall = 10;
                    zufall = (int) (Math.random() * 5);
                    //Zufalls Spruch leere eingabe Drunkmode
                    if (zufall == 1) {
                        System.out.println("Was soll deeees?");
                    }
                    if (zufall == 2) {
                        System.out.println("Ohne Ausgabe nur ein Briefbeschwähereeeeeer");
                    }
                    if (zufall == 3) {
                        System.out.println("ruhe sonst v3");
                    }
                    if (zufall == 4) {
                        System.out.println("Da hat wohl jemand in der Apotheke Gefrühstückt");
                    }
                    if (zufall == 0) {
                        System.out.println("Was machen sie da dddeeeessss sieht nicht nach Java aus");
                    }
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
