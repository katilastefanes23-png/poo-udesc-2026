package exercicio1oo.classes;

class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        // Atribuindo valor ao atributo
        circulo.raio = 4.5;

        // Testando o atributo
        System.out.println("--- Dados do Círculo ---");
        System.out.println("Raio: " + circulo.raio);
    }
}