package u3herancapolimorfismo.figura;

public class Circulo extends Figura {

    float raio;

    public Circulo(float raio) {
        super("Circulo");
        this.raio = raio;
    }

    float calcularArea() {
        return PI * raio * raio;
    }

    // public String getNome() { // sobrescrita - ERRO
    // return nome;
    // }

    public static void main(String[] args) {
        // Figura f = Figura();
        Figura f = new Circulo(12);

        System.out.println("Area: " + f.calcularArea());
    }
}
