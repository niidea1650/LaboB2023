package h;

import java.util.Date;

public class Pedido {
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