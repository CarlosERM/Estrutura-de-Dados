import java.util.Scanner;
class AlgoritmoSessentaEQuatro {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    
    float f, c;
    
    System.out.print("Digite o valor da temperatura em graus centígrados: ");
    
    c = scn.nextFloat();
  
    f = (9 * c + 160)/5;
    
    System.out.println("O valor da temperatura em graus fahrenheit é " + f);
    
    scn.close();
  }
}