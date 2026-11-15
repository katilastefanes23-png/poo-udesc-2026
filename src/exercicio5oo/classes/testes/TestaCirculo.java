package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TestaCirculo {
    private static final double RAIO_PADRAO = 4.0;
    private static final double RAIO_INVALIDO_NEGATIVO = -5.0;
    private static final double RAIO_INVALIDO_MAIOR = 1200.0;
    private static final double RAIO_2 = 10.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(RAIO_PADRAO);

        // Testando raios inválidos (não devem alterar o raio)
        circulo.setRaio(RAIO_INVALIDO_NEGATIVO);
        circulo.setRaio(RAIO_INVALIDO_MAIOR);

        System.out.printf("Raio: %.2f%n", circulo.getRaio());
        System.out.printf("Diâmetro: %.2f%n", circulo.calcularDiametro());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("%s%n", circulo.toString());

        // Testando construtor parametrizado
        Circulo circulo2 = new Circulo(RAIO_2);
        System.out.printf("Área do círculo 2: %.2f%n", circulo2.calcularArea());
        System.out.printf("%s%n", circulo2.toString());
    }
}