package ead.poo.u2.abstrata;

public class Circulo extends Figura implements Desenho {
    
    private float raio;

    public Circulo(String nome, float raio) {
        super.nome = nome;
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return 3.14f * raio * raio; // PI * r * r        
    }

	@Override
	public float calcularPerimetro() {
		return 3.14f * raio * 2;
	}
}
