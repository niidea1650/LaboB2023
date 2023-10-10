package u7;

public class LibroElectronico {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String nombreArchivo;
    private static int cantDescargas;

    public LibroElectronico(String titulo, Autor autor, Genero genero, String nombreArchivo, int cantDescargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombreArchivo = nombreArchivo;
        this.cantDescargas = 100;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public static int getCantDescargas() {
        return cantDescargas;
    }

    public static void setCantDescargas(int cantDescargas) {
        LibroElectronico.cantDescargas = cantDescargas;
    }
}
