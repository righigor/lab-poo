package atividade02;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

        Baralho baralho = new Baralho();
        System.out.println("Mesa embaralhando.........");
        Jogador p1 = new Jogador();
        Jogador p2 = new Jogador();

        System.out.println("Informe o número de cartas a distribuir para os jogadores:");
        int size = scanner.nextInt();
        p1.setNumCartas(size);
        p2.setNumCartas(size);

        baralho.distribuir(p1, size);
        baralho.distribuir(p2, size);

        System.out.println("Mesa distribui as " + size + " cartas para o jogador A e para o jogador B.");

        Carta c1 = p1.getCartas()[0];
        Carta c2 = p2.getCartas()[0];

        System.out.print("O jogador A joga a "); c1.imprimeCarta();
        System.out.print("O jogador B joga a "); c2.imprimeCarta();

        int resultado = c1.comparaValor(c2);

        if (resultado > 0) {
            System.out.println("O jogador A venceu o jogo.");
        } else if (resultado < 0) {
            System.out.println("O jogador B venceu o jogo.");
        } else {
            System.out.println("Como os valores são iguais, jogo empatou!");
        }
            System.out.println("Deseja continuar? S/N");
            String res = scanner.next();
            continuar = res.equals("S");
        }
    }
}
