package atividade01;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto2D ponto) {
        double dx = this.getX() - ponto.getX();
        double dy = this.getY() - ponto.getY();
        return sqrt(pow(dx,2) + pow(dy, 2));
    }

    public void imprimirPontos() {
        System.out.println(this.x + ", " + this.y);
    }
}