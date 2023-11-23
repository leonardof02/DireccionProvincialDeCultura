package direccionprovincialdecultura;

public class AgrupacionInternacional extends Agrupacion {
    private String pais;

    public AgrupacionInternacional(String pais, String nombre, String nombreDirector, int cantidadParticipantes) {
        super(nombre, nombreDirector, cantidadParticipantes);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }
}
