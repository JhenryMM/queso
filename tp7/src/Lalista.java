import java.util.List;

public class Lalista implements Conjunto{


    @Override
    public boolean pertenece (Object o){
        return true;
    }

    @Override
    public boolean pertenece(Object o, List<Object> i){
        boolean resultado;
        for(Object e : i){
            if(o==e){
                return resultado=true;
            }
        }
        return resultado=false;
    }
}
