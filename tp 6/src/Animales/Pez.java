package Animales;

import Animales.Acuario;
import Animales.Animal;

public class Pez extends Animal implements Acuario {

    Pez(String nombre){
        this.nombre=nombre;

    }

    @Override
    public void describir(){
        System.out.println("este es un pez y se llama " + getNombre());
    }

    @Override
    public void nadar(){
        System.out.println("El pez esta nadando para escapar ");
    }
}
