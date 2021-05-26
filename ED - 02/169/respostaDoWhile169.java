
class respostaDoWhile169 {
  
  public static void main(String[] args) {
    int l = 1, c = 1;
   
    do {
      System.out.println();

      do {
        System.out.print(l + "-" + c + "\t");
        c++;
      } while (c < l);
      c = 0;
      l++;
    
    } while( l <=10);
  }
}
