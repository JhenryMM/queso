package ElABC;

public class A {
    protected int numero;
    A (int numero){
        this.numero=numero;
       System.out.println("Estoy construyendo un ElABC.A/ElABC.B/ElABC.C con este numero " + this.numero);
    }
     public void Hola() {
        System.out.println("hola en ElABC.A");
     }
}
