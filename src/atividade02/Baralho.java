package atividade02;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Baralho {
    private String[] naipes = {"ouros", "copas", "paus", "espadas"};
    private Carta[] cartas;
    private SecureRandom gerador;

    public Baralho() {
        this.gerador = new SecureRandom();
        this.cartas = new Carta[52];
        int k = 0;
        for (String naipe : naipes) {
            for (int j = 1; j <= 13; j++) {
                cartas[k++] = new Carta(naipe, j);
            }
        }
    }

    public int embaralhar() {
        return gerador.nextInt(52);
    }

    public void distribuir(Jogador p, int size) {
        for (int i = 0; i < size; i++) {
            p.setCartas(cartas[embaralhar()], i);
        }
    }

}
