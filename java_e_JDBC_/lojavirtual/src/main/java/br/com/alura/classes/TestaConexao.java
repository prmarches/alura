package br.com.alura.classes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.modelo.ConnectionFactory;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory conecta = new ConnectionFactory();
       Connection con = conecta.recuperarConexao();
        
    System.out.println("Fechando conexao");

    con.close();
    
    }
}
