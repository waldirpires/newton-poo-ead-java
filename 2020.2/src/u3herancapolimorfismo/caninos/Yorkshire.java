package u3herancapolimorfismo.caninos;

public class Yorkshire extends Cao {

    @Override
    void late() {
        System.out.println(this.getClass().getSimpleName() + ": auauau!");
    }

    public static void main(String[] args) {
        var cao = new Cao();
        cao.late();

        var doberman = new Doberman();
        doberman.late();

        System.out.println("\n");
        var yorkshire = new Yorkshire();
        yorkshire.late();
    }
}
