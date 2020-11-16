package com.unnecessarycompany;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Uzytkownik mati = new Uzytkownik(17,"mati");

        if(mati.czyMozeLegalnieKupic()) {
            System.out.println("Moze kupic");
        } else {
            System.out.println("nie moze");
        }

//        Garnek garnek = new Garnek(5, 7);
//
//        System.out.println(garnek.gotuj());
//        System.out.println(garnek.gotuj(true));
//
//        int temp = garnek.temperaturaWody();
//        System.out.println(temp);
//
//
//        garnek.gotujBezInfo();

//        garnek.wysokosc = 10;
//        System.out.println(garnek.srednica);
//        System.out.println(garnek.wysokosc);
//        System.out.println(garnek.kolor);


//        Garnek garnek = new Garnek(7, 5, "czerwony");
//
////        garnek.srednica = 7;
////        garnek.wysokosc = 5;
////        garnek.kolor = "Czerwony";
//
//        System.out.println(garnek.srednica);
//        System.out.println(garnek.wysokosc);
//        System.out.println(garnek.kolor);



    }
}
