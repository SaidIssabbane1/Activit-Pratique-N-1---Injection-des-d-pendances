package org.example.presentation;

import org.example.dao.DaoImpl;
import org.example.dao.IDao;
import org.example.ext.DaoImplV2;
import org.example.metier.MetierImpl;

public class presentationStatic {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println(metier.calcul());
    }
}
