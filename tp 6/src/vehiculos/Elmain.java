package vehiculos;

public class Elmain {
    public static void mein () {
        Auto miauto = new Auto();
        Avion miavion = new Avion();
        Helicoptero mihe = new Helicoptero();
        Lancha mio = new Lancha();
        Vehiculo car= miauto;
        Vehiculo avionn = miavion;
        Vehiculo heli = mihe;
        Vehiculo lan = mio;
        Volador a=miavion;
        ((Volador) avionn).volar();
        hacervolar(heli);
        ((Volador) mihe).volar();
        if (miauto instanceof Volador){
            ((Volador) miauto).volar();
        }// java confia en q lo q estas casteado es una clase mayor o una clase q
        // implemente al otro pero si haces esto fuera del if no te marca error pero al compilarlo si
    }
    public static void hacervolar(Vehiculo vehiculo){
        if (vehiculo instanceof Volador){
            ((Volador) vehiculo).volar();
        } else {
            System.out.println("Este no es un volador y no puede volar");
        }
    }

    public static boolean esvolador(Vehiculo vehiculo) {
        if (vehiculo instanceof Volador) {
            return true;
        } else {
            return false;
        }
    }
}
