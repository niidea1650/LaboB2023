public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    public Coche(){
        this.marca="n/a";
        this.modelo="n/a";
        this.color="n/a";
        this.velocidad=0;
    }
    public Coche(String marca, String modelo, String color, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
    }
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() { return velocidad; }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public int acelerar(int velocidad){
        velocidad = velocidad + 2;
        return velocidad;
    }
    public int frenar(int velocidad){
        velocidad = 0;
        return velocidad;
    }
    public void mostrarVelocidad(){
        System.out.println("la velocidad del auto es: " + velocidad);
    }

    public static class Campeonatos {

    }

    public static class Prueba {
        public class SeleccionFutbol{
        protected int id;
        protected String nombre;
        protected String apellido;
        protected int edad;

            public SeleccionFutbol() {

            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public void setApellido(String apellido) {
                this.apellido = apellido;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
            }
            // getter y setter
            // constructor

        public void concentrarse(){

        }

        public void viajar() {

        }

    }
        public class Futbolista extends SeleccionFutbol {
            private int dorsal;
            private String demarcacion;

            public Futbolista(){
                super();
            }

            public int getDorsal() {
                return dorsal;
            }

            public void setDorsal(int dorsal) {
                this.dorsal = dorsal;
            }

            public String getDemarcacion() {
                return demarcacion;
            }

            public void setDemarcacion(String demarcacion) {
                this.demarcacion = demarcacion;
            }
            // getter y setter

            public void jugarPartido(){
            }

            public void entrenar(){
            }

            public void concentrarse(){
                boolean concentro = true;
            }

        }
        public class Entrenador extends SeleccionFutbol {
            private String idFederacion;

            public Entrenador(){
                super();
                idFederacion = String.valueOf(345);
            }

            public String getIdFederacion() {
                return idFederacion;
            }

            public void setIdFederacion(String idFederacion) {
                this.idFederacion = idFederacion;
            }
            //getters y setters

            public void dirigirPartido(){

            }

            public void dirigirEntreno(){

            }


        }
        public class Masajista extends SeleccionFutbol {
            private String titulacion;
            private int aniosExperiencia;

            public Masajista(){
                super();
            }

            public String getTitulacion() {
                return titulacion;
            }

            public void setTitulacion(String titulacion) {
                this.titulacion = titulacion;
            }

            public int getAniosExperiencia() {
                return aniosExperiencia;
            }

            public void setAniosExperiencia(int aniosExperiencia) {
                this.aniosExperiencia = aniosExperiencia;
            }
            // getters y setters

            public void darMasaje(){

            }




        }

    }
}
