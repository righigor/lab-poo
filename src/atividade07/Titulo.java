package atividade07;

public class Titulo extends Conta {

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        if (mesPagto > mesVencimento || (mesPagto == mesVencimento && diaPagto > diaVencimento)) {
            return valor * 1.1;
        }
        return valor;
    }
}
