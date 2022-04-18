public class PosfixaInfixa {

    public boolean isOperando(char x) {
    return (x >= 'a' && x <= 'z') ||
            (x >= 'A' && x <= 'Z');
    }

    public String posfixaParaInfixa(String expressao) {
        PilhaString s = new PilhaString();
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperando(expressao.charAt(i))) {
                s.push(expressao.charAt(i) + "");
            } else {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push("(" + op2 + expressao.charAt(i) + op1 + ")");
            }
        }
        return s.peek();
    }
}
