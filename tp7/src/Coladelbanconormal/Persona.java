package Coladelbanconormal;

public class Persona {
    private String nombre;
    private int dni;
    private int edad;
    public Persona(String nombre,int dni,int edad){
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }
    @Override
    public String toString(){
        return nombre + " tiene " + edad + ", su dni es: " + dni;
    }
}
