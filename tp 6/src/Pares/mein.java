package Pares;

import java.util.ArrayList;
import java.util.List;

public class mein {
    public static void hola() {
        List<Ordenable> numero = new ArrayList<Ordenable>();
        numero.add(new Par(7,2));
        numero.add(new Par(5,3));
        numero.add(new Par(2,3));
        numero.add(new Par(2,5));
        numero.add(new Par(7,1));
        System.out.println(numero);
        bubbleshort(numero);
        System.out.println(numero);

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
