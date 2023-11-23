package direccionprovincialdecultura;

public class AgrupacionProfesional extends AgrupacionNacional implements IPagable {
    private boolean haParticipadoEnConciertosNacionales;
    private int annosDeFormacion;

    public AgrupacionProfesional(boolean haParticipadoEnConciertosNacionales, int annosDeFormacion, String provincia, String nombre, String nombreDirector, int cantidadParticipantes) {
        super(provincia, nombre, nombreDirector, cantidadParticipantes);
        this.haParticipadoEnConciertosNacionales = haParticipadoEnConciertosNacionales;
        this.annosDeFormacion = annosDeFormacion;
    }

    public boolean isHaParticipadoEnConciertosNacionales() {
        return haParticipadoEnConciertosNacionales;
    }

    public void setHaParticipadoEnConciertosNacionales(boolean haParticipadoEnConciertosNacionales) {
        this.haParticipadoEnConciertosNacionales = haParticipadoEnConciertosNacionales;
    }

    public int getAnnosDeFormacion() {
        return annosDeFormacion;
    }

    public void setAnnosDeFormacion(int annosDeFormacion) {
        this.annosDeFormacion = annosDeFormacion;
    }
    
    @Override
    public double getPago() {
        // If en una sola linea, se lee como una pregunta, 300 si ha participado (es verdadero) sino 0
        double bonoParticipacionInternacional = haParticipadoEnConciertosNacionales ? 300 : 0;
        double pagoTotal =
                annosDeFormacion * 50 + bonoParticipacionInternacional
                + 100 * cantidadParticipantes + 40;
    }
}
