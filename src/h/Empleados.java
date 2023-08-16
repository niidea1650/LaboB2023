package h;

import Enums.Dias;
import u5.tres.Personas;

import java.util.Date;
import java.util.HashSet;

public class Empleados extends Personas {
    private HashSet<Dias> dias= new HashSet<Dias>();
    private HashSet<Date> fechas= new HashSet<Date>();
    public Empleados(String nombre, String apellido, int telefono, Date fecha) {
        super(nombre, apellido, telefono, fecha);
    }
public void porasis(){
        
}

    public static void main(String[] args) {

    }
}