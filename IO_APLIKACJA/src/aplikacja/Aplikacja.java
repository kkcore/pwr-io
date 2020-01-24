/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacja;

import uzytkownik.Uzytkownik;
import katalog.ZarzadcaKatalog;
import koszyk.ZarzadcaKoszyk;

/**
 *
 * @author oszust
 */
public class Aplikacja {
    public Aplikacja(){};
    public ZarzadcaKatalog zarzadcaKatalog = new ZarzadcaKatalog();
    public final ZarzadcaKoszyk zarzadcaKoszyk = new ZarzadcaKoszyk(zarzadcaKatalog);
    public static Uzytkownik uzytkownik = new Uzytkownik("Jan Kowalski");
    public void zarzadzajKoszykiem(){};
    public void edytujKatalog(){};
    public boolean uwierzytelnijUzytkownika(String idSesji){return true;};


}
