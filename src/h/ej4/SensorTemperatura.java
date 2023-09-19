package h.ej4;

import java.time.LocalDate;

public class SensorTemperatura extends Dispositivo{

    public SensorTemperatura(boolean estado, int valorReal, int valorUmbral, LocalDate añoAdquirido) {
        super(estado, valorReal, valorUmbral, añoAdquirido);
    }

}
