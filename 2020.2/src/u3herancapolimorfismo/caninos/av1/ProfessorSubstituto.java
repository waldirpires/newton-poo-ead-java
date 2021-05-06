public class ProfessorSubstituto extends Professor{

    public ProfessorSubstituto(float salario, String nome)

    {

        super(salario, nome);

        this.salario = salario;

    }

    public void calculaRemuneracao()

    {

        super.calculaRemuneracao();

        this.salario += this.salario * 0.1;

    }
}
