package direccionprovincialdecultura;

import java.time.LocalDateTime;

public class ActividadPolitica extends Actividad {
    private String efemeride;

    public ActividadPolitica(String efemeride, Agrupacion agrupacionParticipante, String provincia, LocalDateTime fecha, String lugar) {
        super(agrupacionParticipante, provincia, fecha, lugar);
        this.efemeride = efemeride;
    }

    public String getEfemeride() {
        return efemeride;
    }

    public void setEfemeride(String efemeride) {
        this.efemeride = efemeride;
    }
    
    
}
