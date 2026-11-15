package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TestaRetangulo {
    private static final double LARGURA_PADRAO = 5.0;
    private static final double ALTURA_PADRAO = 3.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(LARGURA_PADRAO);
        retangulo.setAltura(ALTURA_PADRAO);

        System.out.printf("Largura: %.2f%n", retangulo.getLargura());
        System.out.printf("Altura: %.2f%n", retangulo.getAltura());
        System.out.printf("Área do retângulo: %.2f%n", retangulo.calcularArea());
    }
}
