package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TestaContaBancaria {
    private static final String NUMERO_CONTA_PADRAO = "12345-6";
    private static final String TITULAR_PADRAO = "Kátila Thaiana Stefanes";
    private static final double SALDO_INICIAL = 500.0;
    private static final double VALOR_DEPOSITO = 250.0;
    private static final double VALOR_SAQUE = 100.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(NUMERO_CONTA_PADRAO);
        conta.setTitular(TITULAR_PADRAO);
        conta.setSaldo(SALDO_INICIAL);

        System.out.printf("Número da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.imprimirSaldo();

        conta.depositar(VALOR_DEPOSITO);
        conta.imprimirSaldo();

        conta.sacar(VALOR_SAQUE);
        conta.imprimirSaldo();
    }
}