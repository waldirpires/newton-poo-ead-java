package ead.poo.u2.abstrata;

public class Main {
    
    public static void main(String[] args) {
        //var figura = new Figura();

        var figura = new Circulo("teste", 12.3f);

        System.out.println(figura.getNome());

        System.out.println("Área: " + figura.calcularArea());

        System.out.println("Circumferencia: " + figura.calcularPerimetro());
    }
}
