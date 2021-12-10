package Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public void hola(){
        String cadena="Hola como estas ABER como como";
        System.out.println("enserio ? : " + letras(cadena));

    }
    public static Map<String,Integer> letras(String cadena){
        Map<String,Integer> micadena = new HashMap<String,Integer>();
        for (String e :(cadena.split(" "))){

            micadena.put(e,micadena.getOrDefault(e,0) +1);
        }
        return micadena;
    }

}
