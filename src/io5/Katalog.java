/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.ArrayList;
import java.util.Currency;

/**
 *
 * @author oszust
 */
public class Katalog {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private Filtr filtr = null;
    public Katalog(){};
    public void dodanieProduktu(Produkt produkt){};
    public void usuniecieProduktu(int id){};
    public Produkt wyszukanieProduktu(int id){return new Produkt();};
    public void zmianaCenyProduktu(Currency cena, int id){};
    public void zmianaIlosciNaStanie(int ilosc, int id){};
    public void filtracja(Filtr fitr){
    for (Produkt produkt: this.produkty) {
        if (filtr.getOperator().equals("<")) {
            if (filtr.getRodzaj().equals("iloscStan")) {
                if (produkt.getIloscStan() < filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
            else if (filtr.getRodzaj().equals("cena")) {
             if (produkt.getCena() < filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
        }
        else if (filtr.getOperator().equals(">")) {
            if (filtr.getRodzaj().equals("iloscStan")) {
                if (produkt.getIloscStan() > filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
            else if (filtr.getRodzaj().equals("cena")) {
             if (produkt.getCena() > filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
        }        
        else if (filtr.getOperator().equals("=")) {
            if (filtr.getRodzaj().equals("iloscStan")) {
                if (produkt.getIloscStan() == filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
            else if (filtr.getRodzaj().equals("cena")) {
             if (produkt.getCena() == filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
        }
        else if (filtr.getOperator().equals("<=")) {
            if (filtr.getRodzaj().equals("iloscStan")) {
                if (produkt.getIloscStan() <= filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
            else if (filtr.getRodzaj().equals("cena")) {
             if (produkt.getCena() <= filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
        }
          else if (filtr.getOperator().equals(">=")) {
            if (filtr.getRodzaj().equals("iloscStan")) {
                if (produkt.getIloscStan() >= filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
            else if (filtr.getRodzaj().equals("cena")) {
             if (produkt.getCena() >= filtr.getWartosc()) {
                    produkt.setWidocznosc(false);
                }
            }
        }
    }
    };
    public Filtr getFiltr(){return this.filtr;}
    public void setFiltr(Filtr filtr){this.filtr = filtr;}
    public void szukanie(String tekst){
    for (Produkt produkt: this.produkty) {
        String nazwa = produkt.getNazwa();
        if (nazwa.indexOf(tekst) == -1)
            produkt.setWidocznosc(false);
    }
    };
//    public void sortowanie(String daneSortowania){
//        String[] podzieloneDane = daneSortowania.split(",", 2);
//        if (podzieloneDane[0].equals("rosnaco")) {
//            if (podzieloneDane[1].equals("nazwa"))
//                this.produkty.stream().sorted((object1, object2) -> object1.getNazwa().compareTo(object2.getNazwa()));
//            if (podzieloneDane[1].equals("ilosc"))
//                this.produkty.stream().sorted((object1, object2) -> object1.getCena().getValue().compareTo(object2.getCena().getValue()));
//            if (podzieloneDane[1].equals("cena"))
//
//        }
//        else if (podzieloneDane[1].equals("malejaco")) {
//            if (podzieloneDane[1].equals("nazwa"))
//                this.produkty.stream().sorted((object1, object2) -> object1.getNazwa().compareTo(object2.getNazwa()));
//            if (podzieloneDane[1].equals("ilosc"))
//            if (podzieloneDane[1].equals("cena"))
//
//        }
//    };
    public ArrayList<Produkt> getProdukty(){return this.produkty;}
    public void setProdukty(ArrayList<Produkt> produkty){this.produkty = produkty;}
}
