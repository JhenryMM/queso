package Animales;

import Animales.Animal;
import vehiculos.Volador;

public class Loro extends Animal implements Volador{
    Loro (String nombre){
        this.nombre=nombre;
    }

    @Override
    public void volar(){
        System.out.println("El pajaro vuela para ir a mar a comer peces");
    }

    @Override
    public void describir(){
        System.out.println("Este es un pez y su nombre es " + getNombre());
    }
}
