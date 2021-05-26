
class respostaDoWhile168 {
  
  public static void main(String[] args) {
    int l = 1, t = 1;

    System.out.println("DIAGONAL PRINCIPAL");
    do {
      System.out.println(l + "-" + l);

       do {
        System.out.print("\t");
        t++;
      } while(t <= l);
      t = 1;
      l++;
    } while(l <=10);
  }
}
