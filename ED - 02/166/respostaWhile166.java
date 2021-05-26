
class respostaWhile166 {
  public static void main(String[] args) {
    
    int l = 1, c = 1;
    System.out.println("TODOS");

    while(l <= 10) {
      while (c <=10) {
        System.out.print(l + "-" + c + "\t");
        c++;
      }
      System.out.println();
      l++;
      c = 1;
    }

  }
}