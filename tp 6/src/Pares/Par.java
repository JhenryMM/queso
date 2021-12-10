package Pares;

public class Par implements Ordenable {
    private int numero1;
    private int numero2;
    Par(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    @Override
     public boolean esMayor(Object o){
            Par p = (Par) o;
        if(this.numero1 == p.numero1){
            return this.numero2 > p.numero2;
        } else {
            return this.numero1 > p.numero1;
        }
     }
    @Override
    public String toString() {
        return "el numero 1: " + numero1 + ", numero 2: "+ numero2+ "\n";
    }
}
