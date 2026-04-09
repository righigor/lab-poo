package atividade02;

public class Carta {
    private String naipe;
    private int valor;

    public Carta() {
        this.naipe = "";
        this.valor = 0;
    }

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Carta(Carta carta) {
        this.naipe = carta.naipe;
        this.valor = carta.valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int comparaValor(Carta carta) {
        return Integer.compare(carta.valor, this.valor);
    }

    public int comparaNaipe(Carta carta) {
        if (carta.naipe.equals(this.naipe)) return 1;
        return 0;
    }

    public void imprimeCarta() {
        System.out.println("Naipe: " + this.naipe + " valor: " + this.valor);
    }
}
