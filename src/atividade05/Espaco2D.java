package atividade05;

import java.util.ArrayList;

public class Espaco2D {
    private ArrayList<Forma> formas;

    public Espaco2D(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public Espaco2D() {
        this.formas = new ArrayList<>();
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public void adicionarForma(Forma forma) {
        formas.add(forma);
    }

    public double calcularAreaTotal() {
        double total = 0.0;

        for (Forma forma : formas) {
            total += forma.calcularArea();
        }

        return total;
    }

    public double calcularPerimetroTotal() {
        double total = 0.0;

        for (Forma forma : formas) {
            total += forma.calcularPerimetro();
        }

        return total;
    }

    public void mostrarTiposTriangulos() {
        for (Forma forma : formas) {
            if (forma instanceof Triangulo) {
                String tipo = ((Triangulo) forma).tipoTriangulo();
                System.out.println(tipo);
            }
        }
    }

}
