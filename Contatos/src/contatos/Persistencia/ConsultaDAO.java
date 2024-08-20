/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos.Persistencia;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pedrinho
 */
public class ConsultaDAO {

    public static ResultSet carregaTabela(String tipo, String arg) throws SQLException {
        String argumento = tipo + " " + "like'" + arg + "%'";

        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                "SELECT id,nome,idade,sexo,profissao,telefone,email FROM contato where " + argumento + "");

        ResultSet rs = pstmt.executeQuery();

        return rs;
    }

    public static ResultSet carregaTabela() throws SQLException {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                "SELECT id,nome,idade,sexo,profissao,telefone,email,relacao FROM contato ORDER BY id");
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }
    
    public boolean Verifica(int id) throws SQLException {
        Conexao con = new Conexao();

        try ( PreparedStatement pstmt = con.getConexao().prepareStatement("SELECT * FROM CONTATO WHERE ID = ?")) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return rs.isFirst();
        }
    }

}
