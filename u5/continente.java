package u5;

import java.util.HashSet;

public class continente extends lugar {
    HashSet<pais> Paises = new HashSet<pais>();
    public continente(String nombre, int codigo, HashSet<coordenadas>coordenada){
        super(nombre, codigo, coordenada);
    }

    public HashSet<pais> getPaises() {
        return Paises;
    }

    public void setPaises(HashSet<pais> paises) {
        Paises = paises;
    }
}
