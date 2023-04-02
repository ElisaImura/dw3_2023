package Estudiantes;

public class EstudianteInternacional extends Estudiantes{
    public String paisOrigen;

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public EstudianteInternacional(String paisOrigen, String nombre, String apellido, int edad, double notaPromedio) {
        super(nombre, apellido, edad, notaPromedio);
        this.paisOrigen = paisOrigen;
    }

    public EstudianteInternacional(String paisOrigen, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.paisOrigen = paisOrigen;
    }
}
