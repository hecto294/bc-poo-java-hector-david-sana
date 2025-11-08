package co.edu.sena.hector.sema01;

    public class paciente {
        private String id;
        private String nombre;
        private int edad;
        private String diagnostico;

        public paciente(String id, String nombre, int edad, String diagnostico) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.diagnostico = diagnostico;
        }

        public void mostrarInformacion() {
            System.out.println("ID Paciente: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Diagnóstico: " + diagnostico);
        }

        public double calcularCostoConsulta() {
            if (edad > 60) {
                return 80000; // tarifa especial para mayores
            } else {
                return 100000;
            }
        }
    }