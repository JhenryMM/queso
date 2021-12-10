import java.util.List;

public class Numero implements Conjunto{
    @Override
    public boolean pertenece (Object o){
        return o instanceof Integer && ((Integer)o).intValue()%2==0;
    }

    @Override
    public boolean pertenece (Object o, List<Object> i) {
        return true;
    }
}
