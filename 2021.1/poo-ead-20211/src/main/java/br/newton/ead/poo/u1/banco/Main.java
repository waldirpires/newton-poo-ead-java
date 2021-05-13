package br.newton.ead.poo.u1.banco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int op = 0;
        float valor = 0.0f;
        
        // instanciar um objeto Correntista na memória
        var c = new Correntista("José Pereira", "123.456.789-01", "22/12/2001");

        System.out.println(c);
        
        var conta = new ContaBancaria("0001", "123456-7", 0.0f, c);
        
        System.out.println("\n\n");
        
        System.out.println(conta);        
        
        while (op != 10) {
            System.out.println("Banco Java: \n");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Realizar pagamento");
            System.out.println("5. Exibir correntista");
            System.out.println("10. Sair");
            
            System.out.println("Selecione uma das operações acima:\n");
            
            op = scanner.nextInt();
            
            switch(op) {
            case 1:
                conta.exibirSaldo();
            break;
            case 2:
                System.out.println("Digite o valor de depósito:");
                valor = scanner.nextFloat();
                
                conta.efetuarDeposito(valor);
            break;
            case 3:
                System.out.println("Digite o valor de saque:");
                valor = scanner.nextFloat();
                
                conta.efetuarSaque(valor);
            break;
            case 4:
                System.out.println("Digite o valor do pagamento:");
                valor = scanner.nextFloat();
                
                System.out.println("Digite a descrição do pagamento:");
                var descricao = scanner.next();
                
                conta.efetuarPagamento(descricao, valor);
            break;
            case 5:
                System.out.println(conta.getCorrentista());
                break;
            case 10:
                System.out.println("INFO: obrigado pela preferência.");
            break;
            default:
                System.out.println("ALERTA: operação inválida!\n\n");                
            }            
        }
        
        scanner.close();
    }

}
