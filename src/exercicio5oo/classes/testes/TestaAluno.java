package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TestaAluno {
    private static final String MATRICULA_KATILA = "14100033";
    private static final String NOME_KATILA = "Kátila Thaiana Stefanes";
    private static final int IDADE_KATILA = 30;
    private static final int NOTA_1 = 10;
    private static final int NOTA_2 = 10;
    private static final int NOTA_3 = 9;
    private static final int NOTA_4 = 10;
    private static final int NOTA_INVALIDA_MAIOR = 15;
    private static final int NOTA_INVALIDA_MENOR = -2;

    private static final String MATRICULA_ALUNO_2 = "20260002";
    private static final String NOME_ALUNO_2 = "João Silva";
    private static final int IDADE_ALUNO_2 = 22;
    private static final int NOTA_ALUNO_2_1 = 6;
    private static final int NOTA_ALUNO_2_2 = 5;
    private static final int NOTA_ALUNO_2_3 = 7;
    private static final int NOTA_ALUNO_2_4 = 6;

    public static void main(String[] args) {
        Aluno katila = new Aluno();
        katila.setMatricula(MATRICULA_KATILA);
        katila.setNome(NOME_KATILA);
        katila.setIdade(IDADE_KATILA);
        katila.setNota1(NOTA_1);
        katila.setNota2(NOTA_2);
        katila.setNota3(NOTA_3);
        katila.setNota4(NOTA_4);

        // Testando notas inválidas (não devem alterar as notas anteriores)
        katila.setNota1(NOTA_INVALIDA_MAIOR);
        katila.setNota2(NOTA_INVALIDA_MENOR);

        System.out.printf("Matrícula: %s%n", katila.getMatricula());
        System.out.printf("Nome: %s%n", katila.getNome());
        System.out.printf("Idade: %d%n", katila.getIdade());
        System.out.printf("Notas: %d, %d, %d, %d%n",
                katila.getNota1(), katila.getNota2(), katila.getNota3(), katila.getNota4());
        System.out.printf("Média: %.2f%n", katila.calcularMedia());
        katila.imprimirSituacao();
        System.out.printf("%s%n", katila.toString());

        // Testando construtor parametrizado
        Aluno aluno2 = new Aluno(MATRICULA_ALUNO_2, NOME_ALUNO_2, IDADE_ALUNO_2,
                NOTA_ALUNO_2_1, NOTA_ALUNO_2_2, NOTA_ALUNO_2_3, NOTA_ALUNO_2_4);
        aluno2.imprimirSituacao();
        System.out.printf("%s%n", aluno2.toString());
    }
}