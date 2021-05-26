import java.util.Scanner;

public class AlgoritmoCentoEVinteESeisSwitch {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    int x;
    
    System.out.print("Digite o valor de x: ");
    x = scn.nextInt();

    switch (x) {
      case 5:
        System.out.println("O numero é o 5.");
        break;
      case 200:
        System.out.println("O número é o 200.");
        break;
      case 400:
        System.out.println("O número é o 400.");
        break;
      default:
        if ( x >=500 && x <=1000) System.out.println("Intervalo 500-1000.");
        else System.out.println("Fora do escopo.");
      break;
    }
    scn.close();

  }
}
