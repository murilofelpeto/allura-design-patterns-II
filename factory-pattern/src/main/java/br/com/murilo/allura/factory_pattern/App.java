package br.com.murilo.allura.factory_pattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.murilo.allura.factory_pattern.factory.ConnectionFactory;

public class App {
	public static void main(String[] args) throws SQLException {
		Connection c = new ConnectionFactory().getConnection();

		PreparedStatement ps = c.prepareStatement("select * from tabela");
		ps.close();
	}
}
