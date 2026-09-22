package exercicio1oo.classes;

class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Clube da Luta";
        livro.autor = "Chuck Palahniuk";
        livro.genero = "Drama psicológico";
        livro.emprestado = false;

        System.out.println("--- Dados do Livro ---");
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Gênero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}