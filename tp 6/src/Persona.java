import Pares.Ordenable;

public class Persona implements Ordenable {
    private boolean sexo;
    private int dni;
    public Persona(boolean sexo,int dni){
        this.sexo=sexo;

        this.dni=dni;
    }

    @Override
    public boolean esMayor(Object o){
        Persona p =(Persona)o;
        if (this.dni==p.dni){
            return false;
        } else {
            return this.dni> p.dni;
        }
    }
    @Override
    public String toString(){
        return "sexo: " + sexo + " y su dni es: " + dni +"\n";
    }
}
