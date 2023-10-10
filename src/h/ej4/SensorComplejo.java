package h.ej4;

import java.time.LocalDate;

public class SensorComplejo extends Dispositivo{
    public SensorComplejo(boolean estado, int valorReal, int valorUmbral, LocalDate añoAdquirido) {
        super(estado, valorReal, valorUmbral, añoAdquirido);
    }
}
