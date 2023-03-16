package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUnit {
    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    public  static int nbbefore =0;
    public static int nbafter=0;
    @Before
    public void init(){
         nbbefore++;
         m12CHF= new SommeArgent(12, "CHF");
         m14CHF= new SommeArgent(14, "CHF");
         System.out.println(nbbefore+"ime passage avant" +
                 " exécution d'une méthode de test");
    }
    @Test
    public void add() throws UniteDistincteException {

        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);
        Assert.assertTrue(expected.equals(result));
    }
    @Test
    public void equals(){
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent m14USD= new SommeArgent(14, "USD");
        //Assert.assertTrue(!m12CHF.equals(null));
       //  Assert.assertEquals(m12CHF, m12CHF);
       // Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
      // Assert.assertTrue(!m12CHF.equals(m14CHF));
      //  Assert.assertTrue(!m14USD.equals(m14CHF));

    }
    @Test(expected = UniteDistincteException.class)
    public void TestAddWithoutException() throws UniteDistincteException{
        SommeArgent m14USD= new SommeArgent(14, "USD");
        m14CHF.add(m14USD);

    }
    @After
    public void AfterExec(){
        nbafter++;
        System.out.println(nbafter + "ime passage APRES exécution"+
               " d'une méthode de test");
    }

}
