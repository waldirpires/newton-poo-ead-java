package br.newton.ead.poo.u4.composicao;

import java.util.List;

public class Casa {

    private List<Parede> paredes;

    public Casa(List<Parede> paredes) {
        this.paredes = paredes;
    }

    @Override
    public String toString() {
        return "Casa{" +
            "paredes=" + paredes +
            '}';
    }
}
