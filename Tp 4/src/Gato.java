public class Gato extends Animal{
    protected String pelo;
    protected static String especie = "Gato";
    Gato (String nombre, String pelo) {
        super(nombre, Gato.especie);
        this.pelo=pelo;
    }
    @Override
    void HacerRuido() {
        System.out.println("miau miau miau dice el gato ");
    }
    @Override
    public void describir() {
        System.out.println("se llama " + nombre + " y es un " + Gato.especie+ " y tiene el pelo " + pelo);
    }
}
