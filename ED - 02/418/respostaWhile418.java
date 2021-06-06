import java.util.Scanner;

class respostaWhile418 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] A = new int[4][4];
    int[][] B = new int[4][4];
    int[][] SOMA = new int[4][4];

    int l = 0;
    int c = 0;
    int a = 0;
    int b = 0;
    int h = 0;
    int j = 0;

    while (l < 4) {
      while (c < 4) {
        System.out.println("Digite o de A[" + (l + 1) + "][" + (c + 1) + "] : ");
        A[l][c] = scn.nextInt();
        c++;

      }
      c = 0;
      l++;
    }

    while (a < 4) {
      while (b < 4) {
        System.out.println("Digite o de B[" + (a + 1) + "][" + (b + 1) + "] : ");
        B[a][b] = scn.nextInt();
        SOMA[a][b] = A[a][b] + B[a][b];
        b++;
      }
      b = 0;
      a++;
    }
    System.out.println("Soma da Matriz");
    while (h < 4) {
      while (j < 4) {
        System.out.println(SOMA[h][j]);
        j++;
      }
      j = 0;
      h++;
    }
    scn.close();
  }
}