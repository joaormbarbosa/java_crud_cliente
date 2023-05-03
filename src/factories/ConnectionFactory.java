package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	/* método para configurar, abrir e retornar uma conexão
	 *com o banco de dados do PostGreSQL (objetivo: fabricar conexôes)
	*/	 
	public static Connection getConnection() throws Exception {
		// configurar o driver (conector) necessário para conecção com o PostgreSQL
			Class.forName("org.postgresql.Driver");

			/*
			 * configurar o endereço de banco de dados, usuário e senha de acesso e abrindo
			 * conexão cpm o banco de dados
			 */
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_aula04", "postgres",
					"coti");

		
	}
	
}
