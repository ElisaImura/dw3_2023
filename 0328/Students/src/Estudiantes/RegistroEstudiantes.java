package Estudiantes;

public class RegistroEstudiantes{
    public Estudiantes[] estudiantes;
    public int numEst;
    public boolean flag = false;

    public RegistroEstudiantes(int num) {
        estudiantes = new Estudiantes[num];
        numEst = 0;
    }    
           
    public void agregar(Estudiantes x){              
        estudiantes[numEst] = x;
        numEst++;
    }
    
    public void eliminar(String nombre) {
        for (int i = 0; i < numEst; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                for (int j = i; j < numEst - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[numEst - 1] = null;
                numEst--;
                flag = true;
                System.out.print("\nSe ha eliminado correctamente al estudiante "+nombre);
                break;
            }
        }
        if(flag==false){
            System.out.print("No se ha encontrado al estudiante "+nombre);
        }
        flag = false;
    }
    
    public void mostrar(){
        System.out.println();
        System.out.println();
        System.out.println("Mostrando todos los estudiantes");
        for (int i = 0; i <numEst; i++) {            
            System.out.println(estudiantes[i].toString());
            if (estudiantes[i] instanceof EstudianteInternacional estudianteInternacional) {
                System.out.println("País de origen: " + estudianteInternacional.getPaisOrigen());
            }
            System.out.println();
        }
    }
    
    public Estudiantes buscar(String nombre) {
        for (int i = 0; i < numEst; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {                
                flag = true;
                return estudiantes[i];
            }
        }
        if(flag == false){
            System.out.println("No se ha encontrado al estudiante "+nombre);
        }
        return null;
    }    

    public Estudiantes[] getEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumEst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}
