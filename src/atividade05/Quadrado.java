package atividade05;

import java.util.ArrayList;

public class Quadrado extends Forma {
    private double l1;
    private double l2;
    private double l3;
    private double l4;

    public Quadrado(ArrayList<Ponto2D> pontos) {
        super(pontos);
        this.l1 = this.getPontos().get(0).calcularDistancia(this.getPontos().get(1));
        this.l2 = this.getPontos().get(0).calcularDistancia(this.getPontos().get(3));
        this.l3 = this.getPontos().get(2).calcularDistancia(this.getPontos().get(1));
        this.l4 = this.getPontos().get(2).calcularDistancia(this.getPontos().get(3));
    }

    @Override
    public double calcularArea() {
        return (this.l1 * this.l2);
    }

    @Override
    public double calcularPerimetro() {
        return (this.l1 + this.l2 + this.l3 + this.l4);
    }
}
