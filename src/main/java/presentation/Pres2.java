package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.getConstructor().newInstance();


        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);




        System.out.println("Res" +metier.calcul());

    }
}