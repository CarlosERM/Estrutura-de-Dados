public class StackChar {
    private int maximo = 1000;
    private int topo = -1;

    private char[] stack = new char[maximo];

    public boolean push(char valor) {
        if (topo >= (maximo - 1)) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            stack[++topo] = valor;
            System.out.println("O valor " + valor + " foi colocado dentro da Pilha");
            return true;
        }
    }

    public char pop() {
        if ( topo < 0) {
            System.out.println("Stack Underflow.");
            return '0';
        } else {
            char val = stack[topo--];
            System.out.println(val + " saiu da Pilha.");
            return val;
        }
    }

    public char peek() {
        if (topo < 0) {
            System.out.println("Stack Underflow");
            return '0';
        } else {
            char x = stack[topo];
            return x;
        }
    }

    public boolean isEmpty() {
        if(topo < 0) {
            return true;
        } else {
            return false;
        }
    }




    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public char[] getStack() {
        return stack;
    }

    public void setStack(char[] stack) {
        this.stack = stack;
    }




}
