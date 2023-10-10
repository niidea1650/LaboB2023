package h.ej4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    ArrayList<Dispositivo>dispositivos;
    ArrayList<DetectorHumo>detectorHumo;
    ArrayList<SensorPresion>sensorPresion;
    ArrayList<SensorTemperatura>sensorTemperatura;
    ArrayList<SensorComplejo>sensorComplejo;


    public Sistema(ArrayList<Dispositivo> dispositivos, ArrayList<DetectorHumo> detectorHumo, ArrayList<SensorPresion> sensorPresion, ArrayList<SensorTemperatura> sensorTemperatura) {
        this.dispositivos = dispositivos;
        this.detectorHumo = detectorHumo;
        this.sensorPresion = sensorPresion;
        this.sensorTemperatura = sensorTemperatura;
        this.sensorComplejo = sensorComplejo;
    }
    public Sistema (){
        dispositivos = new ArrayList<>();
        detectorHumo = new ArrayList<>();
        sensorComplejo = new ArrayList<>();
        sensorPresion = new ArrayList<>();
        sensorTemperatura = new ArrayList<>();
    }

    public ArrayList<DetectorHumo> getDetectorHumo() {
        return detectorHumo;
    }

    public void setDetectorHumo(ArrayList<DetectorHumo> detectorHumo) {
        this.detectorHumo = detectorHumo;
    }

    public ArrayList<SensorPresion> getSensorPresion() {
        return sensorPresion;
    }

    public void setSensorPresion(ArrayList<SensorPresion> sensorPresion) {
        this.sensorPresion = sensorPresion;
    }

    public ArrayList<SensorTemperatura> getSensorTemperatura() {
        return sensorTemperatura;
    }

    public void setSensorTemperatura(ArrayList<SensorTemperatura> sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void dispararAlarma(Dispositivo d){
        if (d.getValorReal() > d.getValorUmbral()){
            System.out.println("WIIIIUUUUUWIIIIIUUUUU");
        }
    }
    public void alarmaHumo (Dispositivo d){
        if(d.getValorReal() > d.getValorUmbral()){
            System.out.println("Tema Bomberos");
            System.out.println("¡Cuidado! La temperatura sube y el sensor de presión: Sensor de presión activado");
        }
    }

    public void alarmaCompleja (Dispositivo s){
        if (s.getValorReal() > s.getValorUmbral()){
            System.out.println("WIIIIUUUUUWIIIIIUUUUU");
        }
    }
    public void obtenerInfo(int n)throws IndexOutOfBoundsException{
        dispositivos.get(n);
        System.out.println(dispositivos.get(n).getValorReal() + "" + dispositivos.get(n).getValorUmbral() + "" + dispositivos.get(n).getAñoAdquirido());
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Dispositivo d1 = new Dispositivo(true, 3,2, LocalDate.of(2000,8,2));
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese el numero de Dispositivo que quiera ver su informacion");
        n = s.nextInt();

        sistema.dispararAlarma(d1);
        sistema.alarmaHumo(d1);
        sistema.alarmaCompleja(d1);

        try {
            sistema.obtenerInfo(n);
        }catch (IndexOutOfBoundsException exc){
            System.out.println(exc);
        }
    }
}
