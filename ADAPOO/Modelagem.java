import Animais.*;
import Animais.Cachorro;

public class Modelagem {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Branco", 10.5, 10, "Nada", 5);
        Animal cachorro2 = new Cachorro("Puppy", "Branco", 10.5, 10, "Nada", 5);
        System.out.println(Cachorro.getNumeroDeCachorros()); 
        System.out.println(cachorro2.getCor());
        System.out.println(cachorro.toString());
        System.out.println(cachorro2);
    
    }
}
