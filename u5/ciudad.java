package u5;

import java.util.HashSet;

public class ciudad extends lugar{
    HashSet<barrio> barrio = new HashSet<barrio>();

    public ciudad(String nombre, int codigo, HashSet<coordenadas> coordenada) {
        super(nombre, codigo, coordenada);
    }

    public HashSet<u5.barrio> getBarrio() {
        return barrio;
    }

    public void setBarrio(HashSet<u5.barrio> barrio) {
        this.barrio = barrio;
    }
}
