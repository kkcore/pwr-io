/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.Currency;
import java.time.LocalDate;

/**
 *
 * @author oszust
 */
public class PozycjaKoszyk {
    LocalDate data;
    int iloscWZamowieniu;
    double cenaWZamowieniu;
    Produkt produkt;
    public PozycjaKoszyk(Produkt produkt, LocalDate data, int iloscWZamowieniu){
        this.produkt = produkt;
        LocalDate localdate = LocalDate.now();
        if (data.compareTo(localdate) < 0 )
            throw new java.lang.Error("Zła data");
        if (iloscWZamowieniu < produkt.getIloscStan())
           throw new java.lang.Error("Za duża ilość");
        this.data = data;
        this.iloscWZamowieniu = iloscWZamowieniu;
    };
    
    public LocalDate getData(){return this.data;}
    public void setData(LocalDate value){this.data = value;}
    public int getIloscWZamowieniu(){return this.iloscWZamowieniu;}
    public void setIloscWZamowieniu(int value){this.iloscWZamowieniu = value;}
    public double getCenaWZamowieniu(){return this.cenaWZamowieniu;}
    public void setCenaWZamowieniu(double value){this.cenaWZamowieniu = value;}
    public Produkt getProdukt(){return this.produkt;}
    public void setIloscWZamowieniu(Produkt value){this.produkt = value;}
}
