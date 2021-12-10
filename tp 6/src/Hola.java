import Pares.Ordenable;
import java.util.*;

public class Hola {
    public static void main(String args[]) {
            List<Ordenable> personas = new ArrayList<Ordenable>();
            personas.add(new Persona(true,943232));
            personas.add(new Persona(false,943232));
            personas.add(new Persona(false,3213213));
            personas.add(new Persona(true,321321));
            personas.add(new Persona(false,3213));
            System.out.println(personas);
            bubbleshort(personas);
            System.out.println(personas);

    }

    public static List bubbleshort(List<Ordenable> o) {
        for(int i=0; i < o.size();i++){
            for(int e = i;e < o.size();e++){
                if(o.get(i).esMayor(o.get(e))) {
                    Ordenable temp=o.get(e);
                    o.set(e,(o.get(i)));
                    o.set(i,temp);
                }
            }
        }
        return o;
    }
}
