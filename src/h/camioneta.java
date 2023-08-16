package h;

public class camioneta extends vehiculos {
    private int capacidadCarga;
    private String patente;

    public camioneta(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion, int capacidadCarga, String patente) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
    }
}
