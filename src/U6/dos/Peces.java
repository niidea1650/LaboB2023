package U6.dos;

public class Peces extends Mascotas{

    private int vida = 10;
    public Peces(String nombre, String saludo, String duenio) {
        super(nombre, saludo, duenio, Tipo.PEZ);
    }

    @Override
    void saludo(boolean esDuenio) {
        if(esDuenio) {
            vida = vida - 1;
            System.out.println("vida -1");
        }else{
            vida = 0;
            System.out.println("se te murio");
        }
    }
    @Override
    void alimentar() {
        vida = vida + 1;
    }


}
