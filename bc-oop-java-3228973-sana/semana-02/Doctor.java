public class Doctor {
    private String nombre;
    private String especialidad;
    private int experienciaAnios;

    public Doctor(String nombre, String especialidad, int experienciaAnios) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experienciaAnios = experienciaAnios;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public int getExperienciaAnios() { return experienciaAnios; }
    public void setExperienciaAnios(int experienciaAnios) { this.experienciaAnios = experienciaAnios; }

    public String mostrarPerfil() {
        return "Dr. " + nombre + " - " + especialidad + " (" + experienciaAnios + " años)";
    }
}