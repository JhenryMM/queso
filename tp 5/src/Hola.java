public class Hola {
    public static void main (String args[]) {
        Animal toshi = new Animal("canino",4);
        Animal abel = new Animal("canino", 4);
        Perro chiwawa = new Perro("canino",6,"chiwawa");
        Perro arce = new Perro("canino", 6,"chiwawa");
        Animal coco = new Animal("cocodrilo",40  );
        System.out.println(toshi.equals(abel));
        toshi.alimentar(4);
        System.out.println(Animal.getConteo());
        abel.alimentar(10);
        System.out.println(Animal.getConteo());
        System.out.println(chiwawa.equals(arce));
    }
}
