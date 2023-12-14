package Animais;

public class Gato extends Animal{
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
        numeroDeGatos++;
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }
    
    public String toString() {
        return "Nome: " + nome;
    }

    @Override
    public void soar() {
        System.out.println("Miau Miauu");
    }
}
