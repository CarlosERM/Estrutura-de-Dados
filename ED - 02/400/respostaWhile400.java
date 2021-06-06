import java.util.Scanner;

class respostaWhile400 {
  // Um hotel
  // fazenda gostaria
  // de fazer
  // um algoritmo
  // que pudesse
  // controlar os
  // se
  // guintes
  // dados dos 50
  // quartos m
  // número de
  // leitos por quarto;
  // preço
  // situação:alugado,
  // livre ou reservado;
  // e aluguel do
  // quarto com
  // data de
  // entrada e
  // de saída
  // e numero
  // de diárias;
  // e despesas dentro do hotel;
  // e valor
  // a ser pago;
  // e impressão
  // de todos
  // os quartos
  // com a
  // situação de
  // cada um;
  // e impressão
  // dos quartos livres.

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] leitos = new int[50];
    int[] nd = new int[50];

    String[] sit = new String[50];
    String[] din = new String[50];
    String[] dOut = new String[50];
    String[] nome = new String[50];
    String[] tel = new String[50];

    float[] precos = new float[50];
    float[] despesas = new float[50];

    int opt, chave = 0, quarto;
    int i = 0;
    int x = 0;
    int v = 0;
    int z = 0;
    int c = 0;

    String respo, resp, resp1 = "", nomeP;
    float total, valor;
    boolean ativa = true;
    while (ativa) {

      System.out.println("\nHotel Fazenda Sucesso");
      System.out.println("l - Cadastro de quartos");
      System.out.println("2 - Listar todos os quartos");
      System.out.println("3 - Listar os quartos ocupados");
      System.out.println("4 - Alugar/Reservar quarto");
      System.out.println("5 - Entrar despesas extras");
      System.out.println("6 - Calcular a despesa do quarto");
      System.out.println("7 - Sair");
      System.out.println();

      System.out.print("Opção: ");
      opt = scn.nextInt();

      switch (opt) {
        case 1:
          if (chave == 1) {
            System.out.println("ATENÇÃO. DADOS JÁ CADASTRADOS.");
          } else {
            while (i < 50) {
              // sit[i] = "L";
              // nd[i] = 0;
              // despesas[i] = 0;
              // din[i] = "XXXX";
              // dOut = "XXXX";
              // nome[i] = "";
              // tel[i] = "";
              // precos[i] = 30;
              // leitos[i] = 5;

              System.out.println("\nQuantidade de leitos do quarto " + (i + 1) + ": ");
              leitos[i] = scn.nextInt();

              System.out.println("Preço do quarto: ");
              precos[i] = scn.nextInt();

              sit[i] = "L";
              nd[i] = 0;
              despesas[i] = 0;
              din[i] = " XXXX";
              dOut[i] = " XXXX";
              nome[i] = "";
              tel[i] = "";
              i++;
            }
            chave = 1;
          }
          break;
        case 2:
          if (chave == 0) {

            System.out.println("Escolha a opção 1.");

          } else {
            while (z < 50) {

              System.out.println("\nNúmero do Quarto: " + (z + 1));
              System.out.println("Situação do Quarto: " + sit[z]);

              if (sit[z] == "A" || sit[z] == "R") {

                System.out.println("\nNome: " + nome[z]);
                System.out.println("Telefone: " + tel[z]);
                System.out.println("Quantidade de Leitos: " + leitos[z]);
                System.out.println("Preço do quarto: " + precos[z]);
                System.out.println("Despesas:  " + despesas[z]);
                System.out.println("Data de Entrada: " + din[z]);
                System.out.println("Data de Saída: " + dOut[z]);
                System.out.println("Número de Dias: " + nd[z]);
                System.out.println("Digite 1 para continuar: ");

                respo = scn.next();
              }
              z++;
            }
            z=0;
          }
          break;
        case 3:
          if (chave == 0) {
            System.out.println("Escolha a opção 1.");
          } else {
            while (x < 50) {
              if (sit[x] == "A") {

                System.out.println("\nNome: " + nome[x]);
                System.out.println("Telefone: " + tel[x]);
                System.out.println("Quantidade de Leitos: " + leitos[x]);
                System.out.println("Preço do quarto: " + precos[x]);
                System.out.println("Despesas:  " + despesas[x]);
                System.out.println("Data de Entrada: " + din[x]);
                System.out.println("Data de Saída: " + dOut[x]);
                System.out.println("Número de Dias: " + nd[x]);
                System.out.println("Digite 1 para continuar vendo os quartos ocupados ou digite 0 para sair: ");

                respo = scn.next();
                if (respo.equals("0"))
                  break;
              }
              x++;
            }
            x=0;

          }
          break;

        case 4:

          if (chave == 0) {
            System.out.println("Escolha  a opção 1.");
          } else {

            System.out.print("Digite A(aluguel) ou R(reserva): ");
            resp = scn.next();

            while (!resp.equals("A") && !resp.equals("a") && !resp.equals("r") && !resp.equals("R")) {
              System.out.println("Resposta Inválida!\nDigite a para aluguel ou r para reserva");
              resp = scn.next();
            }

            if (resp.equals("A") || resp.equals("A")) {

              System.out.println("Tem reserva? (S/N)?");
              resp1 = scn.next();

              if (resp1.equals("S") || resp1.equals("s")) {
                System.out.print("Digite o seu nome: ");
                nomeP = scn.next();

                while (!nomeP.equals(nome[c]) && c < 49)
                  c++;
                if (nomeP.equals(nome[c])) {
                  quarto = c;
                  sit[c] = "A";
                  despesas[c] = 0;

                  System.out.print("Data de Entrada: ");
                  din[quarto] = scn.next();

                  System.out.print("Data de Saída: ");
                  dOut[c] = scn.next();

                  System.out.println("Número de Dias: ");
                  nd[quarto] = scn.nextInt();
                } else {
                  System.out.println("Reserva não encontrada.");
                  resp1 = "N";
                }
              }
              c = 0;

            }

            if (resp1.equals("N") || resp1.equals("n") || resp.equals("r") || resp.equals("R")) {
              while (v < 50) {
                if (sit[v].equals("L")) {
                  System.out.println("\nNúmero do Quarto: " + (v + 1));
                  System.out.println("Quantidade de Leitos: " + leitos[v]);
                  System.out.println("Preço do Quarto: " + precos[v]);
                  System.out.println("Pressione 0 para continuar procurando um quarto ou 1 para selecionar um quarto:");
                  respo = scn.next();

                  if (respo.equals("1")) {
                    break;
                  }
                }
                v++;

              }
              v = 0;

              System.out.print("Digite o numero do quarto para Aluguel ou Reserva: ");
              quarto = scn.nextInt();

              while (quarto < 1 || quarto > 50) {
                System.out.print("Quarto Inválido. Digite novamente: ");
                quarto = scn.nextInt();
              }
              while (sit[quarto - 1].equals("A")) {
                System.out.println("Quarto ocupado. Digite novamente: ");
                quarto = scn.nextInt();

              }

              if (resp.equals("A") || resp.equals("a")) {
                sit[quarto - 1] = "A";
                despesas[quarto - 1] = 0;
              } else {
                sit[quarto - 1] = "R";
              }
              System.out.println("Digite o seu nome: ");
              nome[quarto - 1] = scn.next();

              System.out.println("Digite o seu telefone: ");
              tel[quarto - 1] = scn.next();

              System.out.println("Data de Entrada: ");
              din[quarto - 1] = scn.next();

              System.out.println("Data de Saída: ");
              dOut[quarto - 1] = scn.next();

              System.out.println("Número de Dias: ");
              nd[quarto - 1] = scn.nextInt();

            }

          }
          break;
        case 5:

          if (chave == 0) {
            System.out.println("Escolha a opção 1.");
          }
            else {
          System.out.print("Digite o Número do Quarto: ");
          quarto = scn.nextInt();

          while (quarto < 1 || quarto > 50) {
            System.out.print("Digite o Número do Quarto: ");
            quarto = scn.nextInt();
          }
          System.out.print("Despesas: ");
          valor = scn.nextFloat();

          despesas[quarto - 1] += valor;
        }
          break;
        case 6:
          if (chave == 0) {
            System.out.println("Escolha a opção 1.");
          } else {
            System.out.print("Digite o número do quarto: ");
            quarto = scn.nextInt();

            while (quarto < 1 || quarto > 50) {
              System.out.print("Digite o Número do Quarto: ");
              quarto = scn.nextInt();
            }
            total = despesas[quarto - 1] + precos[quarto - 1];
            System.out.println("Despesas: R$ " + total);
            sit[quarto - 1] = "L";
            despesas[quarto - 1] = 0;
            din[quarto - 1] = "XXXX";
            dOut[quarto - 1] = "XXXX";
            nd[quarto - 1] = 0;
            nome[quarto - 1] = "";
          }

          break;
        case 7:
          System.out.println("Saindo.");
          if (true)
            ativa = false;
          break;
        default:
          System.out.println("Opção inválida.");
          break;
      }
    }
    // scn.close();
  }
}