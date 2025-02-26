package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>();
		int opcao;
		
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Exibir animais");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.print("Nome do cachorro: ");
				String nomeCachorro = scanner.nextLine();
				System.out.print("Idade do cachorro: ");
				int idadeCachorro = scanner.nextInt();
				scanner
			}
			}

	}

}
