package unidad_1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(){
        this.dia = 24;
        this.mes = 4;
        this.anio = 1944;
    }
    public Fecha (int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public boolean anio_bisciesto(){
        return anio % 4 == 0;
    }
    public boolean menor_que(Fecha fecha2){
        if (anio < fecha2.anio){
            return true;
        }
        else if (anio == fecha2.anio){
            if (mes < fecha2.mes){
                return true;
            }
            else if (mes == fecha2.mes){
                return dia < fecha2.dia;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }
}
