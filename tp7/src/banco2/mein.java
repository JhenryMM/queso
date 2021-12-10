package banco2;

public class mein {
    private void eee(){
        Persona martin = new Persona("martin",321,75);
        Persona emilia = new Persona("emilia", 321321,30);
        Persona lujan = new Persona("lujan", 3213213,34);
        Persona elias = new Persona("elias", 32131,28);
        Persona marta = new Persona("marta",21321,70);
        Persona maria = new Persona("maria",321321,80);
        ColaDelBanco cola = new ColaDelBanco();
        cola.agregarperso(martin);
        cola.agregarperso(emilia);
        cola.agregarperso(lujan);
        cola.agregarperso(elias);
        cola.agregarperso(martin);
        cola.agregarperso(marta);
        cola.mostrar();
        cola.atender();
        System.out.println("\n");
        cola.mostrar();
        cola.agregarperso(maria);
        System.out.println("\n");
        cola.mostrar();
        cola.agregarperso(marta);
        System.out.println("\n");
        cola.mostrar();

    }
}
