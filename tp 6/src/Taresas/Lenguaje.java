package Taresas;

import Taresas.Tarea;

public class Lenguaje implements Tarea {
    protected String nombre;
    protected String elstring="Se ejecuto el string q se me pidio";
    Lenguaje (String nombre){
        this.nombre=nombre;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public void ejecutar(){
        System.out.println(nombre);
        System.out.println(elstring);
    }
}
