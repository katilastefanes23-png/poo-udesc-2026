package exercicio5oo.classes;

public class ContaBancaria {
    private static final double VALOR_MINIMO = 0.0;

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.setNumeroConta(numeroConta);
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > VALOR_MINIMO) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > VALOR_MINIMO) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > VALOR_MINIMO && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    public void imprimirSaldo() {
        System.out.printf("Conta: %s | Titular: %s | Saldo atual: R$ %.2f%n",
                this.numeroConta, this.titular, this.saldo);
    }

    @Override
    public String toString() {
        return String.format("ContaBancaria [numeroConta=%s, titular=%s, saldo=%.2f]",
                this.numeroConta, this.titular, this.saldo);
    }
}