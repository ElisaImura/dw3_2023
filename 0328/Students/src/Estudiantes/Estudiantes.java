package Estudiantes;

public class Estudiantes {
    public String nombre;
    public String apellido;
    public int edad;
    public double notaPromedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public Estudiantes(String nombre, String apellido, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public Estudiantes(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre: ").append(nombre);
        sb.append("\napellido: ").append(apellido);
        sb.append("\nedad: ").append(edad);
        sb.append("\nnotaPromedio: ").append(notaPromedio);
        return sb.toString();
    }
    
}
