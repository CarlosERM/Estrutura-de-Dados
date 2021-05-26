import java.util.Scanner;

class AlgoritmoNoventa {
  public static void main (String args[]) {
    Scanner scn = new Scanner(System.in);

    float numero;

    System.out.println("Digite um número: ");
    numero = scn.nextFloat();

    if (numero > 20) {
      System.out.println(numero);
    }
    scn.close();

  }
}