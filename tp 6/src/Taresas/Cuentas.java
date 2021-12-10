package Taresas;

import Taresas.Tarea;

import java.util.ArrayList;
import java.util.List;

public class Cuentas implements Tarea {
    private String nombre;
    Cuentas(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    public static List<Integer> numero(){
        List<Integer> numero= new ArrayList<Integer>();
        numero.add(4);
        numero.add(8);
        numero.add(10);
        return numero;
    }
    public static List<Integer> sumado(List<Integer> numeros) {
        for (int i =0;i< numeros.size(); i++) {

            int temp=numeros.get(i) +2;
            numeros.set(i,temp);


        }
        return numeros;
    }



    @Override
    public void ejecutar() {
        System.out.println(nombre);
        for (int i =0;i< numero().size(); i++) {
            System.out.print(" " + numero().get(i));
        }
       System.out.println();
        for (int i=0; i< sumado(numero()).size(); i++){
            System.out.print(" " + sumado(numero()).get(i));
        }
    }

}
