package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    private static final double LARGURA_PADRAO = 5.0;
    private static final double ALTURA_PADRAO = 3.0;
    private static final double LARGURA_INVALIDA = 1500.0;
    private static final double ALTURA_INVALIDA = -10.0;
    private static final double LARGURA_2 = 12.5;
    private static final double ALTURA_2 = 8.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(LARGURA_PADRAO);
        retangulo.setAltura(ALTURA_PADRAO);

        // Testando valores inválidos (não devem alterar largura e altura)
        retangulo.setLargura(LARGURA_INVALIDA);
        retangulo.setAltura(ALTURA_INVALIDA);

        System.out.printf("Largura: %.2f%n", retangulo.getLargura());
        System.out.printf("Altura: %.2f%n", retangulo.getAltura());
        System.out.printf("Área do retângulo: %.2f%n", retangulo.calcularArea());
        System.out.printf("%s%n", retangulo.toString());

        // Testando construtor parametrizado
        Retangulo retangulo2 = new Retangulo(LARGURA_2, ALTURA_2);
        System.out.printf("Área do retângulo 2: %.2f%n", retangulo2.calcularArea());
        System.out.printf("%s%n", retangulo2.toString());
    }
}