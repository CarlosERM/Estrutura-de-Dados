
class respostaWhile167 {
  public static void main(String[] args) {
    int l =1, t = 1, c = l + 1;
    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");
    
    while(l <=9) {
      while(c <=10) {
        System.out.print("\t" + l + "-" + c);
        c++;
      }
       c = l + 1;
      System.out.println();

      while(t <= l) {
        System.out.print("\t");
        t++;
      }
      t = 1;
      l++;
    }
  }
}