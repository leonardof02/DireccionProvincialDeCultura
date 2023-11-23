package direccionprovincialdecultura;


public class AgrupacionAficionada extends AgrupacionNacional {
    private String centroDeProcedencia;
    private double edadPromedio;

    public AgrupacionAficionada(String centroDeProcedencia, double edadPromedio, String provincia, String nombre, String nombreDirector, int cantidadParticipantes) {
        super(provincia, nombre, nombreDirector, cantidadParticipantes);
        this.centroDeProcedencia = centroDeProcedencia;
        this.edadPromedio = edadPromedio;
    }

    public String getCentroDeProcedencia() {
        return centroDeProcedencia;
    }

    public void setCentroDeProcedencia(String centroDeProcedencia) {
        this.centroDeProcedencia = centroDeProcedencia;
    }

    public double getEdadPromedio() {
        return edadPromedio;
    }

    public void setEdadPromedio(double edadPromedio) {
        this.edadPromedio = edadPromedio;
    }
    
    
}
