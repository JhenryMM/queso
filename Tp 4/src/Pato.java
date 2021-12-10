public class Pato extends Animal{
    protected String patas;
    protected static String especie="Pato";
    Pato(String nombre, String patas){
        super(nombre, Pato.especie);
        this.patas=patas;
    }
    @Override
    void HacerRuido(){
        System.out.println("cuack cuack cuack dice el pato qleado");
    }
   @Override
    public void describir(){
        System.out.println("se llama "+ nombre + " y es un " + Pato.especie + " y tiene " + patas + " patas");
   }
}
