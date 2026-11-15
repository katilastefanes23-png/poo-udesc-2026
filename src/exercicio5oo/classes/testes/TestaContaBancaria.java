package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

class TestaCarro {
    private static final String MARCA_PADRAO = "Fiat";
    private static final String MODELO_PADRAO = "Uno";
    private static final int ANO_PADRAO = 2020;
    private static final double VELOCIDADE_INICIAL = 0.0;
    private static final double VELOCIDADE_INVALIDA_ALTA = 350.0;
    private static final double VELOCIDADE_INVALIDA_NEGATIVA = -20.0;

    private static final String MARCA_CARRO_2 = "Volkswagen";
    private static final String MODELO_CARRO_2 = "Gol";
    private static final int ANO_CARRO_2 = 2022;
    private static final double VELOCIDADE_CARRO_2 = 80.0;

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca(MARCA_PADRAO);
        carro.setModelo(MODELO_PADRAO);
        carro.setAno(ANO_PADRAO);
        carro.setVelocidade(VELOCIDADE_INICIAL);

        // Testando frear parado (não pode ficar negativa) e velocidades inválidas
        carro.frear();
        carro.setVelocidade(VELOCIDADE_INVALIDA_ALTA);
        carro.setVelocidade(VELOCIDADE_INVALIDA_NEGATIVA);
        carro.imprimirVelocidade();

        // Acelerando e freando normalmente
        carro.acelerar();
        carro.acelerar();
        carro.imprimirVelocidade();

        carro.frear();
        carro.imprimirVelocidade();
        System.out.printf("%s%n", carro.toString());

        // Testando construtor parametrizado
        Carro carro2 = new Carro(MODELO_CARRO_2, MARCA_CARRO_2, ANO_CARRO_2, VELOCIDADE_CARRO_2);
        carro2.acelerar();
        carro2.imprimirVelocidade();
        System.out.printf("%s%n", carro2.toString());
    }
}