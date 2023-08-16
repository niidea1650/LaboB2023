package sistema;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> tablas = Arrays.asList("Personal", "Personal_has_Programa", "Programa", "Vip", "Usuaios");
        AccesoBaseDatos bdd = new AccesoBaseDatos("politv", tablas);

        try {
            bdd.conectar("alumno", "alumnoipm");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        bdd.cargarConductores();
    }
}