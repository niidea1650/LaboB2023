package h;

public class vehiculos {
        protected String marca;
        protected String modelo;
        protected String color;
        protected int cantidadRuedas;
        protected int anioFabricacion;

        public vehiculos(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion) {
                this.marca = marca;
                this.modelo = modelo;
                this.color = color;
                this.cantidadRuedas = cantidadRuedas;
                this.anioFabricacion = anioFabricacion;
        }
}