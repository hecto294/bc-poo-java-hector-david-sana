import java.util.ArrayList;

public class GestorCitas {
    private ArrayList<CitaOftalmologica> citas;

    public GestorCitas() {
        citas = new ArrayList<>();
    }

    public void agregarCita(CitaOftalmologica cita) {
        citas.add(cita);
    }

    public void mostrarCitas() {
        for (CitaOftalmologica c : citas) {
            System.out.println(c.obtenerResumen());
        }
    }

    public int contarCitas() {
        return citas.size();
    }
}