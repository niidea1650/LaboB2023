package u7;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor {
    private String nombre;
    private LocalDate fechaN;
    private int DNI;
    private HashSet<LibroElectronico>bibliografia;

    public Autor(String nombre, LocalDate fechaN, int DNI, HashSet<LibroElectronico> bibliografia) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.DNI = DNI;
        this.bibliografia = bibliografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public HashSet<LibroElectronico> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<LibroElectronico> bibliografia) {
        this.bibliografia = bibliografia;
    }
    public void libroAlcanzoLimite (){

    }
}
