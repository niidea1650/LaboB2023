package h.ej4;

import java.time.LocalDate;

public class DetectorHumo extends Dispositivo{

    public DetectorHumo(boolean estado, int valorReal, int valorUmbral, LocalDate añoAdquirido) {
        super(estado, valorReal, valorUmbral, añoAdquirido);
    }
}
