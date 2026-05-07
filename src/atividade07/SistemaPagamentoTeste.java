package atividade07;

public class SistemaPagamentoTeste {
    static void main() {
        Assalariado assalariado = new Assalariado("igor", "righi", 1, 10);
        ControlePagamento controle = new ControlePagamento();

        controle.addPassivo(assalariado);

        System.out.println(controle.getPassivo(assalariado).getValorAPagar(5,1));
    }
}
