/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

/**
 *
 * @author Xavier Davis
 */
public class Dane {
    
    Produkt produkty[] = {new Produkt("Narty", 3.99, 20), new Produkt("Buty traperskie", 1.99, 80), new Produkt("Spiwor", 2.99, 40), new Produkt("Scyzoryk Husqvarna", 0.99, 40),
    new Produkt("Kijki do nordic walking", 2.99, 50), new Produkt("Scyzoryk ostry", 1.99, 20), new Produkt("Koc", 1.99, 30), new Produkt("Scyzoryk czarny", 1.49, 40),
    new Produkt("Rekawice gumowe", 2.99, 15)};
    
    int indeksyEdycji[] = {4, 5, 3, 1, 0, 0, 1, 8};
    int rodzajeEdycji[] = {1, 1, 0, 0, 1, 0, 1, 0};
    
    String nazwyProduktow[] = {"Narty", "Buty traperskie", "Spiwor", "Scyzoryk Husqvarna", "Kijki do nordic walking", "Scyzoryk ostry", "Koc", "Scyzoryk czarny", "Rekawice gumowe"};
    double cenyProduktow[] = {3.99, 1.99, 2.99, 0.99, 2.99, 1.99, 1.99, 1.49, 2.99};
    int ilosciProduktow[] = {20, 80, 40, 40, 50, 20, 30, 40, 15};
    
}
