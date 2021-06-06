import java.util.Scanner;

class respostaDoWhile398 {

  // Criar um algoritmo para gerenciar um sistema de reservas de mesas em uma casa
  // de espetáculo. A casa possui 30 mesas de 5 lugares cada. O algoritmo deverá
  // permitir que o
  // usuário escolha código de uma mesa (100 a 129) e forneça a quantidade de
  // lugares desejados. O algoritmo deverá informar se foi possível realizar a
  // reserva e atualizar a reserva. Se não for possível, o algoritmo deverá
  // emitir uma mensagem. O algoritmo deve terminar quando o usuário digitar o
  // código O (zero) para uma mesa ou quando todos os 150 lugares estiverem
  // ocupados.
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] mesa = new int[30];
    int[] qtde = new int[30];

    int lugares, codigo, lugMesa;
    int i = 0, z = 0;
    do {
      mesa[i] = 100 + i;
      qtde[i] = 5;
      i++;
    } while (i < 30);

    lugares = 150;

    System.out.print("Entre com um codigo entre 100-129 ou 0 para desligar o programa: ");
    codigo = scn.nextInt();

    do {
      int a = 0;

      while (codigo != mesa[a] && a < 29) {
        a++;
      }

      if (codigo == mesa[a]) {
        System.out.print("Quantos lugares você quer reservar? ");
        lugMesa = scn.nextInt();

        if (qtde[a] >= lugMesa) {
          qtde[a] -= lugMesa;
          lugares -= lugMesa;
        } else {
          System.out.println("Não há lugares para reservar.");
        }

      } else {
        System.out.println("Código de mesa inválido.");

      }

      System.out.print("Entre com um codigo entre 100-129 ou 0 para desligar o programa: ");
      codigo = scn.nextInt();
    } while (codigo > 0 && lugares != 0);

    if (lugares == 0) {
      System.out.println("Lotação esgotada.");
    } else {

      System.out.println("Lugares Vagos");

      do {

        if (qtde[z] != 0) {
          System.out.println("Mesa: " + mesa[z] + "\t" + "Total de Lugares:" + qtde[z]);
        }

        z++;
      } while (z < 30);
    }

    scn.close();
  }

}
