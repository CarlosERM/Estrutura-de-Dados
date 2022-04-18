import java.util.Scanner;

// Faça uma fila para atendimento num posto de saúde utilizando a estrutura de DEQUE. cada pessoa possui um ID, sexo, idade, gestante (s/n), lactante(s/n), necessidade especial(s/n). O atendimento do posto deve seguir uma ordem de prioridade, sendo:
// Prioridade    tipo
// 0                    Normal
// 1                    acima de 60 anos
// 2                    Necessidades especiais
// 3                    Gestante / lactante
// A menor prioridade é a 0 e a maior prioridade é a 3, que devem ser atendido primeiramente. O posto atende cerca de 100 pessoas por dia. Sabe-se que as pessoas chegam grupos de 10 para serem atendidos, no grupo é atendido 1 pessoa, no segundo grupo 2 pessoas, no terceiro grupo 3 pessoas, e assim por diante até completar 100 pessoas atendidas. Os dados das pessoas podem ser criados aleatoriamente. Mostrar um fila dos atendimentos realizados naquele dia no posto e as pessoas que não foram atendidas. Para cada grupo de 10 pessoas que chegam no posto de saúde, usar a seguinte proporção:  1 Necessidade Especiais, 1 Gestante, 1 Lactante, 3 acima de 60, 5 Prioridade Normal. Fazer um vídeo de 5 a 10 min. explicando o código e apresentando o programa.

class Main {    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Deque filaNaoAtendida = new Deque();
        Deque filaAtendida = new Deque();

        while(true) {
            System.out.println("------------------------------");
            System.out.println("        POSTO DE SAÚDE        ");
            System.out.println("------------------------------");

            System.out.println("1 - Gerar 100 pessoas");
            System.out.println("2 - Fila dos atendidos no dia.");
            System.out.println("3 - Fila dos não-atendidos no dia.");
            System.out.println("4 - Encerrar");

            int opcao = scan.nextInt();

            if (opcao == 1) {
                for(int x = 0; x < 10; x++) {
                    filaNaoAtendida.gerarDez();
                    filaNaoAtendida.sortList();

                    for(int z = 0; z <= x; z++) {
                        filaAtendida.inserirFim((Pessoa) filaNaoAtendida.removerInicio().elemento);
                        // System.out.print("z: ");
                        // System.out.println(z);
                    }
                    // System.out.print("x: ");
                    // System.out.println(x);
                }
                filaNaoAtendida.sortList();
                filaAtendida.sortList();


            } else if(opcao == 2) {
                System.out.println("----------------------------------");
                System.out.println("        FILA DOS ATENDIDOS        ");
                System.out.println("----------------------------------");

                System.out.println(filaAtendida.imprimir());

            } else if(opcao == 3) {
                System.out.println("--------------------------------------");
                System.out.println("        FILA DOS NÃO-ATENDIDOS        ");
                System.out.println("--------------------------------------");

                System.out.println(filaNaoAtendida.imprimir());

            } else {
                break;
            }
        }
        scan.close();
    }

}