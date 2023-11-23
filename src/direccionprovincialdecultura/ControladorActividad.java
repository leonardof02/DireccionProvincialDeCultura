package direccionprovincialdecultura;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ControladorActividad {

    private ArrayList<Actividad> actividades;

    public ControladorActividad(ArrayList actividades) {
        this.actividades = actividades;
    }

    public ControladorActividad() {
        actividades = new ArrayList<Actividad>();
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public ArrayList getActividadesPoliticas() {
        ArrayList<Actividad> actividadesPoliticas = new ArrayList<>();
        for (Actividad actividad : actividades) {
            if (actividad instanceof ActividadPolitica) {
                actividadesPoliticas.add(actividad);
            }
        }
        return actividadesPoliticas;
    }
    
    public int getActividadesEnElMes() {
        int cantidadDeActividades = 0;
        Month esteMes = LocalDate.now().getMonth();
        for( Actividad actividad : actividades ) {
            if( actividad.getFecha().getMonth().equals( esteMes ) )
                cantidadDeActividades++;
        }
        return cantidadDeActividades;
    }

    public void guardarActividades() throws FileNotFoundException {
        String registro = "";
        for (Actividad actividad : actividades) {
            String tipoActividad = (actividad instanceof ActividadPolitica) ? "Actividad Politica" : "Actividad Normal";
            registro
                    += "Tipo: " + tipoActividad + " | Provincia: " + actividad.getProvincia() + " | Lugar: " + actividad.getLugar()
                    + ((actividad instanceof ActividadPolitica) ? (" | Efemeride " + ((ActividadPolitica) actividad).getEfemeride()) : "")
                    + "\n";

        }
        try (PrintWriter out = new PrintWriter("registro.txt")) {
            out.println(registro);
        }
    }
}
