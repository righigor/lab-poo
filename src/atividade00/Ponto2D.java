package atividade00;

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
        double dx = ponto.getX() - this.getY();
        double dy = ponto.getY() - this.getY();
        return sqrt(pow(dx,2) + pow(dy, 2));
    }
}
