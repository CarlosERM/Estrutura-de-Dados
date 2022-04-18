import java.util.Scanner;
import javax.script.ScriptException;

class Main {
    public static void main(String args[]) throws ScriptException {
      Scanner scan = new Scanner(System.in);
      Alocacao converter = new Alocacao();
      Object resposta = new Object();
      Notacao notacao = new Notacao();

      boolean controle = true;

      int opt;

      String expressao = new String("");

      String prefixa = new String("");
      String infixa = new String(""); 
      String posfixa = new String("");

      System.out.println("########## Calculadora ##########\n");

      while(controle){
        System.out.println("\nEscolha o tipo de notação: \n");

        System.out.println("1 - Notação Pré-fixa(O operador precede os operandos[Notação Polonesa])");
        System.out.println("2 - Notação Infixa(O operador está entre os operandos)");
        System.out.println("3 - Notação Pós-fixa(O operador está depois dos operandos[Notação Polonesa Reversa])");
        System.out.println("\n4 - Desligar o programa");

        opt = Integer.parseInt(scan.nextLine());
        // scan.nextLine();
        System.out.print("Digite a expressão(SEM ESPAÇOS): ");
        expressao= scan.nextLine();
        
        if(expressao.contains(" ")) {
          System.out.println("SEM ESPAÇOS!");
          continue;
        }

        switch(opt) {
          case 1:
            prefixa = expressao;
            infixa = notacao.prefixaParaInfixa(prefixa); 
            posfixa = notacao.infixaParaPosfixa(infixa);
            resposta = converter.alocador(infixa);
            System.out.println("-----------------------------------------");
            System.out.println("\nRESPOSTA: " + resposta);
            System.out.println("Notação Prefixa: " + prefixa);
            System.out.println("Notação Infixa: " + infixa);
            System.out.println("Notação Posfixa: " + posfixa );
            System.out.println("-----------------------------------------");
            break;
          case 2:
            prefixa = notacao.infixaParaPrefixa(expressao);
            infixa =  expressao ; 
            posfixa = notacao.infixaParaPosfixa(expressao);
            resposta = converter.alocador(infixa);

            
            System.out.println("-----------------------------------------");
            System.out.println("\nRESPOSTA: " + resposta);
            System.out.println("Notação Prefixa: " + prefixa);
            System.out.println("Notação Infixa: " + infixa);
            System.out.println("Notação Posfixa: " + posfixa );
            System.out.println("-----------------------------------------");

            break;
          case 3:
            infixa =  notacao.posfixaParaInfixa(expressao); 
            prefixa = notacao.infixaParaPrefixa(infixa);
            posfixa = expressao;

            resposta = converter.alocador(infixa);

            System.out.println("-----------------------------------------");
            System.out.println("\nRESPOSTA: " + resposta);
            System.out.println("Notação Prefixa: " + prefixa);
            System.out.println("Notação Infixa: " + infixa);
            System.out.println("Notação Posfixa: " + posfixa );
            System.out.println("-----------------------------------------");

            break;
          case 4:
            System.out.println("Até a próxima.");
            controle = false;
            break;
          
          default:
            System.out.println("OPÇÃO INVÁLIDA"); 
            break;
        }
    }
    scan.close();
  }
}