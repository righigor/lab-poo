package atividade07;

public interface Passivo {
    public static final double SALARIO = 1621.00;
    public static final double HORA = 65;

    public abstract double getValorAPagar(int diaPagto, int mesPagto);
}
