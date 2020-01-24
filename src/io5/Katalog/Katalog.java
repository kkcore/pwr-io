/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5.Katalog;


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
    public void filtracja(Filtr filtr){
        String operator = filtr.getOperator();
        String rodzaj = filtr.getRodzaj();
        double wartosc = filtr.getWartosc();
        for (Produkt produkt: this.produkty) {
            if (operator.equals("<")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan < wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena < wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
            else if (operator.equals(">")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan > wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena > wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }        
            else if (operator.equals("=")) {
                if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan == wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena == wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
            else if (operator.equals("<=")) {
               if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan <= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena <= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
            }
              else if (operator.equals(">=")) {
              if (rodzaj.equals("iloscStan")) {
                    int iloscStan = produkt.getIloscStan();
                    if (!(iloscStan >= wartosc)) {
                        produkt.setWidocznosc(false);
                    }
                }
                else if (rodzaj.equals("cena")) {
                    double cena = produkt.getCena();
                 if (!(cena >= wartosc)) {
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
    public ArrayList<Produkt> getProdukty(){return this.produkty;}
    public void setProdukty(ArrayList<Produkt> produkty){this.produkty = produkty;}
}
