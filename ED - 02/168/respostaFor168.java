
class respostaFor168 {
  public static void main(String[] args) {
    
    System.out.println("DIAGONAL PRINCIPAL");

    for(int l = 1; l <=10; l++) {
      System.out.println(l + "-" + l);
      for(int t = 1; t <= l; t++) {
        System.out.print("\t");
      }
    }
    

  }
}