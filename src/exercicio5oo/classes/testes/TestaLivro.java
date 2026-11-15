package exercicio5oo.classes.testes;

import exercicio4oo.classes.Livro;

public class TestaLivro {
    private static final String TITULO_PADRAO = "Clean Code";
    private static final String AUTOR_PADRAO = "Robert C. Martin";
    private static final String GENERO_PADRAO = "Tecnologia";
    private static final boolean EMPRESTADO_INICIAL = false;

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo(TITULO_PADRAO);
        livro.setAutor(AUTOR_PADRAO);
        livro.setGenero(GENERO_PADRAO);
        livro.setEmprestado(EMPRESTADO_INICIAL);

        System.out.printf("Título: %s | Autor: %s | Gênero: %s%n",
                livro.getTitulo(), livro.getAutor(), livro.getGenero());
        System.out.printf("Disponível para empréstimo? %b%n", livro.verificarDisponibilidade());

        livro.emprestar();
        System.out.printf("Disponível após empréstimo? %b%n", livro.verificarDisponibilidade());

        livro.devolver();
        System.out.printf("Disponível após devolução? %b%n", livro.verificarDisponibilidade());
    }
}