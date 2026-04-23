package atividade05;

import java.util.ArrayList;

public class Triangulo extends Forma {
    private double l1;
    private double l2;
    private double l3;

    public Triangulo(ArrayList<Ponto2D> pontos) {
        super(pontos);
        this.l1 = this.getPontos().get(0).calcularDistancia(this.getPontos().get(1));
        this.l2 = this.getPontos().get(0).calcularDistancia(this.getPontos().get(2));
        this.l3 = this.getPontos().get(2).calcularDistancia(this.getPontos().get(1));
    }

    @Override
    public double calcularArea() {
        double sp = this.calcularPerimetro()/2;
        return Math.sqrt((sp * (sp - this.l1) * (sp - this.l2) * (sp - this.l3)));
    }

    @Override
    public double calcularPerimetro() {
        return (this.l1 + this.l2 + this.l3);
    }

    public String tipoTriangulo() {
        if (l1 == l2 && l1 == l3) {
            return "Equilatero";
        }
        if (l1 == l2 && l1 != l3) {
            return "Isoceles";
        }
        return "Escaleno";
    }
}
