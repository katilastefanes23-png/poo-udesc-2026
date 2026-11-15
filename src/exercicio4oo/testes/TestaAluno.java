package exercicio4oo.testes;

import exercicio4oo.classes.Aluno;

public class TestaAluno {
     private static final String MATRICULA_KATILA = "14100033";
     private static final String NOME_KATILA = "Kátila Thaiana Stefanes";
     private static final int IDADE_KATILA = 30;
     private static final int NOTA_1 = 10;
     private static final int NOTA_2 = 10;
     private static final int NOTA_3 = 9;
     private static final int NOTA_4 = 10;

     public static void main(String[] args) {
          Aluno katila = new Aluno();
          katila.setMatricula(MATRICULA_KATILA);
          katila.setNome(NOME_KATILA);
          katila.setIdade(IDADE_KATILA);
          katila.setNota1(NOTA_1);
          katila.setNota2(NOTA_2);
          katila.setNota3(NOTA_3);
          katila.setNota4(NOTA_4);

          System.out.printf("Matrícula: %s%n", katila.getMatricula());
          System.out.printf("Nome: %s%n", katila.getNome());
          System.out.printf("Idade: %d%n", katila.getIdade());
          System.out.printf("Nota 1: %d%n", katila.getNota1());
          System.out.printf("Nota 2: %d%n", katila.getNota2());
          System.out.printf("Nota 3: %d%n", katila.getNota3());
          System.out.printf("Nota 4: %d%n", katila.getNota4());
          System.out.printf("Média: %.2f%n", katila.calcularMedia());
          katila.imprimirSituacao();
     }
}