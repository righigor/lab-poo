package atividade01;

import java.util.ArrayList;

public class Reta {
    static private double m;
    static private double b;
    private Ponto2D[] pontos;
    private int index;

    public Reta() {
        this.pontos = new Ponto2D[7];
        this.index = 0;
    }

    public static double getM() {
        return m;
    }

    public static void setM(double m) {
        Reta.m = m;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        Reta.b = b;
    }

    public static Ponto2D calcularPontaNaReta(double x) {
        double y = m * x + b;
        return new Ponto2D(x, y);
    }

    public void adicionarPonto(Ponto2D ponto) {
        pontos[this.index] = ponto;
        index++;
    }

    public void removePonto(Ponto2D ponto) {
        for (int i = 0; i < 7; i++) {
            if (pontos[i].equals(ponto)) {
                pontos[i] = null;
            }
        }
    }

    public void imprimirPontos() {
        System.out.println("Os pontos são:");
        for (int i = 0; i < 7; i++) {
            pontos[i].imprimirPontos();
        }
    }

}
