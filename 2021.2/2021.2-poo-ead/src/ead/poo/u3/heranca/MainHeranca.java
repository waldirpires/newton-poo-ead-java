package ead.poo.u3.heranca;

public class MainHeranca {
    
    public static void main(String[] args) {
        
        var cardio = new Cardiologista();
        cardio.setCrc("1234");
        // reuso do cpf e crm do medico
        cardio.setCpf("123.456.378-01");
        cardio.setCrm("4321");


        var oftalmo = new Oftalmologista();
        // reuso do cpf e crm do medico
        oftalmo.setCpf("321.432.543-09");
        oftalmo.setCrm("6543");

        oftalmo.setCro("54321");
    }
}
