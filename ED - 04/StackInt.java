public class StackInt {
    private int maximo = 1000;
    private int topo = -1;

    private int[] stack = new int[maximo];

    public boolean push(int valor) {
        if (topo >= (maximo - 1)) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            stack[++topo] = valor;
            System.out.println("O valor " + valor + " foi colocado dentro da Pilha");
            return true;
        }
    }

    public int pop() {
        if ( topo < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int val = stack[topo--];
            System.out.println(val + " saiu da Pilha.");
            return val;
        }
    }

    public int peek() {
        if (topo < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[topo];
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

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

}
