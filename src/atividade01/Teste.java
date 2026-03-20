package atividade01;

import java.util.Scanner;

public class Teste {
    static void main(String[] args) {
        Reta r = new Reta();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de m:");
        double m = scanner.nextDouble();
        Reta.setM(m);
        System.out.println("Digite o valor de b:");
        double b = scanner.nextDouble();
        Reta.setB(b);

        for (int i = 0; i < 7; i++) {
            r.adicionarPonto(Reta.calcularPontaNaReta(i));
        }

        r.imprimirPontos();
    }
}
