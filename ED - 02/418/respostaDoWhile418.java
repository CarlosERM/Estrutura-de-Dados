import java.util.Scanner;

class respostaDoWhile418 {
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

    do {
      do {
        System.out.println("Digite o de A[" + (l + 1) + "][" + (c + 1) + "] : ");
        A[l][c] = scn.nextInt();
        c++;

      } while (c < 4);
      c = 0;
      l++;
    } while (l < 4);

    do {
      do {
        System.out.println("Digite o de B[" + (a + 1) + "][" + (b + 1) + "] : ");
        B[a][b] = scn.nextInt();
        SOMA[a][b] = A[a][b] + B[a][b];
        b++;
      } while (b < 4);
      b = 0;
      a++;
    } while (a < 4);

    System.out.println("Soma da Matriz");
    do {
      do {
        System.out.println(SOMA[h][j]);
        j++;
      } while (j < 4);
      j = 0;
      h++;
    } while (h < 4);
    scn.close();
  }
}