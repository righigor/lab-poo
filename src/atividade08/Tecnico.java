package atividade08;

public class Tecnico extends MembroComite{
    private String atividade;
    private Modalidade modalidade;

    public Tecnico(String nome, String genero, int idade) {
        super(nome, genero, idade);
    }

    public Tecnico(String nome, String genero, int idade, String atividade, Modalidade modalidade) {
        super(nome, genero, idade);
        this.atividade = atividade;
        this.modalidade = modalidade;
    }

    @Override
    public String exibirDados() {
        return "nome: " + this.nome + "; idade: " + this.idade + "; genero: " + this.genero + "; atividade: " + this. atividade + "; modalidade: " + this.modalidade;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
