package principal;

import controllers.ClienteController;

public class Main {

	public static void main(String[] args) {
		
		ClienteController clienteController = new ClienteController();
		clienteController.cadastrarCliente();
		
	}

}
