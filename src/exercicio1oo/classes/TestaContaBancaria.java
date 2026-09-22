package exercicio1oo.classes;

class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Atribuindo valores aos atributos
        conta.numeroConta = "12345-6";
        conta.titular = "Kátila Stefanes";
        conta.saldo = 158400.75;

        // Testando os atributos (lendo e imprimindo)
        System.out.println("--- Dados da Conta Bancária ---");
        System.out.println("Número da conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);

    }
}