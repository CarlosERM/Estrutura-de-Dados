import java.util.Scanner;

class respostaWhile161 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    float num;
    int i = 1;
    
    while ( i <= 5) {
      System.out.print("Número: ");
      num = scn.nextFloat();
      System.out.println(num * num);
      i++;
    }
    scn.close();

  }
}