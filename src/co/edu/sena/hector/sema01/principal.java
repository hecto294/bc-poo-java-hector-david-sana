package co.edu.sena.hector.sema01;

public class principal {
    private String id;
    private String nombre;
    private String especialidad;

    public principal(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    public void atenderPaciente() {
        System.out.println(nombre + " (" + especialidad + ") está atendiendo a un paciente...");
    }
}

