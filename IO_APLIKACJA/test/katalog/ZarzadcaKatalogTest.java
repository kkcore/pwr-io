/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Xavier Davis
 */
@Category({TestControl.class, TestEntity.class}) //określenie kategorii testu, zastosowanie - p.2.7.1, 2.7.3
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ZarzadcaKatalogTest {
    
    static Dane dane;
    
    static ZarzadcaKatalog instance;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @BeforeClass
    public static void setUp() {
        instance = new ZarzadcaKatalog();
        dane = new Dane();
        
        List <Produkt> przykl = new ArrayList<Produkt>();
        
        for(int i=0; i<8; i++)
        {
            przykl.add(dane.produkty[i]);
        }
        
        instance.katalog.produkty = przykl;
        instance.przykladoweProdukty = przykl;
    }
    
    @Test
    public void testUsuwanieProduktu() {
        System.out.println("usuwanieProduktu");
        int ile = instance.katalog.produkty.size();
        for(int i=1; i<=8; i++)
        {
            instance.usuwanieProduktu();
            assertEquals(ile - i, instance.katalog.produkty.size());
        }
    }
    
    @Test
    @Category(TestProdukt.class)
    public void testDodawanieProduktu(){
        System.out.println("dodawanieProduktu");
        int ile = instance.katalog.produkty.size();
        for(int i=1; i<=8; i++)
        {
            instance.dodawanieProduktu();
            assertEquals(ile + i, instance.katalog.produkty.size());
        }
    }
    
    @Test
    @Category(TestProdukt.class)
    public void testWybierzProdukt(){
        System.out.println("wybierzProdukt");
        Produkt produkt;
        for(int i=0; i<8; i++)
        {
            produkt = instance.wybierzProdukt();
            assert(instance.katalog.produkty.contains(produkt));
        }
        
    }
}
