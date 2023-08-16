package U6.dos;

import java.util.HashSet;

public class Sistema {
    HashSet<Mascotas> mascota = new HashSet<Mascotas>();

    private void saludar (Mascotas mascota, String  duenio){
        boolean saludarr = true;
            if(mascota.getDuenio() == duenio ) {
            saludarr = true;
            }else if(mascota.getTipo() == Tipo.PEZ){
                saludarr = false;
                this.mascota.remove(mascota);
            }
        mascota.saludo(saludarr);
    }
    private void alimentarPeces (Mascotas mascota, int vida){
        if(mascota.getTipo() == Tipo.PEZ){
            vida = vida +1;
        }else{
            System.out.println("solo los peces pueden ser alimentados");
        }
    }

}

