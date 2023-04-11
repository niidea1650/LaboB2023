import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    private String apellido;
    private int fecha;
    private int lista;
    private ArrayList<Double> notas;

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String agregar;
    }

    public Notas(String apellido, int fecha, int lista, ArrayList<Double> notas) {
        this.apellido = apellido;
        this.fecha = fecha;
        this.lista = lista;
        this.notas = notas;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getLista() {
        return lista;
    }

    public void setLista(int lista) {
        this.lista = lista;
    }

    public void agregar(double nota) {
        notas.add(nota);
    }

    public double mayor() {
        double mayorNota = Double.MIN_VALUE;
        for (double nota : notas) {
            if (nota > mayorNota) {
                mayorNota = nota;
            }
        }
        return mayorNota;
    }

    public double menor() {
        double menorNota = Double.MAX_VALUE;
        for (double nota : notas) {
            if (nota > menorNota) {
                menorNota = nota;
            }
        }
        return menorNota;
    }
}