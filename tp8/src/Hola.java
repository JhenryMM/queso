import java.util.*;

public class Hola {

    public static void main (String args []) {
        Map<Producto, Integer> carrito = new TreeMap<Producto,Integer>(new HijodeProducto());
        carrito.put(new Producto(2434,"aceite"),2);
        carrito.put(new Producto(231,"Papel"),3);
        carrito.put(new Producto(1223,"Agua"),3);
        for (Map.Entry<Producto,Integer> que : carrito.entrySet()){
            System.out.println(que.getKey() +" "+  que.getValue());
        }
    }



}
