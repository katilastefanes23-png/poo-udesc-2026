package exercicio5oo.classes.testes;

import exercicio4oo.classes.Carro;

public class TestaCarro {
    private static final String MARCA_PADRAO = "Fiat";
    private static final String MODELO_PADRAO = "Uno";
    private static final int ANO_PADRAO = 2020;
    private static final double VELOCIDADE_INICIAL = 0.0;

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca(MARCA_PADRAO);
        carro.setModelo(MODELO_PADRAO);
        carro.setAno(ANO_PADRAO);
        carro.setVelocidade(VELOCIDADE_INICIAL);

        System.out.printf("Marca: %s | Modelo: %s | Ano: %d%n",
                carro.getMarca(), carro.getModelo(), carro.getAno());
        carro.acelerar();
        carro.acelerar();
        carro.imprimirVelocidade();

        carro.frear();
        carro.imprimirVelocidade();
    }
}