package h;
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

        public float obtenerDescuento() {
            return porcentajeDescuento;
        }

        @Override
        public void mostrarDatos() {

        }
    }