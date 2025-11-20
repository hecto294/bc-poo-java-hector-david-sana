public class CitaOftalmologica {
    private Paciente paciente;
    private Doctor doctor;
    private String tipoConsulta;
    private double costo;

    public CitaOftalmologica(Paciente paciente, Doctor doctor, String tipoConsulta, double costo) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.tipoConsulta = tipoConsulta;
        this.costo = costo;
    }

    public double getCosto() { return costo; }
    public String obtenerResumen() {
        return paciente.obtenerInfo() + " | " + doctor.mostrarPerfil() + " | Consulta: " + tipoConsulta + " | Costo: " + costo;
    }
}