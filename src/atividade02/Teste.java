package atividade02;

public class Teste {
    static void main(String[] args) {
        Carta carta1 = new Carta("ouro", 2);
        Carta carta2 = new Carta("copa", 3);
        Carta carta3 = new Carta("copa", 3);

        System.out.println(carta3.comparaValor(carta1));
        System.out.println(carta1.comparaValor(carta2));

        System.out.println(carta1.comparaNaipe(carta2));
        System.out.println(carta2.comparaNaipe(carta3));

    }
}
