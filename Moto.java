package br.com.veiculos;

// Moto HERDA de Veiculo
public class Moto extends Veiculo {
	private boolean temPartidaEletrica;

	// Construtor que chama o da superclasse com "super"
	public Moto(String marca, int ano, boolean temPartidaEletrica) {
		super(marca, ano);
		this.temPartidaEletrica = temPartidaEletrica;
	}

	// POLIMORFISMO: Sobrescrevendo exibirInfo para incluir partida elétrica
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
	}
}
