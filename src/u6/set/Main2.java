package u6.set;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        Set<String> cargos = new HashSet<>();

        cargos.add("Presidente");
        cargos.add("Diretor");
        cargos.add("Gerente");
        cargos.add("Coordenador");
        cargos.add("Técnico");
        cargos.add("Estagiário");
        cargos.add("Diretor"); // duplicado

        System.out.println("\nTamanho: " + cargos.size() + "\n");

        for (String cargo : cargos) {
            System.out.println(cargo);
        }
    }
}
