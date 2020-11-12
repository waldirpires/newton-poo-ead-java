package u4composocaoagregacao.composicao;

public class A {
    private B b;

    public A() {
        this.b = new B();
    }

    public static void main(String[] args) {
        var a = new A();

        System.out.println(a);
    }
}
