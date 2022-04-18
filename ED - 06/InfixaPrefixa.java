public class InfixaPrefixa {
  // JAVA program to convert infix to prefix
  //para descobrir se é letra ou não
  InfixaPosfixa infixaParaPosfixa = new InfixaPosfixa();

  public boolean isLetra(char c) {
    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
      return true;
    }
    return false;
  }
  
  //para descobrir se é dígito ou não
  public boolean isDigito(char c) {
    if (c >= '0' && c <= '9')
    {
      return true;
    }
    return false;
  }
 //saber se é um operador.
  public boolean isOperador(char c) {
    return (!isLetra(c) && !isDigito(c));
  }
 
  public int precedencia(char C) {
    if (C == '-' || C == '+')
      return 1;
    else if (C == '*' || C == '/')
      return 2;
    else if (C == '^')
      return 3;

    return 0;
  }
 
  // Reverte todas as letras da expressãp
  public String reverter(char exp[], int inicio, int fim) {
    // variável temporária para armazenar p caracteres.
    char temp;
    while (inicio < fim){
      // troca a ultima letra com a primeira letra e assim por diante.
      temp = exp[inicio];
      exp[inicio] = exp[fim];
      exp[fim] = temp;
      inicio++;
      fim--;
    }
    return String.valueOf(exp);
  }

  public String infixaParaPrefixa(char[] expressao) {
    /*
         * Reverse String Replace ( with ) and vice versa Get Postfix Reverse Postfix *
         */
    int l = expressao.length;
 
    // inverter a expressao
    String expressao1= reverter(expressao, 0, l - 1);
    expressao = expressao1.toCharArray();
 
    // Replace ( with ) and vice versa
    for (int i = 0; i < l; i++) {
      if (expressao[i] == '(') {
        expressao[i] = ')';
        i++;
      }
      else if (expressao[i] == ')') {
        expressao[i] = '(';
        i++;
      }
    }

    String prefixa = infixaParaPosfixa.infixaParaPosfixa(String.valueOf(expressao));
 
    // Reverse postfix
    l = prefixa.length();
    prefixa = reverter(prefixa.toCharArray(), 0, l-1);
 
    return prefixa;
  }
 
 
}
