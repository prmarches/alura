package br.com.alura.classes;

import java.sql.SQLException;

import br.com.alura.modelo.ConnectionFactory;

public class TestaPoolConexaoes  {
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i < 30; i++) {
            connectionFactory.recuperarConexao();

            System.out.println("Conexao de numero: " +i);
            
        }
    }
}
