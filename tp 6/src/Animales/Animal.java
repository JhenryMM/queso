package Animales;

import java.util.ArrayList;
import java.util.List;

abstract public class Animal {
    protected String nombre;
    public String getNombre(){
        return nombre;
    }

    abstract public void describir();
     protected static List<Animal> listadeanimales = new ArrayList<Animal>();
     public static void agregaranimal(Animal animal){
         listadeanimales.add(animal);
     }
}
