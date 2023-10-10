package h.ej4;

import java.time.LocalDate;

public class SensorPresion extends Dispositivo{

    public SensorPresion(boolean estado, int valorReal, int valorUmbral, LocalDate añoAdquirido) {
        super(estado, valorReal, valorUmbral, añoAdquirido);
    }

}
