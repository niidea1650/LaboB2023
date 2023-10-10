package h.ej4;

import java.time.LocalDate;

public class Dispositivo {
    private boolean estado;
    private int valorReal;
    private int valorUmbral;
    private LocalDate añoAdquirido;

    public Dispositivo(boolean estado, int valorReal, int valorUmbral, LocalDate añoAdquirido) {
        this.estado = estado;
        this.valorReal = valorReal;
        this.valorUmbral = valorUmbral;
        this.añoAdquirido = añoAdquirido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getValorReal() {
        return valorReal;
    }

    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }

    public int getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(int valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public LocalDate getAñoAdquirido() {
        return añoAdquirido;
    }

    public void setAñoAdquirido(LocalDate añoAdquirido) {
        this.añoAdquirido = añoAdquirido;
    }
}
