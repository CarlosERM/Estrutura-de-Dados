public class PosfixaPrefixa {
    public boolean isOperador(char x) {
        switch (x) {
        case '+':
        case '-':
        case '/':
        case '*':
            return true;
        }
        return false;
    }
    public String posfixaParaPrefixa(String posfixa) {
        PilhaString s = new PilhaString();
 
        int tamanho = posfixa.length();
 
        for (int i = 0; i < tamanho; i++) {
            if (isOperador(posfixa.charAt(i))) {
                String op1 = s.pop();
                String op2 = s.pop();
                
                String temp = posfixa.charAt(i) + op2 + op1;
 
                s.push(temp);
            }
             else {
                s.push(posfixa.charAt(i) + "");
            }
        }
        String ans = "";
        while (!s.isEmpty()){
            ans += s.pop();
         }
        return ans;
    }
 
}
