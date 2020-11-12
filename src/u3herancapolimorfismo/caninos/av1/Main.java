public class Main {

    public static void main(String[] args) {
        ProfessorConcursado prof1 = new ProfessorConcursado(300, "prof1");

        ProfessorSubstituto prof2 = new ProfessorSubstituto(300, "prof2");

        Professor prof3 = (Professor) new ProfessorConcursado(300, "prof3");

        Professor prof4 = (Professor) new ProfessorSubstituto(300, "prof4");
        

        prof1.calculaRemuneracao();

        prof2.calculaRemuneracao();

        prof3.calculaRemuneracao();

        prof4.calculaRemuneracao();

        System.out.println(prof1.getSalario());

        System.out.println(prof2.getSalario());

        System.out.println(prof3.getSalario());

        System.out.println(prof4.getSalario());
    }
}
