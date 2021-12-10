public class Chiwawa extends Perro{
    protected String pelo;
    Chiwawa(String nombre,String patas,String pelo){
        super(nombre,patas);
        this.pelo=pelo;
    }
    @Override
    void HacerRuido() {
        System.out.println("el llora no mames .-.");
    }
    @Override
    public void describir(){
        System.out.println("se llama " + nombre + " y es un " + Perro.especie + " tiene el pelo " + pelo);
    }
}
