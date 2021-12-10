package Animales;

import Animales.Animal;
import vehiculos.Volador;
public class Aguila extends Animal implements Volador{

    Aguila(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void volar(){
        System.out.println("La aguila vuela hacia el loro para comerlo");
    }

    @Override
    public void describir(){
        System.out.println("este es una Animales.Aguila y se llama " + getNombre());
    }
}
