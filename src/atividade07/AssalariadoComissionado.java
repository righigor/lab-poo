package atividade07;

public class AssalariadoComissionado extends Comissionado {
    private double percentualBonus;

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
        super(nome, sobrenome, numIdent, valorVendas);
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return SALARIO * percentualBonus + (super.getValorAPagar(diaPagto, mesPagto));
    }

    public double getPecentualBonus() {
        return percentualBonus;
    }

    public void setPecentualBonus(double percentualBonus) {
        if (percentualBonus > 1) {
            percentualBonus = percentualBonus + 1;
        }
        this.percentualBonus = percentualBonus;
    }
}
