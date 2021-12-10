
import Pares.Ordenable;
public class Pardesuma implements Ordenable {
    private int numero1;
    private int numero2;
    Pardesuma(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    public int suma(){
        return numero1+numero2;
    }

    @Override
    public boolean esMayor(Object o){
        Pardesuma p = (Pardesuma) o;
        int suma=this.numero1 + numero2;
        return this.suma()>p.suma();
    }
    @Override
    public String toString() {
        return "el numero 1: " + numero1 + ", numero 2: " + numero2 + "\n";
    }
}
