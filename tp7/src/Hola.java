import banco2.ColaDelBanco;
import banco2.Persona;

import java.util.ArrayList;
import java.util.List;


public class Hola {
    public static void main (String args[]) {
        Integer numero = new Integer(4);
        Integer numero2 = new Integer(7);
        Conjunto hola = new Numero();
         System.out.println( hola.pertenece(numero));
        System.out.println( hola.pertenece(numero2));

        List<Object> lista = new ArrayList<>();
        Integer wasq =new Integer(4);
        lista.add(wasq);
        String aeiou = new String("que");
        lista.add(aeiou);
        lista.add(new Float(3.5));
        lista.add(new char[3]);
        lista.add(new String("ques"));
        Integer q = new Integer(54);
        String df= new String("nose");
        Boolean wq= new Boolean(true);
        Conjunto aver = new Lalista();
        System.out.println(aver.pertenece(aeiou,lista));

    }
}
