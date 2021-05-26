
class respostaDoWhile163 {
  
  public static void main(String[] args) {
    
    int voltaLagoa = 1;
    int abdominais = 1;
    
    do {

      System.out.println(voltaLagoa + "ª volta na Lagoa.");

       do {
        System.out.println(abdominais + "º abdominal.");
        abdominais++;
      } while (abdominais <= 5);
      
      voltaLagoa++;
      abdominais = 1;
    } while (voltaLagoa <= 3);
  
  }
}
