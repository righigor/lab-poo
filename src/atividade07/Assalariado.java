package atividade07;

public class Assalariado extends Empregado {
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return SALARIO + (this.horasExtras * HORA);
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
}
