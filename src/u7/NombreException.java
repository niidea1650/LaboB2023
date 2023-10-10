package u7;

public class NombreException extends Exception{
    public NombreException(String nombre){
        super(nombre);
    }

    public void nombre(String nombre)throws Exception{
        nombre = null;
    }
}