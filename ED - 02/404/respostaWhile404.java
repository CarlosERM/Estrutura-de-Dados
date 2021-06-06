import java.util.Scanner;

class respostaWhile404 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[][] N = new int[10][10];
    int l = 0;
    int c = 0;
    int x = 0;
    int t = 0;
    int v = x + 1;

    while (l <= 9) {

      while (c <= 9) {
        System.out.println("Digite o elemento da linha " + (l + 1) + " coluna " + (c + 1));
        N[l][c] = scn.nextInt();

        c++;
      }

      c = 0;
      l++;
    }

    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");

    while (x <= 8) {

      while (v <= 9) {
        System.out.print("\t" + N[x][v]);
        v++;
      }

      System.out.println();

      while (t <= x) {
        System.out.print("\t");
        t++;
      }
      t = 0;

      x++;
      v = x + 1;

    }
    scn.close();
  }
}