package br.com.petshop;

// Classe base animal
public class Animal {
	private String nome;
	public int idade;

	// Construtor para inicializar o objeto Animal
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	// Métodos para obter os valores dos atributos
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	// Metodos para exibir informações do animal
	public void exibirInfo() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
	}
}