package banco2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDelBanco {
    private Deque<Object> cola = new LinkedList<Object>();

    public void agregarperso(Persona p){
            if(!cola.contains(p)){
                if(p.getEdad() > 60) {
                    cola.addFirst(p);
                } else {
                    cola.add(p);
                }
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
