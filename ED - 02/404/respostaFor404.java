import java.util.Scanner;

class respostaFor404 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[][] N = new int[10][10];

    for (int l = 0; l <= 9; l++) {
      for (int c = 0; c <= 9; c++) {
        System.out.println("Digite o elemento da linha " + (l + 1) + " coluna " + (c + 1));
        N[l][c] = scn.nextInt();
      }
    }

    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");

    for (int x = 0; x <= 8; x++) {

      for (int v = x + 1; v <= 9; v++) {
        System.out.print("\t" + N[x][v]);
      }

      System.out.println();

      for (int t = 0; t <= x; t++) {
        System.out.print("\t");
      }

    }
    scn.close();
  }
}