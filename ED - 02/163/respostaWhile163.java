
class respostaWhile163 {
  public static void main(String[] args) {
    int voltaLagoa = 1;
    int abdominais = 1;
    
    while (voltaLagoa <= 3) {

      System.out.println(voltaLagoa + "ª volta na Lagoa.");

      while (abdominais <= 5) {
        System.out.println(abdominais + "º abdominal.");
        abdominais++;
      }
      voltaLagoa++;
      abdominais = 1;
    }

  }
}