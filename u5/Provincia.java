package u5;

import java.util.HashSet;

public class Provincia extends lugar{

    HashSet<ciudad> ciudades = new HashSet<ciudad>();
    public Provincia(String nombre, int codigo, HashSet<coordenadas> coordenada) {
        super(nombre, codigo, coordenada);
    }

    public HashSet<ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
