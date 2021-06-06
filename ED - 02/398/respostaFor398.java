import java.util.Scanner;

class respostaFor398 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] cod = new int[50];
    int[] quant = new int[50];

    float[] preco = new float[50];

    int codi, codigo, quantidade, total =0, auxQtde, auxCodigo;
    float auxPreco, totalPreco = 0;
    System.out.print("Digite o código do produto ou 0 para encerrar o cadastro: ");
    codi = scn.nextInt();

    for (int k = 0; k < 50 && codi > 0; k++) {
      cod[k] = codi;

      System.out.print("Digite a quantidade do produto: ");
      quant[k] = scn.nextInt();

      System.out.print("Digite o preço do produto: ");
      preco[k] = scn.nextFloat();

      System.out.print("Digite o código do produto ou 0 para encerrar o cadastro: ");
      codi = scn.nextInt();

    }
    
    System.out.println("SISTEMA DE VENDA");
    codigo = 1;
    for (int z = 0; z <= cod.length && codigo > 0; z++) {
    System.out.println("Qual o código do produto que você deseja comprar?(DIGITE 0 PARA ENCERRAR)");
    codigo = scn.nextInt();

    if(codigo == 0) break;

    if (codigo == cod[z]) {
      System.out.println("Qual a quantidade do produto que você deseja comprar?");
      quantidade = scn.nextInt();
      if (quantidade <= quant[z]) {
        quant[z] -= quantidade;
        total += quantidade;
        totalPreco += quantidade *preco[z];
      } else {
        System.out.println("Estoque insuficiente");
      }

    } else {
      System.out.println("Produto Não-Cadastrado");
    }

    }


    // INVERSAO 
    for (int a = 0; a < cod.length; a++) {
      for (int b = 0; b < cod.length; b++) {
        if ( quant[a] < quant[b] ) {
  

          auxQtde = quant[a];
          quant[a] = quant[b];
          quant[b] = auxQtde;

          auxPreco = preco[a];
          preco[a] = preco[b];
          preco[b] = auxPreco;


          auxCodigo = cod[a];
          cod[a] = cod[b];
          cod[b] = auxCodigo;
        }
      }
    }

    // PRINTAR

    for ( int g = 0; g < cod.length; g++) {
      System.out.println("Código: " + cod[g] + "\t" + "Preço: " +preco[g]+ "\t" + "Quantidade: " + quant[g]);
    }
    System.out.println();
    System.out.print("TOTAL VENDIDO: R$ " + totalPreco);
    System.out.println("\tTOTAL DE QUANTIDADE: " + total);


  
    scn.close();
  }
}