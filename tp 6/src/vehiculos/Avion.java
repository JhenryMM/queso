package vehiculos;

public class Avion extends Vehiculo implements Volador {
    @Override
    public void volar() {
     System.out.println("estoy volando qleado");
    }
}
