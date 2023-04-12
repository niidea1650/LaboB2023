package h1;

public class auto extends vehiculos{
    private boolean esDescapotable;
    private String patente;

    public auto(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion, boolean esDescapotable, String patente) {
        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
        this.esDescapotable = esDescapotable;
        this.patente = patente;
    }
}

