
package direccionprovincialdecultura;

import java.time.LocalDateTime;


public class Actividad {
    
    Agrupacion agrupacionParticipante;
    
    protected String provincia;
    protected LocalDateTime fecha;
    protected String lugar;

    public Actividad(Agrupacion agrupacionParticipante, String provincia, LocalDateTime fecha, String lugar) {
        this.agrupacionParticipante = agrupacionParticipante;
        this.provincia = provincia;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Agrupacion getAgrupacionParticipante() {
        return agrupacionParticipante;
    }

    public void setAgrupacionParticipante(Agrupacion agrupacionParticipante) {
        this.agrupacionParticipante = agrupacionParticipante;
    }
}
