import ElABC.A;

public class hola {
    public static void main (String [] args) {
        Animal toshi = new Perro("toshi","4");
        Animal gatubela = new Gato("gatubela","mucho");
        Animal Patodonal = new Pato ("el patodonall" , "2");
        Animal mini = new Chiwawa("Mini", "4","muy poco se va a morir xd");
        toshi.HacerRuido();
        toshi.describir();
        System.out.println();
        gatubela.HacerRuido();
        gatubela.describir();
        System.out.println();
        Patodonal.HacerRuido();
        Patodonal.describir();
        System.out.println();
        mini.HacerRuido();
        mini.describir();
        System.out.println();
        System.out.println("Aca uso el llamar a todos los ruidos de los animales");
        Animal.agregarAnimal(toshi);
        Animal.agregarAnimal(gatubela);
        Animal.agregarAnimal(Patodonal);
        Animal.agregarAnimal(mini);
        Animal.escucharAtodos(Animal.listaDeanimales);
    }
}