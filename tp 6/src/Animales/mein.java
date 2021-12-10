package Animales;

import vehiculos.Volador;

import java.util.ArrayList;
import java.util.List;

public class mein {
    public static void elmain(){
        Animal gato = new Gato("garfiel");
        Animal raton = new Raton("yerry");
        Animal tiburon = new Tiburon("shark");
        Animal pez = new Pez("rapidin");
        Animal aguila = new Aguila("america");
        Animal loro = new Loro("chileno");

        Animal.agregaranimal(gato);
        Animal.agregaranimal(raton);
        Animal.agregaranimal(tiburon);
        Animal.agregaranimal(pez);
        Animal.agregaranimal(aguila);
        Animal.agregaranimal(loro);
        gato.describir();
        raton.describir();
        tiburon.describir();
        pez.describir();
        aguila.describir();
        loro.describir();
        System.out.println();
        Dameacuaticos(Animal.listadeanimales);
        System.out.println();
        System.out.println("Ahora el sow de los animales");
        System.out.println();
        ShowAnimales(Animal.listadeanimales);

    }

    public static void Dameacuaticos(List<Animal> animales) {
        List<Animal> animalesacuaticos = new ArrayList<Animal>();
        for (Animal e : animales) {
            if (e instanceof Acuario) {
                animalesacuaticos.add(e);
            }
        }
        for (Animal i : animalesacuaticos) {
            ((Acuario) i).nadar();
        }
    }

    public static void ShowAnimales(List<Animal> animales) {
        for (Animal array : animales) {
            if (array instanceof Acuario) {
                ((Acuario) array).nadar();
            } else if (array instanceof Volador) {
                ((Volador) array).volar();
            } else {
                System.out.println("Este animal es terreste no hace nada ;c");
            }
        }
    }
}
