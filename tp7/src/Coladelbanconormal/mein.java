package Coladelbanconormal;

public class mein {
    public static void ee (){
        Persona martin = new Persona("martin",321,24);
        Persona emilia = new Persona("emilia", 321321,30);
        Persona lujan = new Persona("lujan", 3213213,34);
        Persona elias = new Persona("elias", 32131,28);

        ColaDelBanco cola = new ColaDelBanco();
        cola.agregarperso(martin);
        cola.agregarperso(emilia);
        cola.agregarperso(lujan);
        cola.agregarperso(elias);
        cola.agregarperso(martin);
        cola.mostrar();
        cola.atender();
        System.out.println("\n");
        cola.mostrar();
    }
}
