package Main;
import Productos.Producto;
import Productos.Envio;
import Productos.Venta;

public class main {

    public static void main(String[] args) {
        Producto p01 = new Producto("Chocolate","Barra de chocolate amargo de Arcor",13000,5);
        Producto p02 = new Producto("Cereal","Cereal Kllogg's de Hershey's",23000,3);
        Producto p03 = new Producto("Agua","Agua mineral de 500ml",4000,20);
        Producto p04 = new Producto("Celular","Celular Samsung S9",3500000,1);
        
        Venta registro = new Venta(10);
        registro.agregar(p01);
        registro.agregar(p02);
        registro.agregar(p03);
        registro.agregar(p04);
        
        Producto encontrado = registro.buscar("Cereal");
        if (encontrado != null) {
            System.out.println();
            System.out.println("Mostrando producto encontrado");
            System.out.println(encontrado.toString());            
        }
        
        registro.mostrar();
        registro.eliminar("Agua");
                
        registro.ordenar();
        registro.mostrar();
        
        Envio envio = new Envio("Calle Monseñor Wiessen c/ Mcal.Estigarribia");
        double distancia = 50.0; // en kilómetros
        double costoDeEnvio = envio.costoEnvio(distancia);

        System.out.println("El costo de envío es: Gs" + costoDeEnvio);
    }
    
}
