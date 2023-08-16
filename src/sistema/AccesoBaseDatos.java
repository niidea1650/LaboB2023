package sistema;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AccesoBaseDatos {
    private Connection conexion;
    private String nombreBaseDeDatos;
    private List<String> nombreTabla;

    public AccesoBaseDatos(String nombreBaseDeDatos, List<String> nombreTabla) {
        this.nombreBaseDeDatos = nombreBaseDeDatos;
        this.nombreTabla = nombreTabla;
    }

    public void conectar(String user, String password) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/"+nombreBaseDeDatos;
        try {
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Se ha conectado exitósamente a la base de datos");
            } else {
                System.out.println("No se ha podido conectar a la base de datos");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public HashMap<String, Object> almacenarDatos(Object... datos) {
        HashMap<String, Object> datosNuevos = new HashMap<>();
        for (int i = 0; i < datos.length; i = i + 2) {
            datosNuevos.put((String) datos[i], datos[i + 1]);
        }
        return datosNuevos;
    }

    public ArrayList<String> obtenerColumnasDeUnaTabla(String nombreTabla) {
        String consulta = "SHOW COLUMNS FROM " + nombreTabla;
        ArrayList<String> nombreCampos = new ArrayList<>();
        try {
            ResultSet data;
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {
                nombreCampos.add(data.getString("Field"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nombreCampos;
    }

    public int obtenerId(String nombreTabla, String atributo, Object valor) {
        int id = 0;
        ResultSet data ;
        String atributoPK= obtenerColumnasDeUnaTabla(nombreTabla).get(0);
        String consulta = "SELECT "+ atributoPK+ " FROM " + nombreTabla + " where " + atributo + " = " + "\"" + valor + "\"";
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {
                id=data.getInt(atributoPK);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }

    public ArrayList<String> obtenerSelectConMasDeUnValor(String nombreTabla, String nombreCampo,String columnaTabla,Object condicion){
        ResultSet data;
        ArrayList<String> valorCampo=new ArrayList<>();
        String consulta= "Select "+ nombreCampo+ " from " + nombreTabla+" where "+columnaTabla+"="+"\""+condicion+"\""+";";
        System.out.println(consulta);
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {
                valorCampo.add(data.getString(nombreCampo));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return valorCampo;
    }

    public boolean ifExists(String nombreTabla, String columnaTabla,Object condicion){
        ResultSet data;
        ArrayList<String> valorCampo=new ArrayList<>();
        boolean existe=true;
        String consulta= "Select * "+ " from " + nombreTabla+" where "+columnaTabla+"="+"\""+condicion+"\""+";";
        System.out.println(consulta);
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                // El campo Field es el que contiene el nombre
                // de la columna

                valorCampo.add(data.getString(columnaTabla));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (valorCampo.size()!=0){

        }else{
            existe=false;

        }
        return existe;
    }


    public String obtenerValorDeUnCampo(String nombreTabla, String nombreCampo, int id){
        ResultSet data;
        String valorCampo=null;
        String columnaId=obtenerColumnasDeUnaTabla(nombreTabla).get(0);
        String consulta= "Select "+ nombreCampo+ " from " + nombreTabla+" where "+columnaId+"="+id+";";
        System.out.println(consulta);
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {
                // El campo Field es el que contiene el nombre
                // de la columna
                valorCampo=data.getString(nombreCampo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return valorCampo;
    }
    public void actualizarVecesSolicitada(String nombreTabla, String nombreCampo, int id){
        int valorCampoPrevio= Integer.parseInt(obtenerValorDeUnCampo(nombreTabla,nombreCampo, id));
        String columnaId=obtenerColumnasDeUnaTabla(nombreTabla).get(0);
        String consulta= "Update "+nombreTabla+" set " + nombreCampo+ "=" +valorCampoPrevio + "+1"+ " where " + columnaId + "=" +id+";";
        System.out.println(consulta);

        try{
            PreparedStatement sentenciaSQL=conexion.prepareStatement(consulta);
            int result=sentenciaSQL.executeUpdate();

            if(result>0){
                System.out.println("Actualizacion hecha");
            }
            else{
                System.out.println("Fallo actualizacion");
            }

            sentenciaSQL.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void actualizarEstado(String nombreTabla, String nombreCampo, int id){
        String valorCampoPrevio= (obtenerValorDeUnCampo(nombreTabla,nombreCampo, id)).toUpperCase();
        String columnaId=obtenerColumnasDeUnaTabla(nombreTabla).get(0);
        boolean estadoQueHayQueponer=true;
        if(valorCampoPrevio.equals("1")){
            estadoQueHayQueponer=false;
        }
        String consulta= "Update "+nombreTabla+" set " + nombreCampo+ "=" + estadoQueHayQueponer + " where " + columnaId + "=" +id+";";
        System.out.println(consulta);

        try{
            PreparedStatement sentenciaSQL=conexion.prepareStatement(consulta);
            int result=sentenciaSQL.executeUpdate();

            if(result>0){
                System.out.println("Actualizacion hecha");
            }
            else{
                System.out.println("Fallo actualizacion");
            }

            sentenciaSQL.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int obtenerValorMaximo(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "SELECT max("+ nombreColumna+ ") FROM " + nombreTabla+ ";" ;

        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }



    public HashMap<Integer, HashMap<String, Object>>cargarConductores(){
        HashMap<Integer, HashMap<String, Object>>tabla = new HashMap<Integer, HashMap<String, Object>>();
        HashMap<String, Object>datos;
        ResultSet data ;

        ArrayList<String>nombresColumna = obtenerColumnasDeUnaTabla("Programa");

        String consulta = "SELECT * FROM Programa";
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                datos = new HashMap<String, Object>();

                datos.put(nombresColumna.get(1), data.getString(nombresColumna.get(1)));

                datos.put(nombresColumna.get(2),  data.getString(nombresColumna.get(2)));

                datos.put(nombresColumna.get(3), data.getString(nombresColumna.get(3)));

                datos.put(nombresColumna.get(4), data.getString(nombresColumna.get(4)));

                datos.put(nombresColumna.get(5), data.getBoolean(nombresColumna.get(5)));

                datos.put(nombresColumna.get(6), data.getDate(nombresColumna.get(6)));

                tabla.put(data.getInt(nombresColumna.get(0)), datos);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tabla;
    }


    /*B*/
    public int personalMasJovenPorPrograma(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "    SELECT P.titulo, P.desc, P.duracion, Pe.nombrep, Pe.apellidop, Pe.Rol\n" +
                "    FROM Programa Pr\n" +
                "    INNER JOIN Personal_has_Programa PPr ON Pr.IdPrograma = PPr.Programa_IdPrograma\n" +
                "    INNER JOIN Personal Pe ON PPr.Personal_id_personal = Pe.id_personal\n" +
                "    WHERE Pr.Cantidad_Determinada_Conductores = 'Conductor'\n" +
                "    ORDER BY Pe.Rol;";
        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*C*/
    public int programasEnLosCualesNoSeAlcanceElPersonalMínimaRequerido(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "SELECT p.titulo FROM Programa p LEFT JOIN Personal_has_Programa php ON p.idPrograma = php.Programa_idPrograma GROUP BY p.idPrograma, p.titulo HAVING COUNT(php.Personal_id_personal) < p.Cantidad_Determinada_Conductores";
        ;


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*D*/
    public int modificacion(String nombreTabla, String nombreColumna){
        //d. Hacer las modificaciones necesarias para que en un programa de 3 conductores se incorpore uno más que ya 2exista en la empresa y no seaconductordeotroprograma
        int id = 0;
        ResultSet data ;
        String consulta = "";


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*E*/
    public int personalQueRompeRegla(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "SELECT pe.nombrep, pe.apellidop FROM Personal pe INNER JOIN Personal_has_Programa php ON pe.id_personal = php.Personal_id_personal GROUP BY pe.id_personal, pe.nombrep, pe.apellidop HAVING COUNT(php.Programa_idPrograma) > 1;";
        ;


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*F*/
    public int espectadoresVipPorPrograma(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "SELECT p.titulo, u.nombre, u.apellido FROM Programa p INNER JOIN Vip v ON p.idPrograma = v.Programa_idPrograma INNER JOIN Usuarios u ON v.Usuarios_NdeUsuario = u.NdeUsuario";
        ;


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*G*/
    public int programaConMenosUsuariosVips(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "SELECT Programa.titulo, Personal.nombrep, Personal.apellidop FROM Programa, Personal_has_Programa, Personal WHERE Programa.idPrograma = Personal_has_Programa.Programa_idPrograma AND Personal_has_Programa.Personal_id_personal = Personal.id_personal AND Personal.Rol = \"Conductor\";";


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }


    /*H*/
    public int primerYUltimoPrograma(String nombreTabla, String nombreColumna){
        int id = 0;
        ResultSet data ;
        String consulta = "";


        try {
            PreparedStatement sentenciaSQL = conexion.prepareStatement(consulta);
            data = sentenciaSQL.executeQuery(consulta);
            while (data.next() == true) {

                id=data.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
}