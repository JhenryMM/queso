package Omg;

import java.util.*;

public class NumerosPrimos {
    private static Map<Integer, Boolean> primos = new HashMap<Integer,Boolean>();
    public boolean Esprimo(int numero){
        int contador = 2;
        boolean primo=true;
        if (primos.containsKey(numero)){
            primo= primos.get(numero);
        }
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0){
                primo = false;
                contador++;
            }
        }
        primos.put(numero,primo);
        return primo;
    }
    public static Set<Integer> primosConocidos() {
        Set<Integer> primosConocidos = new TreeSet<Integer>();
        for (Map.Entry<Integer, Boolean> e: primos.entrySet()) {
            if((e.getValue()== true)) {
                primosConocidos.add(e.getKey());
            }
        }
        return primosConocidos;
    }
}
