package atividade07;

public class Tercerizado extends Empregado {
    private double horasTrabalhadas;

    public Tercerizado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public Tercerizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorAPagar(int diaPagto, int mesPagto) {
        return this.horasTrabalhadas * HORA;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
