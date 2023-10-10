import java.util.ArrayList;
import java.util.Scanner;

public class ej2_2 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        int t_array;
        char letra;
        String palabra = " ";
        ArrayList<String> cadena = new ArrayList<String>();
        System.out.println("ingresar cantidad de palabras:");
        t_array = palabras.nextInt();
        for (int i = 0; i < t_array; i++) {
            System.out.println("ingresa la palabra " + (i + 1));
            palabra = palabras.next();
            cadena.add(palabra);
        }
        System.out.println("Ingrese la letra para filtrar:");
        letra = palabras.next().charAt(0);
        System.out.println("Las cadenas que empiezan con " + letra + " son:");

        for (String palabraActual : cadena) {
            if (palabraActual.charAt(0) == letra) {
                System.out.println(palabraActual);
            }
        }
    }
}