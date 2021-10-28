package ead.poo.u2.abstrata;

public abstract class Figura {
    
    protected String nome;

    public String getNome() {
        return nome;
    }

    // não pode ser implementado aqui
    public abstract float calcularArea();
}
