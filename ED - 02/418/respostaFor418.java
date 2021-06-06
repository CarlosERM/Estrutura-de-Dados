import java.util.Scanner;

class respostaFor418 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] A = new int[4][4];
    int[][] B = new int[4][4];
    int[][] SOMA = new int[4][4];

    // int l, c;

    for (int l = 0; l < 4; l++) {
      for (int c = 0; c < 4; c++) {
        System.out.println("Digite o de A[" + (l + 1) + "][" + (c + 1) + "] : ");
        A[l][c] = scn.nextInt();
      }
    }
    for (int a = 0; a < 4; a++) {
      for (int b = 0; b < 4; b++) {
        System.out.println("Digite o de B[" + (a + 1) + "][" + (b + 1) + "] : ");
        B[a][b] = scn.nextInt();
        SOMA[a][b] = A[a][b] + B[a][b];

      }
    }
    System.out.println("Soma da Matriz");
    for (int h = 0; h < 4; h++) {
      for (int j = 0; j < 4; j++) {
        System.out.println(SOMA[h][j]);
      }
    }
    scn.close();
  }
}