public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int cant_pags;
    private String editorial;
    private Fecha fecha_publicacion;
    public Libro(String titulo, String ISBN, int cant_pags, String editorial){
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.cant_pags = cant_pags;
        this.editorial = editorial;
    }
    public Libro(Persona autor){
        this.autor = autor;
    }
    public Libro(Fecha fecha_publicacion){
        this.fecha_publicacion = fecha_publicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getCant_pags() {
        return cant_pags;
    }
    public void setCant_pags(int cant_pags) {
        this.cant_pags = cant_pags;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Fecha getFecha_publicacion() {
        return fecha_publicacion;
    }
    public void setFecha_publicacion(Fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
    public void mostrar_info(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: ");
        autor.mostrarDatos();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Número de páginas: " + cant_pags);
        System.out.println("Editorial: " + editorial);
        System.out.println("Fecha de salida: " + fecha_publicacion.getDia() + "/" + fecha_publicacion.getMes() + "/" + fecha_publicacion.getAnio());
    }
    public void comparar_fecha(Libro libro2){
        if (fecha_publicacion.menor_que(libro2.fecha_publicacion)){
            System.out.println("El libro " + titulo + " antes que " + libro2.getTitulo());
        }else{
            System.out.println("El libro " + libro2.getTitulo() + " antes que " + titulo);
        }
    }
}

