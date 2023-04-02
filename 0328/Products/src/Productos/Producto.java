package Productos;

public class Producto implements Comparable<Producto>{
    public String nombre;
    public String descripcion;
    public double precio;
    public int cantidadStock;

    public Producto(String nombre, String descripcion, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre:").append(nombre);
        sb.append("\ndescripcion=").append(descripcion);
        sb.append("\nprecio=").append(precio);
        sb.append("\ncantidadStock=").append(cantidadStock);
        return sb.toString();
    }
    
    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }
}
