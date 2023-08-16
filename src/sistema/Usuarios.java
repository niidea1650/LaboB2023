package sistema;

public class Usuarios {
    private String nombre;
    private String apellido;
    private String mail;
    private String NdeUsuario;

    private String contrasenia;


    public Usuarios(String nombre) {
        this.nombre = nombre;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNdeUsuario() {
        return NdeUsuario;
    }

    public void setNdeUsuario(String ndeUsuario) {
        NdeUsuario = ndeUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}
