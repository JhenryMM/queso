import java.util.ArrayList;
import java.util.List;

abstract public class Animal {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    protected String especie;
    Animal (String nombre,String especie) {
        this.nombre=nombre;
        this.especie=especie;
    }
    abstract void HacerRuido ();
    public void describir(){
        System.out.println(" se llama " + nombre + " y es un " + especie);
    }
   protected static List<Animal> listaDeanimales = new ArrayList<Animal>();
    public static void agregarAnimal(Animal animal) {
        Animal.listaDeanimales.add(animal);
    }
    public static void escucharAtodos(List<Animal> listaDeanimales) {

        for(Animal animal: listaDeanimales){
            animal.HacerRuido();
        }
    }


}
//Hacer una clase abstracta Animal con un atributo nombre y un atributo especie. Debe tener un constructor que
// tome el nombre y la especie, un método abstracto hacerRuido() y un método concreto describir().
//
//Hacer varias subclases (Ejemplo Perro, Gato, Pato) que se construyan sólo con el nombre y usen la misma especie
// para todas instancias de esa clase. Por ejemplo, todos los objetos de clase Perro tienen la especie “perro”.
//
//Todas las clases deben implementar el método hacerRuido() y sobreescribir el método describir() de tal manera
// que llame al método de la superclase y luego agregue más información.
//
//Hacer una subclase de algún animal. Por ejemplo Labrador o Chihuahua. Sobreescribir el método describir()
//
//Verificar que no se puede crear una instancia de Animal.
//Crear varias instancias de distintos animales.
//Hacer un método estático escucharTodos que tome un array de Animal y llame al método hace-rRuido() de todos los
// animales