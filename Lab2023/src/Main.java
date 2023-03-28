public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        Persona autor = new Persona(0, 24, "gastro");
        cancion.setTitulo("Nashe");
        cancion.setAutor(autor);
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: ");
        autor.mostrarDatos();

        Persona autor1 = new Persona(0,0,"op");
        Fecha fecha1 = new Fecha(12,4,1989);
        Libro libro1 = new Libro("fa","2 2345 6789",667,"Santillana");
        libro1.setAutor(autor1);
        libro1.setFecha_publicacion(fecha1);
        Persona autor2 = new Persona(0,0,"op");
        Fecha fecha2 = new Fecha(30,7,1960);
        Libro libro2 = new Libro("lo","8 9876 4532",144,"Got");
        libro1.setAutor(autor2);
        libro1.setFecha_publicacion(fecha2);
    }
}
