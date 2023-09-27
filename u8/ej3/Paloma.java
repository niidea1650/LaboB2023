package u8.ej3;

public class Paloma implements Menasje{
    private String color;
    private String nombre;
    private static String especie;
    private boolean aprendioMapa;

    public Paloma(String color, String nombre, boolean aprendioMapa, String especie) {
        this.color = color;
        this.nombre = nombre;
        this.aprendioMapa = aprendioMapa;
        this.especie = "Paloma";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Paloma.especie = especie;
    }

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje() {

    }
}
