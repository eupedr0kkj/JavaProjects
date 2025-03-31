package br.com.veiculos;

public class Veiculo {
	private static int contadorId = 1; // ID autoincremental
	private int id;
	private String marca;
	private int ano;

	public Veiculo(String marca, int ano) {
		this.id = contadorId++; // Cada veículo terá um ID único
		this.marca = marca;
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public void exibirInfo() {
		System.out.println("ID: " + id + " | Marca: " + marca + ", Ano: " + ano);
	}
}
