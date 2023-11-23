package direccionprovincialdecultura;

public class AgrupacionNacional extends Agrupacion {
    protected String provincia;

    public AgrupacionNacional(String provincia, String nombre, String nombreDirector, int cantidadParticipantes) {
        super(nombre, nombreDirector, cantidadParticipantes);
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
