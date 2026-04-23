package atividade05;

import java.util.ArrayList;

public class Circulo extends Forma {
    public Circulo(ArrayList<Ponto2D> pontos) {
       super(pontos);
    }

    public double getRaio() {
        return this.getPontos().getFirst().calcularDistancia(this.getPontos().getLast());
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * this.getRaio() * Math.PI;
    }
}
