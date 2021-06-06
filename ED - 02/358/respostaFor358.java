import java.util.Scanner;

class respostaFor358 {
  // Criar um algoritmo que leia o preço de compra e o preço de venda de 100
  // mercadorias. O algoritmo devera imprimir quantas mercadorias proporcionam
  // m lucro < 10 %
  // 10 % <= lucro <= 20 %
  // m lucro > 20 %
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    float[] precoCompra = new float[100];
    float[] precoVenda = new float[100];

    float lucro;

    int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0;

    for (int a = 0; a < 3; a++) {
      System.out.print("Preço da compra: ");
      precoCompra[a] = scn.nextFloat();

      System.out.print("Preço de Venda: ");
      precoVenda[a] = scn.nextFloat();
    }
    for (int b = 0; b < 3; b++) {
      lucro = precoVenda[b] - precoCompra[b];

      if (lucro < 0.1 * precoCompra[b]) {
        totLucroMenor10++;
      } else if (lucro <= 0.2 * precoCompra[b]) {
        totLucroMenor20++;
      } else {
        totLucroMaior20++;
      }
    }
    System.out.println();
    System.out.println("Total de Mercadorias com lucro < 10%: " + totLucroMenor10);
    System.out.println("Total de Mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
    System.out.println("Total de Mercadorias com lucro > 20%: " + totLucroMaior20);
    scn.close();
  }
}