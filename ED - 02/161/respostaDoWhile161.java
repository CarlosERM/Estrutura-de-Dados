import java.util.Scanner;

class respostaDoWhile161 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    float num;
    int i = 1;
    
     do {
      System.out.print("Número: ");
      num = scn.nextFloat();
      System.out.println(num * num);
      i++;
    } while ( i <= 5);
    scn.close();

  }
}
