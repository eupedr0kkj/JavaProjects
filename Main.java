package br.com.veiculos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();
		int opcao;

		// Loop do menu
		do {
			System.out.println("\n==============================");
			System.out.println("🚗 MENU DE GERENCIAMENTO DE VEÍCULOS 🚙");
			System.out.println("==============================");
			System.out.println("1️⃣ Cadastrar Carro");
			System.out.println("2️⃣ Cadastrar Moto");
			System.out.println("3️⃣ Cadastrar Caminhão");
			System.out.println("4️⃣ Exibir Todos os Veículos");
			System.out.println("5️⃣ Localizar Veículo por Marca");
			System.out.println("0️⃣ Sair");
			System.out.print("➡ Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer

			switch (opcao) {
			case 1:
				gerenciador.cadastrarCarro(); // Chama o método da nova classe
				break;
			case 2:
				gerenciador.cadastrarMoto(); // Chama o método da nova classe
				break;
			case 3:
				gerenciador.cadastrarCaminhao(); // Chama o método da nova classe
				break;
			case 4:
				gerenciador.exibirVeiculos(); // Chama o método da nova classe
				break;
			case 5:
				gerenciador.localizarVeiculo(); // Chama o método da nova classe
				break;
			case 0:
				System.out.println("🔴 Saindo do sistema... Até logo!");
				break;
			default:
				System.out.println("⚠ Opção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}
}
