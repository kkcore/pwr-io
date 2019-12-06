/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

import java.util.Date;

/**
 *
 * @author oszust
 */
public class ZarzadcaKoszyk {
    private Koszyk koszyk = new Koszyk();
    public ZarzadcaKoszyk(){};
    public void rodzajEdycjiKoszyka(){};
    public void usunPozycje(){};
    public void wybierzPozycje(){};
    public boolean potwierdz(){return false;}
    public int wprowadzWartosc(){return 0;}
    public Date wprowadzDate(){return null;}
    public void dodajPozycje(){};
}
