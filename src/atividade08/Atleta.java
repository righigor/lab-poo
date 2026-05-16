package atividade08;

public class Atleta extends MembroComite {
    private Modalidade modalidade;

    public Atleta(String nome, String genero, int idade, Modalidade modalidade) {
        super(nome, genero, idade);
        this.modalidade = modalidade;
    }

    @Override
    public String exibirDados() {
        return "nome: " + this.nome + "; idade: " + this.idade + "; genero: " + this.genero + "; modalidade: " + this.modalidade;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
