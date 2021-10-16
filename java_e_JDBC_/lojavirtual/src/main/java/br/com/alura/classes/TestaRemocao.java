package br.com.alura.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.modelo.ConnectionFactory;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory factory = new ConnectionFactory();
        Connection Connection = factory.recuperarConexao();

            PreparedStatement stm = Connection.prepareStatement("DELETE FROM PRODUTO WHERE ID >?");
                stm.setInt(1, 2);
                stm.execute();
                
            Integer linhasModificadas = stm.getUpdateCount();

            System.out.println("Quant de linhas que foram modificadas  "  + linhasModificadas);
         


            
    }
}
