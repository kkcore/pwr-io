/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.Currency;

/**
 *
 * @author oszust
 */
public class Produkt {
    private int id;
    private String nazwa;
    private double cena;
    private int iloscStan;
    private boolean widocznosc;
    public Produkt(){};
    public Produkt(String nazwa, double cena, int iloscStan) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscStan = iloscStan;
    }
    public boolean getWidocznosc(){return this.widocznosc;}
    public void setWidocznosc(boolean widocznosc){this.widocznosc = widocznosc;}
    public int getId(){return this.id;}
    public void setId(int value){this.id = value;}
    public String getNazwa(){return this.nazwa;}
    public void setNazwa(String value){this.nazwa = value;}
    public double getCena(){return this.cena;}
    public void setCena(double value){this.cena = value;}
    public int getIloscStan(){return this.iloscStan;}
    public void setIloscStan(int value){this.iloscStan = value;}
    public void wyswietlProdukt() {
        if (this.widocznosc == false)
            return;
        String sformatowanyString = String.format("%s; %s; %s;\n", this.nazwa, this.cena, this.iloscStan);
        System.out.println(sformatowanyString);
    }
    
}
