import java.util.ArrayList;
import java.util.Scanner;
public class marca {
    public static class Herencia_1 {
        public abstract class Vehiculo {
            protected String marca;
            protected String modelo;
            protected String color;
            protected int cantidadRuedas;
            protected int anioFabricacion;

            public Vehiculo(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion) {
                this.marca = marca;
                this.modelo = modelo;
                this.color = color;
                this.cantidadRuedas = cantidadRuedas;
                this.anioFabricacion = anioFabricacion;
            }

            public boolean esDescapotable() {
                return false;
            }
        }

        public class Auto extends Vehiculo {
            private boolean esDescapotable;
            private String patente;

            public Auto(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion, boolean esDescapotable, String patente) {
                super(marca, modelo, color, cantidadRuedas, anioFabricacion);
                this.esDescapotable = esDescapotable;
                this.patente = patente;
            }

            // Getters y setters de los atributos adicionales
        }

        public class Camioneta extends Vehiculo {
            private int capacidadCarga;
            private String patente;

            public Camioneta(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion, int capacidadCarga, String patente) {
                super(marca, modelo, color, cantidadRuedas, anioFabricacion);
                this.capacidadCarga = capacidadCarga;
                this.patente = patente;
            }

            // Getters y setters de los atributos adicionales

            public boolean agregarCarga(int peso) {
                if (peso <= capacidadCarga) {
                    capacidadCarga -= peso;
                    return true;
                } else {
                    return false;
                }
            }
        }

        public class Empresa {
            private ArrayList<Auto> autos;
            private ArrayList<Camioneta> camionetas;

            public Empresa() {
                autos = new ArrayList<>();
                camionetas = new ArrayList<>();
            }

            public void agregarAuto(Auto auto) {
                autos.add(auto);
            }

            public void agregarCamioneta(Camioneta camioneta) {
                camionetas.add(camioneta);
            }

            public int cantidadAutos() {
                return autos.size();
            }

            public int cantidadCamionetas() {
                return camionetas.size();
            }

            public float porcentajeAutosDescapotables() {
                int totalAutos = cantidadAutos();
                if (totalAutos == 0) {
                    return 0;
                } else {
                    int autosDescapotables = 0;
                    for (Auto auto : autos) {
                        if (auto.esDescapotable()) {
                        }
                    }
                }
                return 0;
            }
        }
    }
}
