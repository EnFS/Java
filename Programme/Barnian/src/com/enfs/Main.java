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
 * - help angepasst
 * - langweilen bei Lowski mit logo
 * - snake
 * - bottlesay
 * - ls
 * - cd
 * - quersumme
 * Version 1.2:
 * - cowsay Algorithmus optimiert
 *
 * TODO: Befehlsliste aktualisieren
 */


import java.awt.Point;
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
        boolean iscomando = false;
        int randip = 0;

        //Sysinfo
        String barnian = "Barnian 1.1";
        String IP = "13.37.42.";
        //Standard home directory: ~
        String directory = "~";


        //Debugging aktivieren.
        boolean debugging = true;


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
                    System.out.println("===?:,.,,,,,,:Z8D++=====~=~~" + x + "%~~~~~~+7$ZZ$ZOZOOOZOOZZOOOOOO88Z$++?++++??????M");
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

                //Set IP on boot
                randip = (int) ((Math.random() * 253) + 1);

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
                } while (!correct);
            } //end login

            //Main screen
            if (username.equals("root")) {
                System.out.print(username + "@Barnian: " + directory + " # ");
            } else {
                System.out.print(username + "@Barnian: " + directory + " $ ");
            }

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
                iscomando = true;
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
                iscomando = true;
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
                iscomando = true;
            } //End subtraktion

            if (inpString.equals("info")) {
                //int randip = (int) ((Math.random() * 253) + 1);
                System.out.println(barnian + "\nKernel: While/DoWhile, weil mehr kann man den Prozessor net auslasten.");
                System.out.println("Hostname: B138-" + username + "\nIP: " + IP + randip + "\nBrain: N/A\nGateway: Rückenmark\n");
                iscomando = true;
            }

            if (inpString.equals("hostname")) {
                System.out.println("B138-" + username);
                iscomando = true;
            }

            if (inpString.equals("breakfast")) {
                if (drunkmode) {
                    System.out.println("Apotheke!");
                } else {
                    System.out.println("In der Schule");
                }
                iscomando = true;
            }

            if (inpString.equals("v3")) {
                if (drunkmode) {
                    System.out.println("Wenn ihr googeln wollt, könnt ihr das auch beim V3 machen. Dann aber auf Papier!");
                } else {
                    System.out.println("Wenn ihr so unruhig seid,\nkönnt ihr auch ein kostenloses V3 Ticket bekommen.\n" +
                            "Danach seid ihr nicht mehr so zappelig, da das V3 beruhigt.\n");
                }
                iscomando = true;
            }

            if (inpString.equals("flussdiagramm")) {
                System.out.println("Kein Flussdiagramm zu zeichnen ist genauso,\nwie nen Affen zu rasieren," +
                        " den mit Niveacreme einzucremen,\nin einen Anzug zu stecken und vor die Tastatur zu setzen.\n");
                iscomando = true;
            }
            //barner
            if (inpString.equals("help")) {
                System.out.println("Kommandos:");
                System.out.println("exit\ndrunk\nflussdiagramm\nbreakfast\nhostname\nv3\ninfo\nminus\nplus\nbier\nsnake\neditor\n");
                iscomando = true;
            }
            //lowski
            if (inpString.equals("help") && username.equals("lowski")) {
                System.out.println("Kommandos:");
                System.out.println("visio\nlangweilen\n");
                iscomando = true;
            }
            if (inpString.equals("bier") && drunkmode) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Bieeeeeeer!");
                    System.out.println("und die Apotheke rauchen!");
                }
                iscomando = true;
            }

            if (inpString.equals("editor")) {
                String text = input.nextLine();
                for (int i = 0; i < 5; i++) {
                    System.out.println("Spaaaaaaaaaam");
                    System.out.println(text);
                }
                iscomando = true;
            }

            if (inpString.equals("exit") || inpString.equals("logout") || inpString.equals("bye")) {
                login = false;
                iscomando = true;
            }

            if (inpString.equals("samedcleaner")) {
                //Viren sind für mich tabu!
                System.out.println("Hier wird geputzt. Aber anständig!");
                iscomando = true;
            }

            if (inpString.equals("reboot")) {
                System.out.println("Briefbeschwerer wird neugestartet!");
                boot = true;
                login = false;
                iscomando = true;
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
                iscomando = true;
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
                iscomando = true;
            }

            if (inpString.equals("visio") && username.equals("lowski")) {
                System.out.println("Visio ist auf diesem Barnian System leider noch nicht installiert.");
                iscomando = true;
            }

            if (inpString.equals("powerpoint") || inpString.equals("barnipoint")) {
                System.out.println("public static void main(\nString args[\n])\n{\nScanner tastatur =\nnew Scanner(System\n.in);\n\n}");
                iscomando = true;
            }



            /* games
             * Alle Spiele müssen nach dem Befehl games geschrieben werden.
             */

            if (inpString.equals("games") || inpString.equals("gamecenter")) {
                System.out.print("Spiele:\nRaten (1)\nSnake (2)\n: ");
                int spiel = input.nextInt();
                if (spiel == 1) {
                    inpString = "raten";
                }
                if (spiel == 2) {
                    inpString = "snake";
                }
            }


            if (inpString.equals("affenspiel")) {
                System.out.print("Gebe eine Start Zahl ein: ");
                int left = input.nextInt();
                int computer;
                while (left > 0) {

                    //Computerzahl generieren
                    if (left % 2 == 0 && left != 4) {
                        computer = 2;
                    } else {
                        computer = 1;
                    }

                    System.out.println("Rasierter Affe zieht: " + computer);
                    left -= computer;
                    System.out.println("Jetzt sind " + left + " übrig.");

                    if (left <= 0) {
                        System.out.println("Rasierter Affe gewinnt!");
                        break;
                    }
                    System.out.print("Dein Zug, " + username + " (1 oder 2): ");
                    int person = input.nextInt();

                    while (person != 1 && person != 2) {
                        System.out.println(person + " nicht erlaubt, wähle 1 oder 2.");
                        person = input.nextInt();
                    }
                    left -= person;
                    System.out.println("Jetzt sind " + left + " übrig.");

                    if (left <= 0) {
                        System.out.println(username + "hat gewonnen!");
                        break;
                    }
                }
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
                iscomando = true;
            }

            if (inpString.equals("snake")) {
                java.awt.Point playerPosition = new java.awt.Point(10, 9);
                java.awt.Point snakePosition = new java.awt.Point(30, 2);
                java.awt.Point snakePosition2 = new java.awt.Point(31, 2);
                java.awt.Point snakePosition3 = new java.awt.Point(32, 2);
                java.awt.Point snakePosition4 = new java.awt.Point(33, 2);
                java.awt.Point snakePosition5 = new java.awt.Point(34, 2);
                java.awt.Point snakePosition6 = new java.awt.Point(35, 2);
                java.awt.Point goldPosition1 = new java.awt.Point(6, 6);
                java.awt.Point goldPosition2 = new java.awt.Point(1, 1);
                java.awt.Point goldPosition3 = new java.awt.Point(9, 9);
                java.awt.Point goldPosition4 = new java.awt.Point(30, 6);
                java.awt.Point goldPosition5 = new java.awt.Point(30, 1);
                java.awt.Point doorPosition = new java.awt.Point(0, 5);
                boolean rich1 = false;
                boolean rich2 = false;
                boolean rich3 = false;
                boolean rich4 = false;
                boolean rich5 = false;


                while (true) {
                    // Raster mit Figuren zeichnen

                    for (int y = 0; y < 10; y++) {
                        for (int x = 0; x < 40; x++) {
                            Point p = new Point(x, y);
                            if (playerPosition.equals(p))
                                System.out.print('&');
                            else if (snakePosition.equals(p))
                                System.out.print('S');
                            else if (snakePosition2.equals(p))
                                System.out.print('x');
                            else if (snakePosition3.equals(p))
                                System.out.print('o');
                            else if (snakePosition4.equals(p))
                                System.out.print('x');
                            else if (snakePosition5.equals(p))
                                System.out.print('o');
                            else if (snakePosition6.equals(p))
                                System.out.print('x');
                            else if (goldPosition1.equals(p))
                                System.out.print('$');
                            else if (goldPosition2.equals(p))
                                System.out.print('$');
                            else if (goldPosition3.equals(p))
                                System.out.print('$');
                            else if (goldPosition4.equals(p))
                                System.out.print('$');
                            else if (goldPosition5.equals(p))
                                System.out.print('$');
                            else if (doorPosition.equals(p))
                                System.out.print('#');
                            else System.out.print('.');
                        }
                        System.out.println();
                    }

                    // Status feststellen


                    if (rich1 && rich2 && rich3 && rich4 && rich5 && playerPosition.equals(doorPosition)) {
                        System.out.println("Gewonnen!");
                        break;
                    }
                    if (playerPosition.equals(snakePosition)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }

                    if (playerPosition.equals(snakePosition2)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }

                    if (playerPosition.equals(snakePosition3)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }

                    if (playerPosition.equals(snakePosition4)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }

                    if (playerPosition.equals(snakePosition5)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }
                    if (playerPosition.equals(snakePosition6)) {
                        System.out.println("ZZZZZZZ. Die Schlange hat dich!");
                        break;
                    }
                    if (playerPosition.equals(goldPosition1)) {
                        rich1 = true;
                        goldPosition1.setLocation(-1, -1);
                        snakePosition.setLocation(30, 10);
                        snakePosition2.setLocation(31, 10);
                        snakePosition3.setLocation(32, 10);
                        snakePosition4.setLocation(33, 10);
                        snakePosition5.setLocation(34, 10);
                        snakePosition6.setLocation(35, 10);

                    }
                    if (playerPosition.equals(goldPosition2)) {
                        rich2 = true;
                        goldPosition2.setLocation(-1, -1);
                        snakePosition.setLocation(0, 15);
                        snakePosition2.setLocation(-1, 15);
                        snakePosition3.setLocation(-2, 15);
                        snakePosition4.setLocation(-3, 15);
                        snakePosition5.setLocation(-4, 15);
                        snakePosition6.setLocation(-5, 15);

                    }

                    if (playerPosition.equals(goldPosition3)) {
                        rich3 = true;
                        goldPosition3.setLocation(-1, -1);
                    }
                    if (playerPosition.equals(goldPosition4)) {
                        rich4 = true;
                        goldPosition4.setLocation(-1, -1);
                        snakePosition.setLocation(32, 0);
                        snakePosition2.setLocation(33, 0);
                        snakePosition3.setLocation(34, 0);
                        snakePosition4.setLocation(35, 0);
                        snakePosition5.setLocation(36, 0);
                        snakePosition6.setLocation(37, 0);
                    }
                    if (playerPosition.equals(goldPosition5)) {
                        rich5 = true;
                        goldPosition5.setLocation(-1, -1);
                        snakePosition.setLocation(1, 1);
                        snakePosition2.setLocation(0, 1);
                        snakePosition3.setLocation(-1, 1);
                        snakePosition4.setLocation(-2, 1);
                        snakePosition5.setLocation(-3, 1);
                        snakePosition6.setLocation(-4, 1);
                    }

                    // Konsoleneingabe und Spielerposition verändern
                    //Ging leider nicht anders ^^
                    switch (new java.util.Scanner(System.in).next().charAt(0)) {
                        case 'w':
                            playerPosition.y = Math.max(0, playerPosition.y - 1);
                            break;
                        case 's':
                            playerPosition.y = Math.min(9, playerPosition.y + 1);
                            break;
                        case 'a':
                            playerPosition.x = Math.max(0, playerPosition.x - 1);
                            break;
                        case 'd':
                            playerPosition.x = Math.min(39, playerPosition.x + 1);
                            break;
                    }

                    // Schlange bewegt sich in Richtung Spieler

                    if (playerPosition.x < snakePosition.x)
                        snakePosition.x--;
                    else if (playerPosition.x > snakePosition.x)
                        snakePosition.x++;
                    if (playerPosition.y < snakePosition.y)
                        snakePosition.y--;
                    else if (playerPosition.y > snakePosition.y)
                        snakePosition.y++;

                    //Schlangezweiterteil2

                    if (snakePosition.x < snakePosition2.x)
                        snakePosition2.x--;


                    if (snakePosition.x > snakePosition2.x)
                        snakePosition2.x++;


                    if (snakePosition.y < snakePosition2.y)
                        snakePosition2.y--;


                    if (snakePosition.y > snakePosition2.y)
                        snakePosition2.y++;


                    //schlange3

                    if (snakePosition2.x < snakePosition3.x)
                        snakePosition3.x--;


                    if (snakePosition2.x > snakePosition3.x)
                        snakePosition3.x++;


                    if (snakePosition2.y < snakePosition3.y)
                        snakePosition3.y--;


                    if (snakePosition2.y > snakePosition3.y)
                        snakePosition3.y++;

                    //schlange4
                    if (snakePosition3.x < snakePosition4.x)
                        snakePosition4.x--;


                    if (snakePosition3.x > snakePosition4.x)
                        snakePosition4.x++;


                    if (snakePosition3.y < snakePosition4.y)
                        snakePosition4.y--;


                    if (snakePosition3.y > snakePosition4.y)
                        snakePosition4.y++;

                    //Schlange5
                    if (snakePosition4.x < snakePosition5.x)
                        snakePosition5.x--;


                    if (snakePosition4.x > snakePosition5.x)
                        snakePosition5.x++;


                    if (snakePosition4.y < snakePosition5.y)
                        snakePosition5.y--;


                    if (snakePosition4.y > snakePosition5.y)
                        snakePosition5.y++;

                    //schlange6
                    if (snakePosition5.x < snakePosition6.x)
                        snakePosition6.x--;


                    if (snakePosition5.x > snakePosition6.x)
                        snakePosition6.x++;


                    if (snakePosition5.y < snakePosition6.y)
                        snakePosition6.y--;


                    if (snakePosition5.y > snakePosition6.y)
                        snakePosition6.y++;
                }
                iscomando = true;
            }

            if (inpString.equals("langweilen") && username.equals("lowski")) {

                String abfrage = "ja";
                System.out.println("Langweilen sie sich?");
                System.out.println("JA/NEIN");
                abfrage = input.nextLine();
                int simon = 0;
                if (abfrage.equals("ja")) {
                    while (simon <= 5) {
                        System.out.println("Dann gehen sie zum Toom! Kaffee saufen!");
                        System.out.println(" ___________________________________");
                        System.out.println("|				    |");
                        System.out.println("|				    |");
                        System.out.println("|                                   |");
                        System.out.println("|___________|   	|___________|");
                        System.out.println("            |           |");
                        System.out.println("            |		|");
                        System.out.println("            |		|");
                        System.out.println("            |		|");
                        System.out.println("            |		|");
                        System.out.println("            |		|");
                        System.out.println("            |___________|");
                        simon++;
                    }

                    System.out.println("	 ___________________");
                    System.out.println("	|    ___________    |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |___________|   |");
                    System.out.println("	|___________________|");

                    System.out.println("	 ___________________");
                    System.out.println("	|    ___________    |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |           |   |");
                    System.out.println("	|   |___________|   |");
                    System.out.println("	|___________________|");

                    String s1 = "\\";
                    String s2 = "/";
                    System.out.println(" __________                       __________");
                    System.out.println("|           " + s1 + "                    " + s2 + "          |");
                    System.out.println("|            " + s1 + "                  " + s2 + "           |");
                    System.out.println("|       | " + s1 + "   " + s1 + "                " + s2 + "   " + s2 + "| 	    |");
                    System.out.println("|       |  " + s1 + "   " + s1 + "              " + s2 + "   " + s2 + " | 	    |");
                    System.out.println("|       |   " + s1 + "   " + s1 + "            " + s2 + "   " + s2 + "  |	    |");
                    System.out.println("|       |    " + s1 + "   " + s1 + "          " + s2 + "   " + s2 + "   |	    |");
                    System.out.println("|       |     " + s1 + "   " + s1 + "        " + s2 + "   " + s2 + "    |       |");
                    System.out.println("|       |      " + s1 + "   " + s1 + "      " + s2 + "   " + s2 + "     |       |");
                    System.out.println("|       |       " + s1 + "   " + s1 + "____" + s2 + "   " + s2 + "      |       |");
                    System.out.println("|       |        " + s1 + "          " + s2 + "       |       |");
                    System.out.println("|       |         " + s1 + "        " + s2 + "        |       |");
                    System.out.println("|_______|          " + s1 + "______" + s2 + "         |_______|");

                } else {
                    System.out.println("Dann passen sie auf!");
                }
                iscomando = true;
            }

            if (inpString.equals("cowsay") || inpString.equals("gelaber") || inpString.equals("bottlesay")) {
                String text = "";
                String randstring = "";
                int max = 17;
                int laenge = 19;
                int linebreak = 4;
                int randomzahl, randold = 0, randold2 = 0, randold3 = 0, randold4 = 0, randold5 = 0, randold6 = 0, randold7 = 0, randold8 = 0, randold9 = 0, randold10 = 0, woerter = 0;

                //Mühle:
                for (int i = 0; i < laenge; i++) {
                    randomzahl = (int) ((Math.random() * max) + 1);
                    while (randold == randomzahl || randold2 == randomzahl || randold3 == randomzahl || randold4 == randomzahl || randold5 == randomzahl || randold6 == randomzahl || randold7 == randomzahl || randold8 == randomzahl || randold9 == randomzahl || randold10 == randomzahl) {
                        randomzahl = (int) ((Math.random() * max) + 1);
                    }
                    if (debugging) {
                        System.out.println(randomzahl + " " + randold + " " + randold2 + " " + randold3 + " " + randold4 + " " + randold5 + " " + randold6 + " " + randold7 + " " + randold8 + " " + randold9 + " " + randold10);
                    }
                    randold10 = randold9;
                    randold9 = randold8;
                    randold8 = randold7;
                    randold7 = randold6;
                    randold6 = randold5;
                    randold5 = randold4;
                    randold4 = randold3;
                    randold3 = randold2;
                    randold2 = randold;
                    randold = randomzahl;

                    switch (randomzahl) {
                        case 1:
                            randstring = "komm ins V3";
                            break;
                        case 2:
                            randstring = "ein rasierter Affe";
                            break;
                        case 3:
                            randstring = "wir schaffen";
                            break;
                        case 4:
                            randstring = "bier";
                            break;
                        case 5:
                            randstring = "du hast";
                            break;
                        case 6:
                            randstring = "5 Kinder";
                            break;
                        case 7:
                            randstring = "und";
                            break;
                        case 8:
                            randstring = "18 flaschen bier";
                            break;
                        case 9:
                            randstring = "das ist genau so";
                            break;
                        case 10:
                            randstring = "in der apotheke rauchen";
                            break;
                        case 11:
                            randstring = "durch die Mühle lassen";
                            break;
                        case 12:
                            randstring = "das kannst du";
                            break;
                        case 13:
                            randstring = "da müssen wir Laufzeit optimieren";
                            break;
                        case 14:
                            randstring = "teurer Briefbeschwerer";
                            break;
                        case 15:
                            randstring = "flussdiagramm!";
                            break;
                        case 16:
                            randstring = "erst auf dem Blatt debuggen";
                            break;
                        case 17:
                            randstring = "dann in die Mühle eintippen";
                            break;
                    }
                    woerter++;

                    if (woerter > linebreak) {
                        text += randstring + " >\n< ";
                        woerter = 0;
                    } else {
                        text += randstring + " ";
                    }
                }

                /* TODO: monkeysay, ... */


                if (inpString.equals("cowsay") || inpString.equals("bottlesay")) {
                    int i;
                    String minus = "----";
                    String minus2 = "____";
                    double offset = 1.4;
                    for (i = 0; i < text.length() * linebreak / laenge * offset; i++) {
                        minus += "-";
                        minus2 += "_";
                    }
                    System.out.println(minus2);
                    System.out.println("< " + text + ">");
                    System.out.println(minus);

                    if (inpString.equals("cowsay")) {
                        System.out.println("   \\    ^__^");
                        System.out.println("    \\   (oo)\\_______");
                        System.out.println("        (__)\\       )\\/\\");
                        System.out.println("            ||----w |");
                        System.out.println("            ||     ||");
                    }
                    if (inpString.equals("bottlesay")) {

                    System.out.println("       \\      ____");
                    System.out.println("        \\    |    |");
                    System.out.println("         \\   |    |");
                    System.out.println("          \\  |____|");
                    System.out.println("             |    |");
                    System.out.println("             (    )");
                    System.out.println("             )    (");
                    System.out.println("           .'      `.");
                    System.out.println("          /          \\");
                    System.out.println("         |------------|");
                    System.out.println("         |JACK DANIELS|");
                    System.out.println("         |    ----    |");
                    System.out.println("         |   (No.7)   |");
                    System.out.println("         |    ----    |");
                    System.out.println("         | Tennessee  |");
                    System.out.println("         |  WHISKEY   |");
                    System.out.println("         |  40% Vol.  |");
                    System.out.println("         |------------|");
                    System.out.println("         |____________|dp");

                    }
                } else {
                    System.out.println(username + ": " + text);
                }
                iscomando = true;
            }


            if (inpString.equals("quersumme")) {
                int zahl, quersumme = 0, rest;

                System.out.print("Bitte geben Sie eine Zahl in die Mühle ein: ");
                zahl = input.nextInt();

                //Die Mühle
                while (zahl > 0) {
                    rest = zahl % 10;
                    quersumme += rest;
                    zahl /= 10;
                }

                System.out.println("Die Mühle kommt zu dem Ergebnis: " + quersumme);
                iscomando = true;
            }

            if (inpString.equals("ipconfig") || inpString.equals("ifconfig")) {
                System.out.println("IP: " + IP + randip);
                iscomando = true;
            }



            if (inpString.equals("password")) {
                String passwd;
                switch (username) {
                    case "barner":
                        passwd = "affe";
                        break;
                    case "lowski":
                        passwd = "legal";
                        break;
                    case "samed":
                        passwd = "tisch";
                        break;
                    default:
                        passwd = "hugo";
                        break;
                }
                System.out.println(passwd);
            }






            //Start Pseudo Filesystem
            if (inpString.contains("cd")) {
                try {
                    if (inpString.substring(0, 3).equals("cd ")) {
                        String pathname = inpString.substring(3, inpString.length());
                        if (!pathname.substring(0, 1).equals("/")) {
                            if (directory.equals("/")) {
                                directory += pathname;
                            } else {
                                directory += "/" + pathname;
                            }
                        } else {
                            if (pathname.equals("/home/" + username)) {
                                directory = "~";
                            } else {
                                directory = pathname;
                            }
                        }
                        //System.out.println(pathname);
                        iscomando = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Rasieren Sie einen Affen und benutzen danach cd <Pfad>");
                }
            }


            if (inpString.equals("ls")) {
                String list = "";
                if (directory.equals("/")) {
                    list += "boot   home   barnian";
                }
                if (directory.equals("~") || directory.equals("/home/" + username)) {
                    list += "pointer.pptx";
                }
                if (directory.equals("/home")) {
                    list += "barner   lowski   samed";
                }
                System.out.println(list);
                iscomando = true;
            }


            //End Pseudo Filesystem


            //Empty Inputstring
            if (inpString.isEmpty() || !iscomando) {
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
                iscomando = false;
            }
        }

    }
}
