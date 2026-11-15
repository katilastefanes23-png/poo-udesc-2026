package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TestaLivro {
    private static final String TITULO_PADRAO = "Clean Code";
    private static final String AUTOR_PADRAO = "Robert C. Martin";
    private static final String GENERO_PADRAO = "Tecnologia";
    private static final boolean EMPRESTADO_INICIAL = false;

    private static final String TITULO_LIVRO_2 = "O Senhor dos Anéis";
    private static final String AUTOR_LIVRO_2 = "J. R. R. Tolkien";
    private static final String GENERO_LIVRO_2 = "Fantasia";
    private static final boolean EMPRESTADO_LIVRO_2 = true;

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo(TITULO_PADRAO);
        livro.setAutor(AUTOR_PADRAO);
        livro.setGenero(GENERO_PADRAO);
        livro.setEmprestado(EMPRESTADO_INICIAL);

        System.out.printf("Disponível inicialmente? %b%n", livro.verificarDisponibilidade());

        // Emprestando e tentando emprestar novamente
        livro.emprestar();
        livro.emprestar();
        System.out.printf("Disponível após empréstimo? %b%n", livro.verificarDisponibilidade());

        // Devolvendo e tentando devolver novamente
        livro.devolver();
        livro.devolver();
        System.out.printf("Disponível após devolução? %b%n", livro.verificarDisponibilidade());
        System.out.printf("%s%n", livro.toString());

        // Testando construtor parametrizado
        Livro livro2 = new Livro(TITULO_LIVRO_2, AUTOR_LIVRO_2, GENERO_LIVRO_2, EMPRESTADO_LIVRO_2);
        System.out.printf("Livro 2 disponível? %b%n", livro2.verificarDisponibilidade());
        System.out.printf("%s%n", livro2.toString());
    }
}