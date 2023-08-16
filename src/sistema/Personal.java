package sistema;

public class Personal {
    private int id_personal;
    private String nombrep;
    private String apellidop;
    private String mailp;
    private Roles rol;

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getMailp() {
        return mailp;
    }

    public void setMailp(String mailp) {
        this.mailp = mailp;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }
}
