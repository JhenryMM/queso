package Hacedorxd;

abstract public class HacedorDeCuenta {
    protected int minumero;

    public void setMinumero(int minumero) {
        this.minumero = minumero;
    }

     abstract int hacerCuenta(int numero);
}
