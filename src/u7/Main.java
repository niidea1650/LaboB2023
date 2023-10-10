package u7;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String nombre = null;



        try {
            System.out.println("si");
            System.out.println("El largo del nombre es:"+ nombre.length());
        }catch (NullPointerException exc){
            System.out.println("no");
        }
        System.out.println("desp");


/*
        try{
            throw new NullPointerException("si");
            System.out.println("El largo del nombre es:"+ nombre.length());
        }catch (NullPointerException exc){
            System.err.println(exc);
        }
*/

    }
}