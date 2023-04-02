package Productos;

public class Envio {
    public String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public double costoEnvio(double dist){
        double costoBase = 5000;
        double costoKm = 5000;
        double costoTotal = costoBase + (dist*costoKm);
        return costoTotal;
    }
}
