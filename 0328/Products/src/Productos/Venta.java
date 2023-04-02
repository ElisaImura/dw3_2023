package Productos;

public class Venta {
    public Producto[] producto;
    public int numPro;
    public boolean flag = false;

    public Venta(int num) {
        producto = new Producto[num];
        numPro = 0;
    }
    
    public void agregar(Producto x){              
        producto[numPro] = x;
        numPro++;
    }
    
    public void eliminar(String nombre) {
        for (int i = 0; i < numPro; i++) {
            if (producto[i].getNombre().equals(nombre)) {
                for (int j = i; j < numPro - 1; j++) {
                    producto[j] = producto[j + 1];
                }
                producto[numPro - 1] = null;
                numPro--;
                flag = true;
                System.out.print("\nSe ha eliminado correctamente el producto "+nombre);
                break;
            }
        }
        if(flag==false){
            System.out.print("No se ha encontrado el producto "+nombre);
        }
        flag = false;
    }
    
    public void mostrar(){
        System.out.println();
        System.out.println();
        System.out.println("Mostrando todos los productos");
        for (int i = 0; i <numPro; i++) {            
            System.out.println(producto[i].toString());
            System.out.println();
        }
    }
    
    public Producto buscar(String nombre) {
        for (int i = 0; i < numPro; i++) {
            if (producto[i].getNombre().equals(nombre)) {                
                flag = true;
                return producto[i];
            }
        }
        if(flag == false){
            System.out.println("No se ha encontrado el producto "+nombre);
        }
        return null;
    }
    
    public void ordenar(){
        int numProductos = 0;
        for (Producto p : producto) {
            if (p != null) {
                numProductos++;
            }
        }

        // Ordenar el arreglo
        for (int i = 0; i < numProductos - 1; i++) {
            for (int j = i + 1; j < numProductos; j++) {
                if (producto[i].compareTo(producto[j]) > 0) {
                    Producto temp = producto[i];
                    producto[i] = producto[j];
                    producto[j] = temp;
                }
            }
        }
        System.out.print("\nProductos ordenados");
    }
}
