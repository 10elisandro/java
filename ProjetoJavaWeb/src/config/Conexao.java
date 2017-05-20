package config;

import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
	
	private static Connection con = null;

	private static Connection getConnection() throws Exception {
		if (con == null) {
			URI dbUri = new URI(System.getenv("DATABASE_URL"));

		    String username = dbUri.getUserInfo().split(":")[0];
		    String password = dbUri.getUserInfo().split(":")[1];
		    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

		    con = DriverManager.getConnection(dbUrl, username, password);
		    
		    criarTabelas();
		}
		
		return con;
	}
	
	public static Statement getStatement() throws Exception {
		Connection con = Conexao.getConnection();
		return con.createStatement();
	}
	
	private static void criarTabelas() throws Exception {
		Statement stmt = getStatement();
        stmt.executeUpdate("DROP TABLE IF EXISTS produtos");
        stmt.executeUpdate("CREATE TABLE produtos(codigo serial, id_categoria integer, nome varchar, descricao varchar)");
	}
}