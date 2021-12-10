public class Perro extends Animal {
    protected String patas;
    protected static String especie="Perro";
  Perro(String nombre,String patas) {
      super(nombre, Perro.especie);
      this.patas=patas;

  }

    @Override
    void HacerRuido() {
        System.out.println("wua wua waa dice el perro qleado");
    }
    @Override
    public void describir() {
      System.out.println("se llama " + nombre + " y es un " + Perro.especie + " y tiene " + patas);
    }
}
