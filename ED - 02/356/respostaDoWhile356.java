import java.util.Scanner;

class respostaDoWhile356 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] media = new int[15];

    double[] pr1 = new double[15];
    double[] pr2 = new double[15];

    String[] nomes = new String[15];
    String[] sit = new String[15];

    int t, c = 0, l = 0;

    do {

      System.out.print("Digite o " + (l + 1) + "º nome: ");

      nomes[l] = scn.next();

      // Esse aqui foi feito para o autor para evitar nomes muito grandes.
      if (nomes[l].length() > 30) {
        do {
          System.out.println("Digite nomes com até 30 caracteres.");
          System.out.print("Digite o " + (l + 1) + "º nome: ");
          nomes[l] = scn.next();
        } while (nomes[l].length() > 30);
      }

      // Todos os nomes agora tem 30 caracteres graças a esse laço de repetição.
      t = 30 - nomes[l].length();
      do {
        nomes[l] = nomes[l].concat(" ");
        c++;
      } while (c <= t);

      c = 0;
      System.out.print("Digite a 1ª nota: ");
      pr1[l] = scn.nextDouble();

      System.out.print("Digite a 2ª nota: ");
      pr2[l] = scn.nextDouble();

      media[l] = (int) ((pr1[l] + pr2[l]) / 2);

      if (media[l] >= 5) {
        sit[l] = "AP";
      } else {
        sit[l] = "RP";
      }

      l++;
    } while (l <= 14);

    System.out.println("RELAÇÃO FINAL");
    l = 0; // Tive que resetar essa variável.
    do {
      System.out.println((l + 1) + "- " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
      l++;
    } while (l <= 14);

    scn.close();
  }
}
