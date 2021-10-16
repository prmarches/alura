package br.com.alura.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.alura.modelo.ConnectionFactory;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory factory = new ConnectionFactory();
        Connection Connection = factory.recuperarConexao();

            Statement stm = Connection.createStatement();
            boolean resultado =
                stm.execute("INSERT INTO PRODUTO (nome,descricao) VALUES ('Teclado', 'teclado sem fio')"
                    , Statement.RETURN_GENERATED_KEYS);

                   
            ResultSet rst = stm.getGeneratedKeys();
                while(rst.next()){
                    Integer id = rst.getInt(1);
                    System.out.println("O id criado foi: " + id);

                }




            System.out.println(resultado);
    }
}
