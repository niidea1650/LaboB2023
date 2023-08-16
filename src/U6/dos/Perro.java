package U6.dos;

public class Perro extends Mascotas{
    public Perro(String nombre, String saludo, String duenio) {
        super(nombre, saludo, duenio, Tipo.PERRO);
    }
    private Integer alegria = 0;
    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            System.out.println("Guau");
        }else{
            System.out.println("GUAU!");
        }
    }
    @Override
    void alimentar() {
        alegria = alegria + 1;
    }

}
