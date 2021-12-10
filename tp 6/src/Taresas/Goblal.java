package Taresas;

public class Goblal implements Tarea {
    private String nombre;
    protected static int numero=4;
    Goblal(String nombre){
        this.nombre=nombre;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public void ejecutar(){
        System.out.println(getNombre());
        System.out.println("El numero gobla es " + Goblal.numero);
        Goblal.numero=0;
        Goblal.numero=90;
        System.out.println("ahora el cambio es " + Goblal.numero);

    }
}
