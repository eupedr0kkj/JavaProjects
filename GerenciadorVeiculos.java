package br.com.veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe responsável por gerenciar os veículos
public class GerenciadorVeiculos {
	private List<Veiculo> listaVeiculos; // Lista para armazenar os veículos
	private Scanner scanner;

	// Construtor da classe
	public GerenciadorVeiculos() {
		this.listaVeiculos = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}

	// Método para cadastrar um carro
	public void cadastrarCarro() {
		System.out.print("Digite a marca do carro: ");
		String marca = scanner.nextLine();
		System.out.print("Digite o ano do carro: ");
		int ano = scanner.nextInt();
		System.out.print("Digite a quantidade de portas: ");
		int portas = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer

		Carro carro = new Carro(marca, ano, portas);
		listaVeiculos.add(carro);
		System.out.println("✅ Carro cadastrado com sucesso!");
	}

	// Método para cadastrar uma moto
	public void cadastrarMoto() {
		System.out.print("Digite a marca da moto: ");
		String marca = scanner.nextLine();
		System.out.print("Digite o ano da moto: ");
		int ano = scanner.nextInt();
		System.out.print("A moto tem partida elétrica? (true/false): ");
		boolean partidaEletrica = scanner.nextBoolean();
		scanner.nextLine(); // Limpa o buffer

		Moto moto = new Moto(marca, ano, partidaEletrica);
		listaVeiculos.add(moto);
		System.out.println("✅ Moto cadastrada com sucesso!");
	}

	// Método para cadastrar um caminhão
	public void cadastrarCaminhao() {
		System.out.print("Digite a marca do caminhão: ");
		String marca = scanner.nextLine();
		System.out.print("Digite o ano do caminhão: ");
		int ano = scanner.nextInt();
		System.out.print("Digite a capacidade de carga (toneladas): ");
		int capacidadeCarga = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer

		Caminhao caminhao = new Caminhao(marca, ano, capacidadeCarga);
		listaVeiculos.add(caminhao);
		System.out.println("✅ Caminhão cadastrado com sucesso!");
	}

	// Método para exibir todos os veículos cadastrados
	public void exibirVeiculos() {
		if (listaVeiculos.isEmpty()) {
			System.out.println("⚠ Nenhum veículo cadastrado!");
		} else {
			System.out.println("\n🚘 LISTA DE VEÍCULOS CADASTRADOS 🚛");
			for (Veiculo v : listaVeiculos) {
				v.exibirInfo();
				System.out.println("--------------------------");
			}
		}
	}

	// Método para localizar um veículo por marca
	public void localizarVeiculo() {
		System.out.print("Digite a marca do veículo que deseja localizar: ");
		String busca = scanner.nextLine();
		boolean encontrado = false;

		System.out.println("\n🔎 RESULTADO DA BUSCA:");
		for (Veiculo v : listaVeiculos) {
			if (v.getMarca().equalsIgnoreCase(busca)) {
				v.exibirInfo();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("⚠ Nenhum veículo encontrado com a marca '" + busca + "'.");
		}
	}
}
