import java.util.Scanner;

class respostaWhile398 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] cod = new int[50];
    int[] quant = new int[50];

    float[] preco = new float[50];

    int k = 0;
    int z = 0;
    int a = 0;
    int b = 0;
    int g = 0; 

    int codi, codigo, quantidade, total =0, auxQtde, auxCodigo;
    float auxPreco, totalPreco = 0;
    System.out.print("Digite o código do produto ou 0 para encerrar o cadastro: ");
    codi = scn.nextInt();

    do {
      cod[k] = codi;

      System.out.print("Digite a quantidade do produto: ");
      quant[k] = scn.nextInt();

      System.out.print("Digite o preço do produto: ");
      preco[k] = scn.nextFloat();

      System.out.print("Digite o código do produto ou 0 para encerrar o cadastro: ");
      codi = scn.nextInt();
      k++;
    } while ( k < 50 && codi > 0);
    
    System.out.println("SISTEMA DE VENDA");
    codigo = 1;

    do {
     
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
      z++;
    } while ( z <= cod.length && codigo > 0);


    // reordenação 
    do {
     do {
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
        b++;
      } while(b < cod.length);
      b = 0;
      a++;
    } while ( a < cod.length);

    // PRINTAR

    do{
      System.out.println("Código: " + cod[g] + "\t" + "Preço: " +preco[g]+ "\t" + "Quantidade: " + quant[g]);
      g++;
    } while ( g < cod.length);
    System.out.println();
    System.out.print("TOTAL VENDIDO: R$ " + totalPreco);
    System.out.println("\tTOTAL DE QUANTIDADE: " + total);


  
    scn.close();
  }
}