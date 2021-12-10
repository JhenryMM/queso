package listadeString;

import java.util.ArrayList;
import java.util.List;

public class mein {
    public static void mein (){
        List<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("junior");
        lista.add("robert");
        lista.add("julian");
        lista.add("maria");
        lista.add("adios");
        for (int i=0; i < lista.size();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("\n");
        iterarLista(lista);
        lista.set(0,"maribel");
        lista.set(5,"a donde ");
        iterarLista(lista);
        lista.remove(0);
        iterarLista(lista);
        lista.add("junior");
        iterarLista(lista);
        lista.remove("junior");
        iterarLista(lista);
        System.out.println(lista.contains("maribel"));
        lista.add("julian");
        lista.add("julian");
        iterarLista(lista);
        borrartodos(lista);
        iterarLista(lista);
    }
    public static void borrartodos(List<String> lista){
        for(int i=0;i< lista.size(); i++){
            if(lista.contains("julian")){
                lista.remove("julian");
            }
        }
    }
    public static void iterarLista(List<String> lista){
        System.out.println("\n");
        for (String e: lista){
            System.out.println(e);
        }
    }
}
