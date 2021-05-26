import java.util.Scanner;

public class AlgortimoCentoEDois {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    float numero;
    System.out.print("Digite um número: ");
    numero = scn.nextFloat();

    if ( numero > 20) System.out.println("Maior que 20.");
    
    else {
      if (numero < 20) System.out.println("Menor que 20.");
      else System.out.println("Igual a 20.");
    }

    scn.close();
  }
}
