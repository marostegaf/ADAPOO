package Animais;

public class Cachorro extends Animal{
    
    static int numeroDeCachorros;
    private int tamanhoDoRabo;
    //Atributo

    //Construtores
    //public Cachorro() {}
    
    public Cachorro(String nome, String cor, double peso, int altura, String estado, int tamanhoDoRabo) {
        super(nome, cor, peso);
        this.altura = altura;
        this.estado = estado;
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros ++;
    }


    //Metodos
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String pegar() {
        return "Bolinha";
    }

    public double getTamanhoDoRabo() {
        return this.tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho": this.estado = "Feliz"; break;
            case "vai dormir": this.estado = "Bravo"; break;
            case "pisar na patrinha": this.estado = "Triste";
            default: this.estado = "Neutro";
        }
        
        return estado;
    }

    public String toString() {
        return this.nome + " " + this.cor + " " + this.peso;
    }

    @Override
    public void soar() {
        System.out.println("Au Auu");
    }

}
