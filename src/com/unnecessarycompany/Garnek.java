package com.unnecessarycompany;

public class Garnek {
    final int srednica;
    final int wysokosc;
    String kolor;

    //konstruktor
    public Garnek(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    //konstruktor
    public Garnek(int srednica, int wysokosc) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }

    //metoda
    public String gotuj() {
        //ciało metody
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol){
        if (czyDodalismySol) {
            return "gotowanie z sola";
        } else {
            return "gotanie bez soli";
        }
    }

    public int temperaturaWody() {
        return 100;
    }

    public void gotujBezInfo() {
        wlaczGarnek();
        gotujPrzezPolGodziny();
        wlaczGarnek();
    }

    private void wlaczGarnek() {
        System.out.println("włączanie garnka");
    }

    private void gotujPrzezPolGodziny() {
        System.out.println("gotowanie przez 30 minut");
    }

    private void wylaczGarnek() {
        System.out.println("wyłączanie garnka");
    }
}
