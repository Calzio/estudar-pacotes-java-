/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.exemplo.cadastro2.conexao;

/**
 *
 * @author aluno.den
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro_pessoas";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados: " + e.getMessage());
        }
    }
}

