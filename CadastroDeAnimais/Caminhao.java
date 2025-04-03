package br.com.veiculos;

// Caminhão herda de Veiculo
public class Caminhao extends Veiculo {
	private int capacidadeCarga; // Capacidade de carga em toneladas

	public Caminhao(String marca, int ano, int capacidadeCarga) {
		super(marca, ano);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
	}
}
