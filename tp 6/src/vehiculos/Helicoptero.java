package vehiculos;

public class Helicoptero extends Vehiculo implements Volador {
    @Override
    public void volar() {
    System.out.println("vehiculos.Helicoptero volando");
    }
}
