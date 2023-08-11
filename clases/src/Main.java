public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Estudiante1", 20, 12345);
        Estudiante estudiante2 = new Estudiante("Estudiante2", 21, 67890);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        System.out.println("Nombre de la universidad: " + universidad.getNombre());

        Estudiante[] estudiantes = universidad.getEstudiantes();
        System.out.println("Estudiantes en la universidad:");

        for (int i = 0; i < universidad.getCantidadEstudiantes(); i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() +
                    ", Número de Estudiante: " + estudiante.getNumeroEstudiante());
        }
    }
}


