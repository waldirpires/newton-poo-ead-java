package u3herancapolimorfismo.figura;

public abstract class Figura {
    static final float PI = 3.14158f;

    String nome;

    public Figura(String nome) { // construtor
        this.nome = nome;
    }

    abstract float calcularArea();

    final String getNome() {
        return nome;
    }
}
