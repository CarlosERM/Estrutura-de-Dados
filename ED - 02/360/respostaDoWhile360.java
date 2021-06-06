import java.util.Scanner;

class respostaDoWhile360 {
  // Criar um algoritmo que imprima o horóscopo de várias pessoas, a partir de sua
  // data de nascimento (ddmm). O fim é determinado quando se digita 9999 para
  // data; considere que a data foi digitada corretamente.
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String[] signo = new String[12];
    int[] ultDia = new int[12];

    int data, dia, mes;
    int i = 0;

    do {
      System.out.print("Digite o signo: ");
      signo[i] = scn.next();

      System.out.print("Digite o último dia: ");
      ultDia[i] = scn.nextInt();
      // Canseira. Prefiriria carregar um array já feito.
      i++;
    } while (i < 12);

    System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
    data = scn.nextInt();
    if (data != 9999) {
      do {
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
      } while (data != 9999);

    }
    scn.close();
  }

}
