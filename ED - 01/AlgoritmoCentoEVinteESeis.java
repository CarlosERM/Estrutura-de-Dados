import java.util.Scanner;

public class AlgoritmoCentoEVinteESeis {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    float x;
    
    System.out.print("Digite o valor de x: ");
    x = scn.nextFloat();

    if ( x == 5) System.out.println("O numero é o 5.");
    
    else {
      
      if (x == 200) System.out.println("O número é o 200.");
      
      else {
        
        if( x == 400 ) System.out.println("O número é o 400.");
        
        else {
          
          if ( x >=500 && x <=1000) System.out.println("Intervalo 500-1000.");
         
          else System.out.println("Fora do escopo.");
        }
       
      }
    }
    
    scn.close();

  }
}
