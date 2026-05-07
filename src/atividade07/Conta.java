package atividade07;

public abstract class Conta implements Passivo {
    protected int diaVencimento;
    protected int mesVencimento;
    protected double valor;

    public abstract double getValorAPagar(int diaPagto, int mesPagto);

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public int getMesVencimento() {
        return mesVencimento;
    }

    public void setMesVencimento(int mesVencimento) {
        this.mesVencimento = mesVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
