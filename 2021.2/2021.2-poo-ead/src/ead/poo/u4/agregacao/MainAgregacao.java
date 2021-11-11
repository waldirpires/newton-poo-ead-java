package ead.poo.u4.agregacao;

public class MainAgregacao {
    
    public static void main(String[] args) {
        
        var cliente = new Cliente();
        cliente.setMatricula("00014");
        cliente.setNome("José Pereira");

        var ordem = new Ordem();

        ordem.setCliente(cliente);

        var cliente2 = new Cliente();
        cliente2.setMatricula("00011");
        cliente2.setNome("Maria Borges");

        ordem.setCliente(cliente2);
    }
}
