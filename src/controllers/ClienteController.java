package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {

	public void cadastrarCliente() {

		System.out.println("\n*** CADASTRO DE FUNCIONÁRIOS ***");
		Scanner scanner = new Scanner(System.in);

		try {

			Cliente cliente = new Cliente();

			System.out.println("Informe o nome:");
			cliente.setNome(scanner.nextLine());

			System.out.println("Informe o email:");
			cliente.setEmail(scanner.nextLine());

			System.out.println("Informe o telefone:");
			cliente.setTelefone(scanner.nextLine());

			System.out.println("Informe o CPF:");
			cliente.setCpf(scanner.nextLine());

			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.create(cliente);

			System.out.println("\nCliente cadastrado com sucesso!😊😊");

		} catch (Exception e) {
			System.out.println("\n Falha ao cadastrar cliente: " + e.getMessage());

		} finally {
			scanner.close();
		}

	}

	public void atualizarCliente() {
		System.out.println("\n *** Atualização de Clientes***\n");
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Informe o ID do Cliente");
			Integer idCliente = Integer.parseInt(scanner.nextLine());

			ClienteRepository clienteRepository = new ClienteRepository();
			Cliente cliente = clienteRepository.findById(idCliente);

			if (cliente != null) {
				
				System.out.println(" Altere o Nome.......");
				cliente.setNome(scanner.nextLine());
				
				System.out.println(" Altere o Email.......");
				cliente.setEmail(scanner.nextLine());
				
				System.out.println(" Altere o Telefone.......");
				cliente.setTelefone(scanner.nextLine());
				
				System.out.println(" Altere o C`F.......");
				cliente.setCpf(scanner.nextLine());
				
				clienteRepository.update(cliente);
				
				System.out.println("\n Cliente atualizado com sucesso");
				
				
			} else {
				System.out.println("\n Cliente não encontrado");
			}
		}

		catch (Exception e) {
			System.out.println("\n Falha ao atualizar o cliente" + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
