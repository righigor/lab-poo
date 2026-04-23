package atividade05;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        Espaco2D espaco = new Espaco2D();

        ArrayList<Ponto2D> pontosCirculo = new ArrayList<>();
        pontosCirculo.add(new Ponto2D(0, 0));
        pontosCirculo.add(new Ponto2D(2, 0));

        ArrayList<Ponto2D> pontosTriangulo = new ArrayList<>();
        pontosTriangulo.add(new Ponto2D(0, 0));
        pontosTriangulo.add(new Ponto2D(2, 0));
        pontosTriangulo.add(new Ponto2D(1, 2));

        ArrayList<Ponto2D> pontosQuadrado = new ArrayList<>();
        pontosQuadrado.add(new Ponto2D(0, 0));
        pontosQuadrado.add(new Ponto2D(2, 0));
        pontosQuadrado.add(new Ponto2D(2, 2));
        pontosQuadrado.add(new Ponto2D(0, 2));

        Forma f1 = Forma.geraForma(pontosCirculo);
        Forma f2 = Forma.geraForma(pontosTriangulo);
        Forma f3 = Forma.geraForma(pontosQuadrado);

        espaco.adicionarForma(f1);
        espaco.adicionarForma(f2);
        espaco.adicionarForma(f3);

        System.out.println("Área total: " + espaco.calcularAreaTotal());
        System.out.println("Perimetro total: " + espaco.calcularPerimetroTotal());

        System.out.println("Tipos de triângulos:");
        espaco.mostrarTiposTriangulos();
    }
}