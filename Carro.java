package br.com.veiculos;

// Carro HERDA de Veiculo
public class Carro extends Veiculo {
	private int portas;

	// Construtor que chama o da superclasse com "super"
	public Carro(String marca, int ano, int portas) {
		super(marca, ano);
		this.portas = portas;
	}

	// POLIMORFISMO: Modificando exibirInfo para adicionar quantidade de portas
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Portas: " + portas);
	}
}
