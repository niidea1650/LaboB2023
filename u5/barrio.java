package u5;

import java.util.HashSet;

public class barrio extends lugar{
    int poblacion;
    public barrio(String nombre, int codigo, HashSet<coordenadas> coordenada, int poblacion) {
        super(nombre, codigo, coordenada);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public int calcPoblacion(){
        return poblacion;
    }
}
