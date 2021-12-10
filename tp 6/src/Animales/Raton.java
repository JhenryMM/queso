package Animales;

import Animales.Animal;

public class Raton extends Animal {
    Raton(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void describir(){
        System.out.println("Este es un raton que escapa del gato y se llama " + getNombre());
    }
}
