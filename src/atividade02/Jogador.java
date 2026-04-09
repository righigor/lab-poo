package atividade02;

public class Jogador {
    private Carta[] cartas;


    public Jogador() {
        this.cartas = new Carta[5];
    }

    public Jogador(int num) {
        this.cartas = new Carta[num];
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta carta, int index) {
        this.cartas[index] = carta;
    }

    public void setNumCartas(int num) {
        this.cartas = new Carta[num];
    }

    public void imprimeCartas() {
        for (Carta carta : cartas) {
            if (carta != null) {
                carta.imprimeCarta();
            } else {
                System.out.println("Posição vazia (sem carta)");
            }
        }
    }
}
