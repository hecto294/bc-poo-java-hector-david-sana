public class DoctorEspecialista extends Doctor {
    private String subEspecialidad;

    public DoctorEspecialista(String nombre, String especialidad, int experienciaAnios, String subEspecialidad) {
        super(nombre, especialidad, experienciaAnios);
        this.subEspecialidad = subEspecialidad;
    }

    public String getSubEspecialidad() { return subEspecialidad; }
}