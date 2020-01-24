/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import koszyk.Koszyk;
import koszyk.PozycjaKoszyk;
import katalog.Katalog;
import katalog.Produkt;
import aplikacja.Aplikacja;
import java.util.ArrayList;

/**
 *
 * @author oszust
 */
public class Main {
    public static void main(String[] args) {
        //Pula produktow do dodawania
        ArrayList<Produkt> produkty = new ArrayList<Produkt>() {
            {
                add(new Produkt("Kajak", 100, 3));
                add(new Produkt("Śpiwór", 30, 50));
                add(new Produkt("Kije trekkingowe", 10, 100));
                add(new Produkt("Scyzoryk Opinel", 20, 125));
                add(new Produkt("Scyzoryk Victorinox", 25, 75));
                add(new Produkt("Materac Supreme", 2000, 1));
            }
        };
        Aplikacja aplikacja = new Aplikacja();

        aplikacja.zarzadcaKatalog.przykladoweProdukty = produkty;

        for(int i=0; i<produkty.size(); i++)
        {
            aplikacja.zarzadcaKatalog.dodawanieProduktu();
        }

        System.out.println("Katalog w pierwotnym stanie");
        aplikacja.zarzadcaKatalog.wyswietlKatalog();


        aplikacja.zarzadcaKatalog.edycjaKatalogu();
        System.out.println("Katalog po pierwszej losowej zmianie");
        aplikacja.zarzadcaKatalog.wyswietlKatalog();


        aplikacja.zarzadcaKatalog.edycjaKatalogu();
        System.out.println("Katalog po drugiej losowej zmianie");
        aplikacja.zarzadcaKatalog.wyswietlKatalog();

        System.out.println("Katalog przefiltrowany cena <= 500 i wyszukiwanie po słowie \"Scyzoryk\" ");
        Katalog katalog = aplikacja.zarzadcaKatalog.getKatalog();
        aplikacja.zarzadcaKoszyk.zarzadzajKoszykiem();
        Koszyk koszyk = aplikacja.zarzadcaKoszyk.getKoszyk();
        ArrayList<PozycjaKoszyk> pozycjeWKoszyku = koszyk.getProdukty();
        System.out.println("Koszyk");
        for (PozycjaKoszyk pozycja: pozycjeWKoszyku) {
            pozycja.getProdukt().wyswietlProdukt();
         }
    }
}
