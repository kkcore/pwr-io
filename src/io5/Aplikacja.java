/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io5;

/**
 *
 * @author oszust
 */
public class Aplikacja {
    public Aplikacja(){};
    private ZarzadcaKatalog zarzadcaKatalogu = new ZarzadcaKatalog();
    private ZarzadcaKoszyk zarzadcaKoszyka = new ZarzadcaKoszyk();
    public void zarzadzajKoszykiem(){};
    public void edytujKatalog(){};
    public boolean uwierzytelnijUzytkownika(String idSesji){return true;};
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
