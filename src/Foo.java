public class Foo<P, V> {

    private P i;
    V j;

    public P getI() {
        return i;
    }

    public void setI(P i) {
        this.i = i;
    }

    public void print() {
        System.out.println("" + i + " " + j);
    }

}

