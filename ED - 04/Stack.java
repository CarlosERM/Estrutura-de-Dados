public class Stack {
    private int maximo = 1000;
    private int topo = -1;

    private String[] stack = new String[maximo];

    public boolean push(String valor) {
        if (topo >= (maximo - 1)) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            stack[++topo] = valor;
            System.out.println("O valor " + valor + " foi colocado dentro da Pilha");
            return true;
        }
    }

    public String pop() {
        if ( topo < 0) {
            System.out.println("Stack Underflow.");
            return "0";
        } else {
            String val = stack[topo--];
            return val;
        }
    }

    public String peek() {
        if (topo < 0) {
            System.out.println("Stack Underflow");
            return "0";
        } else {
            String x = stack[topo];
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

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }




}
