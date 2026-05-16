package atividade08;

import java.util.ArrayList;
import java.util.HashMap;

public class DelegacaoOlimpica {
    private ArrayList<Modalidade> modalidades;
    private ArrayList<MembroComite> delegacao;
    private HashMap<Modalidade, Integer> contadorMembromPorModalidade;

    public DelegacaoOlimpica() {
        this.modalidades = new ArrayList<>();
        this.delegacao = new ArrayList<>();
        this.contadorMembromPorModalidade = new HashMap<>();
    }

    public void adicionarMembro(MembroComite m) {
        if (m instanceof Tecnico t) {
            if (!this.verificaModalidade(t.getModalidade())) return;
        }
        if (m instanceof Atleta a) {
            if (!this.verificaModalidade(a.getModalidade())) return;
        }
        delegacao.add(m);
    }

    private int contaMembros(MembroComite m) {return 0;}

    public void adiconarModalidade(Modalidade m) {
        modalidades.add(m);
    }

    private boolean verificaModalidade(Modalidade m) {
        for (Modalidade modalidade : modalidades) {
            if (m.equals(modalidade)) return true;
        }
        return false;
    }

}
