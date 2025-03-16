package org.example.presentation;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class presentationDynamique {
    public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        System.out.println(metierClassName);
        Class cMetier = Class.forName(metierClassName);
        System.out.println(cMetier);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("end "+metier.calcul());

    }
}
