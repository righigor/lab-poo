package atividade05;

import java.util.ArrayList;

public abstract class Forma {
    private ArrayList<Ponto2D> pontos;

    public Forma(ArrayList<Ponto2D> pontos) {
        this.pontos = pontos;
    }

    static Forma geraForma(ArrayList<Ponto2D> ps) {
        switch (ps.size()) {
            case 2:
                return new Circulo(ps);
            case 3:
                double l1 = ps.get(0).calcularDistancia(ps.get(1));
                double l2 = ps.get(0).calcularDistancia(ps.get(2));
                double l3 = ps.get(2).calcularDistancia(ps.get(1));
                if ((l1 + l2) > l3) {
                    return new Triangulo(ps);
                }
                break;
            case 4:
                return new Quadrado(ps);
            default:
                return null;
        }
        return null;
    }

    public ArrayList<Ponto2D> getPontos() {
        return pontos;
    }

    public void setPontos(ArrayList<Ponto2D> pontos) {
        this.pontos = pontos;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
