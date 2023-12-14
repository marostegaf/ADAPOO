import Animais.*;
import Lojas.PetShop;


public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Gatinho", "Preto", 4.5);
        PetShop petshop = new PetShop();

        System.out.println(gato);
        System.out.println(petshop);
    }
}
