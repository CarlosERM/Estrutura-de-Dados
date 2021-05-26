import java.util.Scanner;
import java.lang.Math;
class AlgoritmoCinquentaENove {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    
    float a, b, c;
    
    System.out.println("Entrar com 1 cateto: ");
    b = scn.nextFloat();
    
    System.out.println("Entrar com 2 cateto: ");
    c = scn.nextFloat();

    a = (float) Math.sqrt( Math.pow(b,2) + Math.pow(c,2) );
    System.out.println("A hipotenusa é: " + a);
    scn.close();
  }
}