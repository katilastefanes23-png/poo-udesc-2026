package exercicio1oo.classes;

class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Tiguan";
        carro.marca = "Volkswagem";
        carro.ano = 2010;
        carro.velocidade = 0.0;

        System.out.println("--- Dados do Carro ---");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}