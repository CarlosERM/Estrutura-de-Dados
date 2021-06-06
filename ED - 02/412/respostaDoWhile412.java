import java.util.Scanner;

class respostaDoWhile412 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] n = new int[5][5];
    int l = 0;
    int c = 0;
    int k = 0;
    int j = 0;
    int w = 0;
    int r = 0;
    do {
      do {
        System.out.print("Digite o elemento: " + (l + 1) + " - " + (c + 1) + " : ");
        n[l][c] = scn.nextInt();
        c++;
      } while (c < 5);
      c = 0;
      l++;
    } while (l < 5);
    System.out.println("Toda a matriz.");

    do {
      do {
        System.out.println(n[k][j]);
        j++;
      } while (j < 5);

      j = 0;
      k++;
    } while (k < 5);

    System.out.println("Posições cuja linha + coluna dão resultado par.");
    do {
      do {
        System.out.print("\t");

        if ((w + r) % 2 == 0) {
          System.out.print(n[w][r]);
        }
        System.out.println();
        r++;
      } while (r < 5);
      r = 0;
      w++;
    } while (w < 5);
    scn.close();
  }
}
