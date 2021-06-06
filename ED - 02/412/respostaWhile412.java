import java.util.Scanner;

class respostaWhile412 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] n = new int[5][5];
    int l = 0;
    int c = 0;
    int k = 0;
    int j = 0;
    int w = 0;
    int r = 0;
    while (l < 5) {
      while (c < 5) {
        System.out.print("Digite o elemento: " + (l + 1) + " - " + (c + 1) + " : ");
        n[l][c] = scn.nextInt();
        c++;
      }
      c = 0;
      l++;
    }
    
    System.out.println("\nToda a matriz.");

    while (k < 5) {
      while (j < 5) {
        System.out.print(n[k][j] + "\t");
        j++;
      }
      System.out.println();
      j = 0;
      k++;

    }

    System.out.println("Posições cuja linha + coluna dão resultado par.");
    while (w < 5) {
      while (r < 5) {
        System.out.print("\t");

        if ((w + r) % 2 == 0) {
          System.out.print(n[w][r]);
        }
        System.out.println();
        r++;
      }
      r = 0;
      w++;
    }
    scn.close();
  }
}
