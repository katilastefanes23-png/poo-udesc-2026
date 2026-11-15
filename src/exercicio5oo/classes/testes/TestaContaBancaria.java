package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TestaContaBancaria {
    private static final String NUMERO_CONTA_PADRAO = "12345-6";
    private static final String TITULAR_PADRAO = "Kátila Thaiana Stefanes";
    private static final double SALDO_INICIAL = 500.0;
    private static final double VALOR_DEPOSITO = 250.0;
    private static final double VALOR_SAQUE = 100.0;
    private static final double VALOR_NEGATIVO = -50.0;

    private static final String NUMERO_CONTA_2 = "98765-4";
    private static final String TITULAR_CONTA_2 = "Maria Oliveira";
    private static final double SALDO_CONTA_2 = 1000.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(NUMERO_CONTA_PADRAO);
        conta.setTitular(TITULAR_PADRAO);
        conta.setSaldo(SALDO_INICIAL);

        // Testando valores negativos (não devem alterar o saldo)
        conta.setSaldo(VALOR_NEGATIVO);
        conta.depositar(VALOR_NEGATIVO);
        conta.sacar(VALOR_NEGATIVO);
        conta.imprimirSaldo();

        // Operações válidas
        conta.depositar(VALOR_DEPOSITO);
        conta.imprimirSaldo();

        conta.sacar(VALOR_SAQUE);
        conta.imprimirSaldo();
        System.out.printf("%s%n", conta.toString());

        // Testando construtor parametrizado
        ContaBancaria conta2 = new ContaBancaria(NUMERO_CONTA_2, TITULAR_CONTA_2, SALDO_CONTA_2);
        conta2.imprimirSaldo();
        System.out.printf("%s%n", conta2.toString());
    }
}