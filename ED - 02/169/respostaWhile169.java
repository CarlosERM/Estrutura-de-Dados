
class respostaWhile169 {
  
  public static void main(String[] args) {
    int l = 1, c = 1;
    while( l <=10) {
      System.out.println();

      while (c < l) {
        System.out.print(l + "-" + c + "\t");
        c++;
      }
      c = 0;
      l++;
    }
  }
}