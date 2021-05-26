
class respostaFor167 {
  public static void main(String[] args) {
    System.out.println("ACIMA DA DIAGONAL PRINCIPAL.");
    
    for(int l = 1; l <=9 ; l++) {
      for(int c = l + 1; c <=10; c++) {
        System.out.print("\t" + l + "-" + c);
     
      }
      System.out.println();

      for ( int t = 1; t <= l; t++) {
        System.out.print("\t");
      }
    }

  }
}