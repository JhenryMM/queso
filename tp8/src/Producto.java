import java.util.Objects;

public class Producto implements Comparable {
    private int idDeProduct;
    private String nombre;
    public Producto(int idDeProduct, String nombre){
        this.idDeProduct=idDeProduct;
        this.nombre=nombre;
    }
    public Producto(){

    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idDeProduct == producto.idDeProduct && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDeProduct, nombre);
    }

    @Override
    public int compareTo(Object o) {
        Producto e = (Producto) o;
        return idDeProduct - e.idDeProduct;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idDeProduct=" + idDeProduct +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
