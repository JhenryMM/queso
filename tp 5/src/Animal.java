import java.util.Objects;

public class Animal {
    protected String especie;
    protected int peso;
    private static int conteo=0;
    public void alimentar(int peso){
        peso++;
        conteo++;
    }
    public static int getConteo(){
        return conteo;
    }
    Animal(String especie,int peso){
        this.especie=especie;
        this.peso=peso;
    }
    @Override
    public boolean equals(Object o){
        if ( this == o) return true;
        if ( o== null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(especie,animal.especie) && Objects.equals(peso,animal.peso);
    }
}
