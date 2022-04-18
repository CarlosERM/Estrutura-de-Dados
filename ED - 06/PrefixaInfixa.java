public class PrefixaInfixa {
  
    public boolean isOperador(char x) {
        switch(x) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public String prefixaParaInfixa(String expressao) {
        PilhaString pilha = new PilhaString();
        int tamanho = expressao.length();

        for(int i = tamanho - 1; i >= 0; i--) {
            char c = expressao.charAt(i);
            if (isOperador(c)) {

                String op1 = pilha.pop();
                String op2 = pilha.pop();
                
                String temp = "(" + op1 + c + op2 + ")";
                pilha.push(temp);
            } else {
                pilha.push(c + "");
            }
        }
        return pilha.pop();
    }
}
