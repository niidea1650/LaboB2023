package U6.dos;

public class Pajaro extends Mascotas{
    private boolean cantor;
    private Integer alegria = 0;

    public Pajaro(String nombre, String saludo, String duenio, boolean cantor) {
        super(nombre, saludo, duenio, Tipo.PAJARO);
        this.cantor = cantor;
    }

    public void canto(){
        if (cantor == true){
            System.out.println("pi pipi pipipu");
        }else{
            System.out.println("pio");
        }
    }
    @Override
  void saludo(boolean esDuenio) {
        if(esDuenio) {
           canto();
        }else{
            System.out.println("...");
        }
    }
    void alimentar() {
        alegria = alegria + 1;
    }
}
