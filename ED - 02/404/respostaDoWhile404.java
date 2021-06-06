import java.util.Scanner;

class respostaDoWhile404 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[][] N = new int[10][10];
    int l = 0;
    int c = 0;
    int x = 0;
    int t = 0;
    int v = x + 1;

    do {

      do {
        System.out.println("Digite o elemento da linha " + (l + 1) + " coluna " + (c + 1));
        N[l][c] = scn.nextInt();
        c++;
      } while (c <= 9);

      c = 0;
      l++;
    } while (l <= 9);

    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");

    do {

      do {
        System.out.print("\t" + N[x][v]);
        v++;
      } while (v <= 9);

      System.out.println();

      do {
        System.out.print("\t");
        t++;
      } while (t <= x);
      t = 0;

      x++;
      v = x + 1;

    } while (x <= 8);
    scn.close();
  }
}