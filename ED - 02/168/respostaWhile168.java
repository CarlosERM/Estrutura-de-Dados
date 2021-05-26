
class respostaWhile168 {
  public static void main(String[] args) {
    int l = 1, t = 1;

    System.out.println("DIAGONAL PRINCIPAL");
    
    while(l <=10) {
      System.out.println(l + "-" + l);

      while(t <= l) {
        System.out.print("\t");
        t++;
      }
      t = 1;
      l++;
    }
    

  }
}