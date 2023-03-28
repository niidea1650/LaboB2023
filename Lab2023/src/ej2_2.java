import java.util.ArrayList;
import java.util.Scanner;

public class ej2_2 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        int t_array;
        ArrayList<String> cadena  = new ArrayList<String>();
        System.out.println("ingresar cantidad de palabras:");
        t_array = palabras.nextInt();
        for (int i = 0; i < t_array; i++) {
            String palabra;
            System.out.println("ingresa la palabra " + (i + 1));
            palabra = palabras.nextLine();
            cadena.add(palabra);
        }
        System.out.println("Ingrese la letra para filtrar:");
        String letra = palabras.nextLine().substring(0, 1);
        System.out.println("Las cadenas que empiezan con " + letra + " son:");
        }
        for(String k: cadena) {
            if (cadena.startsWith(letra)) {
                System.out.println(cadena);
            }
    }
}
