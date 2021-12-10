package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mein {

    public static void intdf (){
        int[] array = new int []{3,4,5,6,7,8,9,1,10};
        Arrays.sort(array);
        iterarArray(array);
        Arrays.asList(array);
        System.out.println("\n");
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(14);
        numeros.add(1);
        iterarList(numeros);
        System.out.println("\n");
        Collections.sort(numeros);
        iterarList(numeros);
        numeros.toArray();
    }
    public static void iterarArray(int[]array){
        for (int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void iterarList(List<Integer> lista){
        for (int e: lista){
            System.out.println(e);
        }
    }

}
