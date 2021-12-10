package Animales;

import Animales.Acuario;
import Animales.Animal;

public class Tiburon extends Animal implements Acuario {
    Tiburon(String nombre){
        this.nombre=nombre;
    }


    @Override
    public void nadar(){
        System.out.println("tiburon  nadando buscando comida");
    }
    @Override
    public void describir(){
        System.out.println("Este es un tiburon y se llama " + getNombre() );
    }
}
