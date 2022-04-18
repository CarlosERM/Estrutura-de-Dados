import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        InfixaPosfixa infixaParaPosfixa = new InfixaPosfixa();
        InfixaPrefixa infixaParaPrefixa = new InfixaPrefixa();
        
        PrefixaPosfixa prefixaPosfixa = new PrefixaPosfixa();
        PrefixaInfixa prefixaParaInfixa = new PrefixaInfixa();

        PosfixaPrefixa posfixaParaPrefixa = new PosfixaPrefixa();
        PosfixaInfixa posfixaParaInfixa = new PosfixaInfixa();
     
        Conversor converter = new Conversor();
        Scanner scan = new Scanner(System.in);
     
        int opcao;
        String expressao;
        String prefixa, infixa, posfixa;

        while(true) {
            System.out.println("\n-------------------------------------------");
            System.out.println("                CALCULADORA                ");
            System.out.println("-------------------------------------------");
            System.out.println("Diga-me, quer realizar que tipo de notação?");
            System.out.println();
            System.out.println("1 - Prefixa");
            System.out.println("2 - Infixa");
            System.out.println("3 - Posfixa");
            System.out.println("4 - Desligar");
            System.out.println("-------------------------------------------");
            
            System.out.print("Opção: ");
            opcao = Integer.valueOf(scan.nextLine());

            if(opcao == 1) {
                System.out.println("\n-------------------------------------------");
                System.out.println("                 PREFIXA                   ");
                System.out.println("-------------------------------------------");

                System.out.print("Escreva a expressão matemática prefixa: ");
                expressao = scan.nextLine();

                infixa = prefixaParaInfixa.prefixaParaInfixa(expressao);
                posfixa = prefixaPosfixa.prefixaParaPosfixa(expressao);

                System.out.println("-------------------------------------------");
                System.out.println("Notação Prefixa: " + expressao);
                System.out.println("Notação Infixa: " + infixa);
                System.out.println("Notação Posfixa: " + posfixa);
                System.out.println("-------------------------------------------");
                System.out.println("Resultado: " + converter.converter(infixa));
                System.out.println("-------------------------------------------");

            } else if(opcao == 2) {
                System.out.println("\n-------------------------------------------");
                System.out.println("                  INFIXA                   ");
                System.out.println("-------------------------------------------");

                System.out.print("Escreva a expressão matemática infixa: ");
                expressao = scan.nextLine();

                prefixa = infixaParaPrefixa.infixaParaPrefixa(expressao.toCharArray());
                posfixa = infixaParaPosfixa.infixaParaPosfixa(expressao);

                System.out.println("-------------------------------------------");
                System.out.println("Notação Prefixa: " + prefixa);
                System.out.println("Notação Infixa: " + expressao);
                System.out.println("Notação Posfixa: " + posfixa);
                System.out.println("-------------------------------------------");
                System.out.println("Resultado: " + converter.converter(expressao));
                System.out.println("-------------------------------------------");

            } else if(opcao == 3) {
                System.out.println("\n-------------------------------------------");
                System.out.println("                  POSFIXA                  ");
                System.out.println("-------------------------------------------");

                System.out.print("Escreva a expressão matemática posfixa: ");
                expressao = scan.nextLine();

                prefixa = posfixaParaPrefixa.posfixaParaPrefixa(expressao);
                infixa = posfixaParaInfixa.posfixaParaInfixa(expressao);

                System.out.println("-------------------------------------------");
                System.out.println("Notação Prefixa: " + prefixa);
                System.out.println("Notação Infixa: " + infixa);
                System.out.println("Notação Posfixa: " + expressao);
                System.out.println("-------------------------------------------");
                System.out.println("Resultado: " + converter.converter(infixa));
                System.out.println("-------------------------------------------");

            } else if( opcao == 4) {
                System.out.println("\nAté mais.");
                break;
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA.");
            }


        }
    } 
}