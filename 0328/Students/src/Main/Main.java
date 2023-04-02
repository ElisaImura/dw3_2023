package Main;
import Estudiantes.EstudianteInternacional;
import Estudiantes.Estudiantes;
import Estudiantes.RegistroEstudiantes;

public class Main {

    public static void main(String[] args) {
        // Crear algunos estudiantes
        Estudiantes estudiante1 = new Estudiantes("Rosely", "Garayo", 19, 4);
        Estudiantes estudiante2 = new Estudiantes("Analia", "Rivarola", 20, 4.2);
        Estudiantes estudiante3 = new EstudianteInternacional("México", "Yuri", "Imura", 19, 4.7);

        // Crear un registro de estudiantes y agregar los estudiantes
        RegistroEstudiantes registro = new RegistroEstudiantes(10);
        registro.agregar(estudiante1);
        registro.agregar(estudiante2);
        registro.agregar(estudiante3);

        // Buscar un estudiante y mostrar su información
        Estudiantes estudianteEncontrado = registro.buscar("Yuri");
        if (estudianteEncontrado != null) {
            System.out.println();
            System.out.println("Mostrando estudiante encontrado");
            System.out.println(estudianteEncontrado.toString());
            if (estudianteEncontrado instanceof EstudianteInternacional estudianteInternacional) {
                System.out.println("País de origen: " + estudianteInternacional.getPaisOrigen());
            }
        }

        // Eliminar un estudiante y mostrar la lista de estudiantes restantes
        registro.eliminar("Analia");
        registro.mostrar();
    }
    
}
