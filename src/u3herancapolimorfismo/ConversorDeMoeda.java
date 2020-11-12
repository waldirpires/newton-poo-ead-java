package u3herancapolimorfismo;

class ConversorDeMoeda {

    float converterDeDolares(int dolares, float taxa) { // sobrecarga
        return dolares * taxa;
    }

    float converterDeDolares(float dolares, float taxa) { // sobrecarga
        return dolares * taxa;
    }

    public static void main(String[] args) {
        var conversor = new ConversorDeMoeda();

        var dolares = 10;
        var cambio = 5.6f;
        var res = conversor.converterDeDolares(dolares, cambio);
        System.out.println(String.format("\nDe US$%5d para: R$%5.2f (câmbio %.2f)", dolares, res, cambio));
    }
}
