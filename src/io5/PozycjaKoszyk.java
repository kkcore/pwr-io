/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.Currency;
import java.util.Date;

/**
 *
 * @author oszust
 */
public class PozycjaKoszyk {
    Date data;
    int iloscWZamowieniu;
    Currency cenaWZamowieniu;
    Produkt produkt;
    PozycjaKoszyk(int id, Date data, int iloscWZamowieniu){};
    public Date getData(){return this.data;}
    public void setData(Date value){this.data = value;}
    public int getIloscWZamowieniu(){return this.iloscWZamowieniu;}
    public void setIloscWZamowieniu(int value){this.iloscWZamowieniu = value;}
    public Currency getCenaWZamowieniu(){return this.cenaWZamowieniu;}
    public void setCenaWZamowieniu(Currency value){this.cenaWZamowieniu = value;}
    public Produkt getProdukt(){return this.produkt;}
    public void setIloscWZamowieniu(Produkt value){this.produkt = value;}
}
