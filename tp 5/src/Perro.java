import java.util.Objects;

public class Perro extends Animal{
    protected String raza;
    Perro(String especie,int peso,String raza){
        super(especie,peso);
        this.raza=raza;
    }
    @Override
    public boolean equals(Object o){
        if ( this == o) return true;
        if ( o== null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(especie,perro.especie) && Objects.equals(peso,perro.peso) && Objects.equals(raza,perro.raza);
    }
}
