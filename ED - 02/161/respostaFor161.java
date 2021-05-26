import java.util.Scanner;

class respostaFor161 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    float num;
   
    for (int i = 1; i <=5; i++) {
      System.out.print("Número: ");
      num = scn.nextFloat();
      System.out.println(num * num);
    }
    
    scn.close();
  }
}