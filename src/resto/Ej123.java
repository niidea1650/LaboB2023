import java.util.ArrayList;
import java.util.Scanner;

public class Ej123 {
    public static void main(String[] args) {
        Scanner enteross = new Scanner(System.in);
        int t_array;
        int suma = 0;
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        System.out.println("ingresar cantidad de numeros:");
        t_array = enteross.nextInt();
        for (int i = 0; i < t_array; i++){
            int u;
            System.out.println("ingresa el valor " + (i+1));
            u = enteross.nextInt();
            enteros.add(u);
        }
        for (int n : enteros){
            suma = suma + n;
        }
        System.out.println("la suma total es:" + suma);


        String c;
        char l;
        int t = 0;
        ArrayList<String> cadena  = new ArrayList<String>();
        System.out.println("ingresar cantidad de elemetos :");
        t = enteross.nextInt();
        for(int i = 0; i < t; i++){
            String e;
            System.out.println("ingresar el elemento " + (i+1));
            e = enteross.nextLine();
            cadena.add(e);
        }
        System.out.println("ingresar una letra :");
        l = (char) enteross.nextShort();

    }
}