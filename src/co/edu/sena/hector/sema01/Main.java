package co.edu.sena.hector.sema01;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN CLÍNICA OFTALMOLÓGICA 'VISIÓN CLARA' ===\n");

        // Crear doctores
        principal doc1 = new principal("D001", "Dra. Laura Mendoza", "Oftalmología General");
        principal doc2 = new principal("D002", "Dr. Carlos Pérez", "Cirugía Láser");

        // Crear pacientes
        paciente pac1 = new paciente("P001", "Juan Torres", 45, "Miopía leve");
        paciente pac2 = new paciente("P002", "María Gómez", 67, "Cataratas");

        // Mostrar datos iniciales
        System.out.println("--- DOCTORES ---");
        doc1.mostrarDatos();
        System.out.println();
        doc2.mostrarDatos();

        System.out.println("\n--- PACIENTES ---");
        pac1.mostrarInformacion();
        System.out.println("\nCosto de consulta: $" + pac1.calcularCostoConsulta());

        System.out.println();
        pac2.mostrarInformacion();
        System.out.println("\nCosto de consulta: $" + pac2.calcularCostoConsulta());

        // Simular atención de pacientes
        System.out.println("\n--- ATENCIÓN A PACIENTES ---");
        doc1.atenderPaciente();
        doc2.atenderPaciente();
        doc2.atenderPaciente();
    }
}
