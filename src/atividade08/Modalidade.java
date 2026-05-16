package atividade08;

public class Modalidade {
    private int limitadeMembros;
    private String descricao;

    public Modalidade(int limitadeMembros, String descricao) {
        this.limitadeMembros = limitadeMembros;
        this.descricao = descricao;
    }

    public Modalidade() {
    }

    public int getLimitadeMembros() {
        return limitadeMembros;
    }

    public void setLimitadeMembros(int limitadeMembros) {
        this.limitadeMembros = limitadeMembros;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
