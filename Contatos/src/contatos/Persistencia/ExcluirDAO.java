/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos.Persistencia;

import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Pedrinho
 */
public class ExcluirDAO {

    public boolean Excluir(int cod) throws SQLException {
        Conexao conexao = new Conexao();
        int registros;
        try ( PreparedStatement pstmt = conexao.getConexao().prepareStatement("delete from contato where id=?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }
        return registros == 1;
    }

}
