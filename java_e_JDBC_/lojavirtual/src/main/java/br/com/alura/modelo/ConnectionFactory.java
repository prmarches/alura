package br.com.alura.modelo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    public DataSource dataSource;
    public ConnectionFactory(){
        ComboPooledDataSource cpdf = new ComboPooledDataSource();
        cpdf.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC");
        cpdf.setUser("root");
        cpdf.setPassword("oluap");


        cpdf.setMaxPoolSize(15);


        this.dataSource = cpdf;
    }

    public Connection recuperarConexao() throws SQLException{
        return this.dataSource.getConnection();
    }
/* 
    public Connection recuperarConexao() throws SQLException{

       return DriverManager
        //.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "oluap");
        .getConnection("jdbc:mysql://192.168.0.82:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "alura", "alura");
        //.getConnection("jdbc:mysql:mysql -u alura -h 192.168.0.82 -P 3306");
        
        //$ mysql -u alura -p \-h 192.168.0.82 -P 3306  */


    
      


}
