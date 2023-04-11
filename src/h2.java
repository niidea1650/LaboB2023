import java.util.ArrayList;
import java.util.Scanner;
public class h2 {
    public class Alumno extends Persona {
        private String division;

        public Alumno(String nombre, String apellido, String division) {
            super(nombre, apellido);
            this.division = division;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        @Override
        public float obtenerDescuento() {
            return 0;
        }
    }
    public class Profesor extends Persona {
        private float porcentajeDescuento;

        public Profesor(String nombre, String apellido, float porcentajeDescuento) {
            super(nombre, apellido);
            this.porcentajeDescuento = porcentajeDescuento;
        }

        public float getPorcentajeDescuento() {
            return porcentajeDescuento;
        }

        public void setPorcentajeDescuento(float porcentajeDescuento) {
            this.porcentajeDescuento = porcentajeDescuento;
        }

        @Override
        public float obtenerDescuento() {
            return porcentajeDescuento;
        }
    }
    public class Plato {
        private String nombre;
        private float precio;

        public Plato(String nombre, float precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }
    }public class Pedido {
        private Date fechaCreacion;
        private Plato plato;
        private Persona persona;
        private Date horaEntrega;
        private boolean entregado;

        public Pedido(Plato plato, Persona persona, Date horaEntrega) {
            this.fechaCreacion = new Date();
            this.plato = plato;
            this.persona = persona;
            this.horaEntrega = horaEntrega;
            this.entregado = false;
        }

        public Date getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(Date fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
        }

        public Plato getPlato() {
            return plato;
        }

        public void setPlato(Plato plato) {
            this.plato = plato;
        }

        public Persona getPersona() {
            return persona;
        }

        public void setPersona(Persona persona) {
            this.persona = persona;
        }

        public Date getHoraEntrega() {
            return horaEntrega;
        }

        public void setHoraEntrega(Date horaEntrega) {
            this.horaEntrega = horaEntrega;
        }

        public boolean isEntregado() {
            return entregado;
        }

        public void setEntregado(boolean entregado) {
            this.entregado = entregado;
        }
    }
    import java.util.ArrayList;
import java.util.Date;

    public class Menu {
        private ArrayList<Alumno> alumnos;
        private ArrayList<Profesor> profesores;
        private ArrayList<Plato> platos;
}
