import java.util.Scanner;

class respostaWhile358 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    float[] precoCompra = new float[100];
    float[] precoVenda = new float[100];

    float lucro;

    int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0;
    int a = 0, b = 0;
    while (a < 100) {
      System.out.print("Preço da compra: ");
      precoCompra[a] = scn.nextFloat();

      System.out.print("Preço de Venda: ");
      precoVenda[a] = scn.nextFloat();
      a++;
    }
    while (b < 100) {
      lucro = precoVenda[b] - precoCompra[b];

      if (lucro < 0.1 * precoCompra[b]) {
        totLucroMenor10++;
      } else if (lucro <= 0.2 * precoCompra[b]) {
        totLucroMenor20++;
      } else {
        totLucroMaior20++;
      }
      b++;
    }
    System.out.println();
    System.out.println("Total de Mercadorias com lucro < 10%: " + totLucroMenor10);
    System.out.println("Total de Mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20);
    System.out.println("Total de Mercadorias com lucro > 20%: " + totLucroMaior20);
    scn.close();
  }
}