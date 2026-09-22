package exercicio1oo.classes;

class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        // Atribuindo valores aos atributos
        retangulo.largura = 5.0;
        retangulo.altura = 3.0;

        // Testando os atributos (lendo e imprimindo)
        System.out.println("--- Dados do Retângulo ---");
        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);

    }
}
