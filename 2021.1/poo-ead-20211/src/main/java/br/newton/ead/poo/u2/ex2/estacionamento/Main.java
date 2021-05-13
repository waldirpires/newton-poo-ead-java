package br.newton.ead.poo.u2.ex2.estacionamento;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
       var e = new Estacionamento("Newton Park", 12.5f, 25);
       
       System.out.println("Taxa de ocupação: " + e.calcularTaxaDeOcupacao());
       
       var placa1 = "GLZ-4678";
       
       e.realizarEntrada(placa1);
       System.out.println("Taxa de ocupação: " + e.calcularTaxaDeOcupacao());
       e.realizarEntrada(placa1);

       System.out.println(e.getAutomoveis());
       e.realizarSaida(placa1, LocalDateTime.now().plusHours(3));
       
       e.realizarSaida(placa1, LocalDateTime.now().plusHours(3));

       System.out.println("Taxa de ocupação: " + e.calcularTaxaDeOcupacao());
    }

}
