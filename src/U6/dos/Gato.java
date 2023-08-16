package U6.dos;

public class Gato extends Mascotas{
    public Gato(String nombre, String saludo, String duenio) {
        super(nombre, saludo, duenio, Tipo.GATO);
    }
    private Integer alegria = 0;
    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            System.out.println("Miau");
        }else{
            System.out.println("MIAU!");
        }
    }

    @Override
    void alimentar() {
            alegria = alegria + 1;
    }

}
