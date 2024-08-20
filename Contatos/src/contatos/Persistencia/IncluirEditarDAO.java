/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos.Persistencia;

import contatos.Contato;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Pedrinho
 */
public class IncluirEditarDAO {

    public int Incluir(Contato objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("INSERT INTO "+
                "contato(nome,idade,sexo,profissao,telefone,email,relacao)"
                + " VALUES (?,?,?,?,?,?,?)")) {
            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setInt(2, objpes.getIdade());
            pstmt.setString(3, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(4, objpes.getProfissao().toUpperCase().trim());
            pstmt.setString(5, objpes.getTelefone().toUpperCase().trim());
            pstmt.setString(6, objpes.getEmail().toLowerCase().trim());
            pstmt.setString(7, objpes.getRelacao().toUpperCase().trim());
            registros = pstmt.executeUpdate();
            

        }
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT MAX(id) from contato");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;
        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }
    }

    public boolean Editar(Contato objpes) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("update contato set nome=?, idade=?,sexo=?, profissao=?, telefone=?,email=?, relacao=? where id=?")) {

            pstmt.setString(1, objpes.getNome().toUpperCase().trim());
            pstmt.setInt(2, objpes.getIdade());
            pstmt.setString(3, objpes.getSexo().toUpperCase().trim());
            pstmt.setString(4, objpes.getProfissao().toUpperCase().trim());
            pstmt.setString(5, objpes.getTelefone().toUpperCase().trim());
            pstmt.setString(6, objpes.getEmail().toLowerCase().trim());
            pstmt.setString(7, objpes.getRelacao().toUpperCase().trim());
            pstmt.setInt(8, objpes.getId());
            registros = pstmt.executeUpdate();
        }
        return registros == 1;
    }
}
