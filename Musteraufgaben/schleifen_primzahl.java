package com.enfs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Eingabe Scanner initialisieren
        Scanner eingabe = new Scanner(System.in);

        //Variable anlegen (natürliche Zahl --> integer)
        int zahl;
        //Primzahl ja, nein
        boolean isprime = true;


        //Solange Benutzer Abfragen bis er eine gültige Eingabe macht
        //Also Zahl >= 2
        do {
            System.out.println("Geben Sie eine natürliche Zahl (>= 2) ein: ");
            zahl = eingabe.nextInt();
        } while (zahl < 2); //Wenn Zahl >= 2 dann springt die Mühle raus

        //i wird hier definiert, weil es bei der späteren Abfrage noch benötigt wird.
        int i;

        for (i = 2; i < zahl; i = i + 1) {
            if (zahl % i == 0) {
                isprime = false;
                //Aus Performance Gründen kann hier abgebrochen werden
                break;
            }
        }

        if (isprime == true) {
            System.out.println(zahl + " ist eine Primzahl!");
        } else {
            System.out.println("Keine Primzahl! " + zahl + " durch " + i + " teilbar.");
        }




    }
}
