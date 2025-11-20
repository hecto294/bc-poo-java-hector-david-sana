public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Ana Torres", 30, "12345");
        Doctor d1 = new Doctor("Luis Gómez", "Cirugía Láser", 8);
        CitaOftalmologica cita1 = new CitaOftalmologica(p1, d1, "Consulta General", 150000);

        GestorCitas gestor = new GestorCitas();
        gestor.agregarCita(cita1);

        gestor.mostrarCitas();
        System.out.println("Total de citas: " + gestor.contarCitas());
    }
}