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
    private Currency cena;
    private int iloscStan;
    private int iloscCalkowita;
    public int getId(){return this.id;}
    public void setId(int value){this.id = value;}
    public String getNazwa(){return this.nazwa;}
    public void setNazwa(String value){this.nazwa = value;}
    public Currency getCena(){return this.cena;}
    public void setCena(Currency value){this.cena = value;}
    public int getIloscCalkowita(){return this.iloscCalkowita;}
    public void setIloscCalkowita(int value){this.iloscCalkowita = value;}
    public int getIloscStan(){return this.iloscStan;}
    public void setIloscStan(int value){this.iloscStan = value;}
    
}
