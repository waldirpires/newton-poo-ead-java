package br.newton.ead.poo.u1.banco;

public class ContaBancaria {

    String agencia;
    String numero;
    float saldo;
    Correntista correntista;
    
    // construtores
    public ContaBancaria(String agencia, String numero, float saldo, Correntista correntista) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.correntista = correntista;
    }

    // operacoes
    public boolean efetuarSaque(float valor) {
        // verificar saldo
        if (this.saldo < valor) {
            System.out.println("INFO: saldo insuficiente!");
            
            return false;
        }
        
        this.saldo = this.saldo - valor;
        return true;        
    }
    
    public boolean efetuarDeposito(float valor) {
        this.saldo = this.saldo + valor;
        
        return true;
    }
    
    public void exibirSaldo() {
        System.out.println("INFO: saldo em conta: R$ " + this.saldo);
    }
    
    public boolean efetuarPagamento(String descricao, float valor) {
        // verificar saldo
        if (this.saldo < valor) {
            System.out.println("INFO: saldo insuficiente!");
            
            return false;
        }
        
        this.saldo = this.saldo - valor;
        
        System.out.println("INFO: Pagamento de conta [" + descricao + "] realizada com sucesso.\n");
        
        return true;        
    }
    
        // acessores e modificadores
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public Correntista getCorrentista() {
        return correntista;
    }
    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    @Override
    public String toString() {
        return "ContaBancaria [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", correntista="
                + correntista + "]";
    }    
    
}
