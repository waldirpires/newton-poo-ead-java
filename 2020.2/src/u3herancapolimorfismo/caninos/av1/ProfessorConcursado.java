public class ProfessorConcursado extends Professor {

    public ProfessorConcursado(float salario, String nome) {
        super();
        this.salario = salario;

        this.nome = nome;

    }

    public void calculaRemuneracao()

    {

        super.calculaRemuneracao();

        this.salario += this.salario * 0.2;

    }
}
