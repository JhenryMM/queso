package Animales;

import Animales.Animal;

public class Gato extends Animal {

    Gato (String nombre){
        this.nombre=nombre;
    }

    @Override
    public void describir() {
        System.out.println("este es un gato y se llama " + getNombre());
    }
}
