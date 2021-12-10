package Coladelbanconormal;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDelBanco {
    private Queue<Object> cola = new LinkedList<Object>();

    public void agregarperso(Persona p){
        if(!cola.contains(p)){
            cola.add(p);
        }
    }

    public void mostrar(){
        for (Object o : cola){
            System.out.println(o);
        }
    }

    public Object atender (){
        return cola.poll();
    }

}
