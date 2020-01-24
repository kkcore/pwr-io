/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikacja;

import Uzytkownik.Uzytkownik;
import io5.Koszyk.ZarzadcaKoszyk;
import io5.Katalog.ZarzadcaKatalog;
/**
 *
 * @author oszust
 */
public class Aplikacja {
    public Aplikacja(){};
    public ZarzadcaKatalog zarzadcaKatalog = new ZarzadcaKatalog();
    public final ZarzadcaKoszyk zarzadcaKoszyk = new ZarzadcaKoszyk(zarzadcaKatalog);
    public static Uzytkownik uzytkownik = new Uzytkownik("Jan Kowalski");
    public boolean uwierzytelnijUzytkownika(String idSesji){return true;};
}
