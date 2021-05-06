package u1.conta;

import java.util.Scanner;

class Main {

    static void exibirMenu() {
        System.out.println("MENU\n");
        System.out.println("1. Exibir saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Pagar xonta");
        System.out.println("5. Encerrar");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar banco
        Banco b = new Banco("Tupinambás", "3442-2", 2);
        // Criar a conta
        Conta conta = new Conta("José das Couves", 100.0, "3442-2", "12345-6");
        // adicionando a conta ao banco
        b.adicionarConta(conta);

        int op = 0;
        while (op != 5) {
            exibirMenu();
            System.out.println("\nSelecione uma opção:");

            op = sc.nextInt();
            double valor;
            switch (op) {
                case 1:
                    System.out.println("opção selecionada: SALDO\n\n");
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.println("opção selecionada: DEPÓSITO\n\n");
                    System.out.println("\nInforme o valor para depósito: ");
                    valor = sc.nextDouble();

                    conta.depositar(valor);
                    break;
                case 3:
                    System.out.println("opção selecionada: SAQUE\n\n");
                    System.out.println("\nInforme o valor para saque: ");
                    valor = sc.nextDouble();

                    conta.sacar(valor);
                    break;
                case 4:
                    System.out.println("opção selecionada: PAGAMENTO\n\n");
                    System.out.println("\nInforme o valor para pagamento: ");
                    valor = sc.nextDouble();

                    System.out.println("\nInforme o destinatário do pagamento: ");
                    String destino = sc.next();

                    System.out.println("\nInforme a data de vencimento: ");
                    String dataVenc = sc.next();

                    System.out.println("\nInforme a data de pagamento: ");
                    String dataPag = sc.next();

                    conta.pagarConta(valor, destino, dataVenc, dataPag);

                    break;
            }
        }

        // // Exibir o saldo
        // c.exibirSaldo();
        // // Depositar
        // c.depositar(50);
        // c.exibirSaldo();
        // // Sacar
        // c.sacar(30);
        // c.exibirSaldo();

        // // ex1: depósito
        // c.depositar(2000); // max 1000

        // // ex2: saque
        // c.sacar(100);

        // // ex3: pagamento de contas
        // c.pagarConta(20, "Cartão de Crédito", "2020.05.21", "2020.05.21");

        // c.exibirSaldo();

        sc.close();
    }
}