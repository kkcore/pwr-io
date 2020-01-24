/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5.Koszyk;

import io5.Katalog.Produkt;
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
        if (iloscWZamowieniu < 0) {
        this.produkt = produkt;
        LocalDate localdate = LocalDate.now();
        if (data.compareTo(localdate) < 0 )
            throw new java.lang.Error("Zła data");
        if (iloscWZamowieniu > produkt.getIloscStan())
           throw new java.lang.Error("Za duża ilość");
        this.data = data;
        this.iloscWZamowieniu = iloscWZamowieniu;
        }
        else {
           throw new java.lang.Error("Ilość w zamówieniu nie może być ujemna");
        }
    };
    
    public LocalDate getData(){return this.data;}
    public void setData(LocalDate value){this.data = value;}
    public int getIloscWZamowieniu(){return this.iloscWZamowieniu;}
    public void setIloscWZamowieniu(int value){this.iloscWZamowieniu = value;}
    public double getCenaWZamowieniu(){return this.cenaWZamowieniu;}
    public void setCenaWZamowieniu(double value){this.cenaWZamowieniu = value;}
    public Produkt getProdukt(){return this.produkt;}
    public void setIloscWZamowieniu(Produkt value){this.produkt = value;}
    
    @Override
    public String toString() {
        return String.format("%s %s %s", this.getProdukt().getNazwa(), this.getData().toString(), this.getIloscWZamowieniu());
    }
}
