import java.util.Scanner;

class respostaWhile360 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    String[] signo = new String[12];
    int[] ultDia = new int[12];

    int data, dia, mes;
    int i = 0;
    while (i < 12) {
      System.out.print("Digite o signo: ");
      signo[i] = scn.next();

      System.out.print("Digite o último dia: ");
      ultDia[i] = scn.nextInt();
      // Canseira. Prefiriria carregar um array já feito.
      i++;
    }

    System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
    data = scn.nextInt();

    while (data != 9999) {
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