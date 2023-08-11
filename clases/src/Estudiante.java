public class Estudiante {
    private String nombre;
    private int edad;
    private int numeroEstudiante;

    public Estudiante(String nombre, int edad, int numeroEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }
}
