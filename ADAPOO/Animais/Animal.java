package Animais;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estado;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }   

    public void setEstado(String estado) {
        this.estado = estado;
    }

    protected void comer() {}

    protected void dormir() {}

    public abstract void soar();
}
