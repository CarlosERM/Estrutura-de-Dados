import java.util.Scanner;

class respostaFor425 {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int[][] qtde = new int[50][3];
    String[] nome = new String[50];

    for (int l = 0; l < 50; l++) {

      System.out.print("Digite o nome da " + (l + 1) + "ª planta: ");
      nome[l] = scn.next();

      System.out.print("\nDigite a quantidade em estoque: ");
      qtde[l][0] = scn.nextInt();

      System.out.print("\nDigite a quantidade ideal: ");
      qtde[l][1] = scn.nextInt();

      if (qtde[l][0] < qtde[l][1]) {
        qtde[l][2] = qtde[l][1] - qtde[l][0];
      } else {
        qtde[l][2] = 0;
      }
    }

    System.out.println("\nTotal de compras");

    for (int x = 0; x < 5; x++) {
      System.out.println(nome[x] + " - " + qtde[x][2]);
    }

    scn.close();
  }
}