package atividade07;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> pagamentos;

    public ControlePagamento(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public ControlePagamento() {
        this.pagamentos = new ArrayList<>();
    }

    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void addPassivo(Passivo p) {
        pagamentos.add(p);
    }

    public Passivo getPassivo(Passivo p) {
        for (Passivo pag: pagamentos) {
            if (pag.equals(p)){
                return pag;
            }
        }
        return null;
    }
}
