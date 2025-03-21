package br.com.petshop;

public class Roedor extends Animal {
	private String racaRoedor;
	
	public Roedor(String nome, int idade, String racaRoedor) {
		super(nome, idade);
		this.racaRoedor = racaRoedor;
	}
	
	public void Guincho() {

		System.out.println(getNome() + "está chiando: Schh Schhh!");
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Tipo de roedor: " + racaRoedor);
	}
}
