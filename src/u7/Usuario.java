package u7;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate fechaN;
    private int DNI;
    private String mail;
    private String librosPrestados;
    private Membresia membresia;
    private int libros;

    public Usuario(String nombre, LocalDate fechaN, int DNI, String mail, String librosPrestados, Membresia membresia, int libros) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.DNI = DNI;
        this.mail = mail;
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
        this.libros = libros;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(String librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public int getLibros() {
        return libros;
    }

    public void setLibros(int libros) {
        this.libros = libros;
    }
    public void tipoMembresia(){
        if(membresia == Membresia.BRONCE){
            libros = 5;
        } else if (membresia == Membresia.PLATA) {
            libros = 15;
        }else {
            libros = 50;
        }
    }
}
