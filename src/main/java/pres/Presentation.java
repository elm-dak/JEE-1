package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
    //    DaoImpl dao =new DaoImpl();
        // Injection de dependances par instanciation statique => new
        DaoImpl2 dao =new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat = " +metier.calcul());
    }
}
