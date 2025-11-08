package co.edu.sena.hector.sema01;

public class Secundaria {
    private String id;
    private String nombre;
    private String rol;

    public Secundaria(String id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
    }

    public void asistirDoctor() {
        System.out.println(nombre + " (" + rol + ") está asistiendo al doctor en la consulta...");
    }
}

