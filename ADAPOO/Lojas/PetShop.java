package Lojas;
import Animais.*;

public class PetShop {
    public void darBanho(Animal animal) {
        animal.setEstado("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstado("Tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstado("Saudade");
    }

    public String toString() {
        return "PetShop";
    }
}
