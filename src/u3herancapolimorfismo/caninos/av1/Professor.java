public class Professor {

    float salario;

    String nome;

    public Professor() {
    }

    public Professor(float salario, String nome)

    {

        this.salario = salario;

        this.nome = nome;

    }

    public void calculaRemuneracao()

    {

        this.salario += this.salario + 100;

    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
