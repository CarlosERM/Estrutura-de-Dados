import java.util.Scanner;

class respostaWhile428 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] dados = new int[10][4];
    int aux, codigo, pos = 0;
    int l = 0;
    int a = 0;
    while (l < 10) {
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

      while (a < 10) {
        if (dados[a][2] == codigo && dados[l][1] == 0) {
          pos = a;
        } else if (dados[l][3] == codigo && dados[l][3] == 0) {
          pos = a;
        }
        a++;
      }
      a = 0;
      l++;
    }

    System.out.println("Aluna premiada: " + dados[pos][0] + "teve CR: " + dados[pos][3]);
    scn.close();
  }
}