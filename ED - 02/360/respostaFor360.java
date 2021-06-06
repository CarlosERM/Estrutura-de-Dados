import java.util.Scanner;

class respostaFor360 {
  // Criar um algoritmo que leia o preço de compra e o preço de venda de 100
  // mercadorias.
  // O algoritmo devera imprimir quantas mercadorias proporcionam
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String[] signo = new String[12];
    int[] ultDia = new int[12];

    int data, dia, mes;

    for (int i = 0; i < 12; i++) {
      System.out.print("Digite o signo: ");
      signo[i] = scn.next();

      System.out.print("Digite o último dia: ");
      ultDia[i] = scn.nextInt();
    }

    System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
    data = scn.nextInt();
    // 0709
    for (; data != 9999;) {
      dia = data / 100;
      mes = data % 100;
      mes--;

      if (dia > ultDia[mes]) {
        mes = (mes + 1) % 12;
      }

      System.out.println("Signo: " + signo[mes]);

      System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
      data = scn.nextInt();

      System.out.println();
    }
    scn.close();
  }
}