import java.util.Scanner;

class respostaFor412 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[][] n = new int[5][5];

    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 5; c++) {

        System.out.print("Digite o elemento: " + (l + 1) + " - " + (c + 1) + " : ");
        n[l][c] = scn.nextInt();
      }
    }
    System.out.println("Toda a matriz.");

    for (int k = 0; k < 5; k++) {
      for (int j = 0; j < 5; j++) {
        System.out.println(n[k][j]);
      }
    }

    System.out.println("Posições cuja linha + coluna dão resultado par.");
    for (int w = 0; w < 5; w++) {
      for (int r = 0; r < 5; r++) {
        System.out.print("\t");

        if ((w + r) % 2 == 0) {
          System.out.print(n[w][r]);
        }
        System.out.println();
      }
    }
    scn.close();
  }
}
