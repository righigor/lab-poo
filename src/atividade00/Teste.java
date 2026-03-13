package atividade00;

public class Teste {
    static void main(String[] args) {
        Ponto2D a = new Ponto2D();
        System.out.println("Coordenadas do ponto a:");
        System.out.println("x: " + a.getX() + " y: " + a.getY());

        Ponto2D b = new Ponto2D(2, 2);
        System.out.println("Coordenadas do ponto b:");
        System.out.println("x: " + b.getX() + " y: " + b.getY());

        double distancia = a.calcularDistancia(b);
        System.out.println("A distancia entre os pontos a e b é: " + distancia);
    }
}
