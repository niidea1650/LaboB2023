package u8.ej4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Equipo equipo1 = new Equipo("al hilal");
        Equipo equipo2 = new Equipo("il Bubakar");

        Jug_cancha juan = new Jug_cancha("juan", 23, LocalDate.of(2000, 12, 12),"MedioCampista",provincias.BUENOS_AIRES,3,equipo1,8,2,3);
        HashMap<Jug_cancha, Integer> Goles_juan =new HashMap<>();
        Goles_juan.put()
        Partido partido = new Partido(equipo1, equipo2, 2, 1, 2, 23, 24);
    }
}
