import java.util.Scanner;

 class respostaFor428 {
//   A matriz dados contém na 1 coluna a matrícula do aluno; na 2, o sexo (0 para 
// feminino e 1 para masculino); na 3 o código do curso, e na 4 o CR. 
// Faça um algoritmo que armazene esses dados sabendo-se que: 
// E o código do curso é uma parte da matrícula: aascccnnn (aa ano, s 
// semestre, ccc código do curso e nnn matrícula no curso) 
// Um grupo empresarial resolveu premiar a aluna com CR mais alto de um curso 
// cujo código deverá ser digitado. Suponha 10 alunos e que o CR é um n2inteiro. 
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] dados = new int[2][4];
    int aux, codigo, pos = 0;

    for (int l = 0; l < 2; l++) {
      
      System.out.print("Digite a matrícula no formato aascccnnn: ");
      dados[l][0] = scn.nextInt();

      aux = dados[l][0] / 1000000;
      aux = dados[l][0] - aux * 1000000;
      dados[l][2] = aux / 1000;

      System.out.print("Digite o sexo(0 - F | 1 -M): ");
      dados[l][1] = scn.nextInt();

      System.out.print("Digite o CR do aluno: ");
      dados[l][3] = scn.nextInt();

      System.out.print("Digite o código do curso: ");
      codigo = scn.nextInt();

      pos = 0;

      for (int a = 0; a < 2; a++) {

        if (dados[a][2] == codigo && dados[a][1] == 0) {
          pos = a;
        } else if (dados[a][3] > dados[pos][3]) {
          pos = a;
        }

      }
    }

    System.out.println("Aluno(a) premiado(a): " + dados[pos][0] + " teve CR: " + dados[pos][3]);
    scn.close();
  }
}