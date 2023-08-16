package u5.lugares;

import java.util.HashSet;

public class ciudad extends lugar {
    HashSet<u5.lugares.barrio> barrio = new HashSet<barrio>();

    public ciudad(String nombre, int codigo, HashSet<coordenadas> coordenada) {

        super(nombre, codigo, coordenada);
    }

    public HashSet<u5.lugares.barrio> getBarrio() {

        return barrio;
    }

    public void setBarrio(HashSet<u5.lugares.barrio> barrio) {

        this.barrio = barrio;
    }
    @Override
    public int calcPoblacion(){
        int cantPo = 0;
        for (barrio barr:barrio){
            barr.getPoblacion();
            cantPo = cantPo + barr.getPoblacion();
        }
        return cantPo;
    }
}
