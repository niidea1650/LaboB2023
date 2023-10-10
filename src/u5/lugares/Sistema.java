package u5.lugares;

import u5.lugares.lugar;

import java.util.HashSet;

public class Sistema {
    HashSet<u5.lugares.lugar> lugar = new HashSet<>();

    public Sistema(HashSet<lugar> lugar) {
        this.lugar = lugar;
    }

    public int poblacionXcodigo(int codigo) {
        int p = 0;
        for (lugar lugares : lugar) {
            if (codigo == lugares.getCodigo()) {
                p = lugares.calcPoblacion();
            }
        }
        return p;
    }
}
