package u8.ej5;

import java.time.LocalDate;

public class Chef extends Persona {
    private Boolean experiencia;
    private Plato Platonuevo;

    public Chef(String nombre, String apellido, int edad, LocalDate fecha_n, Boolean experiencia, Plato platonuevo) {
        super(nombre, apellido, edad, fecha_n);
        this.experiencia = experiencia;
        Platonuevo = platonuevo;
    }

    public Boolean getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Boolean experiencia) {
        this.experiencia = experiencia;
    }

    public Plato getPlatonuevo() {
        return Platonuevo;
    }

    public void setPlatonuevo(Plato platonuevo) {
        Platonuevo = platonuevo;
    }
}
