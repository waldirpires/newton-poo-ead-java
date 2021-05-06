package u5.equals;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) { // tipos primitivos
            // lógica;
        }

        Medico m = new Oftalmologista();
        Medico m2 = new Oftalmologista();

        if (m == m2) { // referências - ERRO
            // lógica
            System.out.println("TRUE");
        }

        if (m.equals(m2)) { // referências - OK
            // lógica
            System.out.println("TRUE");
        }

    }
}
