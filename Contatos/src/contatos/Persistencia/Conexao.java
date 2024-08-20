/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos.Persistencia;

import java.util.logging.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Pedrinho
 */
public class Conexao {

    private String url;
    private String usuario;
    private String senha;
    private Connection con;

    public Conexao() {
        url = "jdbc:postgresql://localhost:5432/contato";
        usuario = "postgres";
        senha = "123";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            //System.out.println("Conexao OK!!");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão, verifique as informações da base de dados");
        }
    }

    public Connection getConexao() {
        return con;
    }

    public void getConexaoClose() {
        try {
            con.close();
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }

}
