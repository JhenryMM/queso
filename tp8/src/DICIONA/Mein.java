package DICIONA;

import java.util.HashMap;
import java.util.Map;

public class Mein {
    public static void hola(){

        String cadena="hola como estas ABER como como";
        System.out.println("enserio ? : " + letras(cadena));
        Map<String,String> diccionario = new HashMap<String,String>();
        diccionario.put("hola","se usa para saludar ");
        diccionario.put("como","quiere decir que paso o  para comparar algo");
        diccionario.put("ABER","es como decir haber pero de manera exaregarada y en modo donw");
        diccionario.put("estas","quiere decir si estas ahi o si ya estas ");
        diccionario.put("que","quire DECIR LA CAGUE");
        System.out.println("\n");
        resultado(diccionario,cadena);
    }
    public static Map<String,Integer> letras(String cadena){
        Map<String,Integer> micadena = new HashMap<String,Integer>();
        for (String e :(cadena.split(" "))){

            micadena.put(e,micadena.getOrDefault(e,0) +1);
        }
        return micadena;
    }
    public static void resultado(Map<String,String> midicionario, String cadena){
        for (String e :(cadena.split(" "))){
            for(Map.Entry<String,String> entrada : midicionario.entrySet()){
                if(e.equals(entrada.getKey())){
                    System.out.println(entrada.getKey()  + entrada.getValue());
                }
            }
        }
    }
}
