
class respostaDoWhile167 {
  
  public static void main(String[] args) {
    
    int l = 1, t = 1, c = l + 1;
    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");
    
    do {
       do {
        System.out.print("\t" + l + "-" + c);
        c++;
      } while(c <=10);

      System.out.println();

      do {
        System.out.print("\t");
        t++;
      } while(t <= l);
      
      t = 1;
      l++;
      c = l + 1;

    } while(l <=9) ;

  }
}
