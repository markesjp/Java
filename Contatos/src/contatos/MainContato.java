/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contatos;

import contatos.Persistencia.Conexao;
import contatos.Persistencia.ConsultaDAO;
import contatos.Persistencia.ExcluirDAO;
import contatos.Persistencia.IncluirEditarDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedrinho
 */
public class MainContato {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static ConsultaDAO pesquisaCont = new ConsultaDAO();

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Conexao conexao = new Conexao();
        while (true) {
            switch (menu()) {
                case 1 -> {
                    addContato();
                    break;
                }
                case 2 -> {
                    excluirContato();
                    break;
                }
                case 3 -> {
                    listarContato();
                    break;
                }
                case 4 -> {
                    maisVelho(conexao);
                    break;
                }
                case 5 -> {
                    maisNovo(conexao);
                    break;
                }
                case 6 -> {
                    editarCont();
                }
                case 0 -> {
                    conexao.getConexaoClose();
                    System.exit(0);
                }

            }
        }
    }

    static public void maisNovo(Conexao conexao) {
        try {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,idade,sexo,profissao,telefone,email, relacao FROM contato "
                    + "WHERE idade = (select min(idade) from contato)");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                String c0 = rs.getString("id").trim();
                String c1 = rs.getString("nome").trim();
                String c2 = rs.getString("idade").trim();
                String c3 = rs.getString("telefone").trim();
                String c4 = rs.getString("profissao").trim();
                String c5 = rs.getString("sexo").trim();
                String c6 = rs.getString("email");
                String c7 = rs.getString("relacao");
                System.out.printf("ID: %-3s", c0);
                System.out.printf("Nome: %-32s", c1);
                System.out.printf("Idade: %-6s", c2);
                System.out.printf("Telefone: %-20s", c3);
                System.out.printf("Profissao: %-20s", c4);
                System.out.printf("Sexo: %-15s", c5);
                System.out.printf("E-mail: %-30s", c6);
                System.out.printf("Relação: %-15s", c7);
                System.out.println("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Solicitação interrompida: " + e, "Preencher item", 22
            );
        }

    }

    static public void maisVelho(Conexao conexao) throws SQLException {
        try {
            PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                    "SELECT id,nome,idade,sexo,profissao,telefone,email, relacao FROM contato "
                    + "WHERE idade = (select max(idade) from contato)");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                String c0 = rs.getString("id").trim();
                String c1 = rs.getString("nome").trim();
                String c2 = rs.getString("idade").trim();
                String c3 = rs.getString("telefone").trim();
                String c4 = rs.getString("profissao").trim();
                String c5 = rs.getString("sexo").trim();
                String c6 = rs.getString("email");
                String c7 = rs.getString("relacao");
                System.out.printf("ID: %-3s", c0);
                System.out.printf("Nome: %-32s", c1);
                System.out.printf("Idade: %-6s", c2);
                System.out.printf("Telefone: %-20s", c3);
                System.out.printf("Profissao: %-20s", c4);
                System.out.printf("Sexo: %-15s", c5);
                System.out.printf("E-mail: %-30s", c6);
                System.out.printf("Relação: %-15s", c7);
                System.out.println("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Solicitação interrompida: " + e, "Preencher item", 22
            );
        }

    }

    static public int menu() {
        System.out.println("");
        System.out.println("[1] Adicionar contato ");
        System.out.println("[2] Excluir contato ");
        System.out.println("[3] Listar contatos");
        System.out.println("[4] Contato mais velho");
        System.out.println("[5] Contato mais novo");
        System.out.println("[6] Encerrar programa");
        System.out.println("[0] Encerrar programa");
        System.out.print("-> ");
        return sc.nextInt();
    }

    static public void addContato() throws SQLException {

        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Profissao: ");
        String profissao = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Profissional, Amigo, Familia: ");
        String relacao = sc.nextLine();
        Contato obj = new Contato(nome, idade, sexo, profissao, telefone, email, relacao);
        IncluirEditarDAO incCont = new IncluirEditarDAO();
        incCont.Incluir(obj);

    }

    static public void excluirContato() throws SQLException {
        ExcluirDAO excluiCont = new ExcluirDAO();
        System.out.println("Qual dos contatos deseja apagar?");
        int id = sc.nextInt();
        if (pesquisaCont.Verifica(id)) {
            excluiCont.Excluir(id);
            System.out.println("Apagado com sucesso!!!");
        } else {
            System.out.println("ID inexistente para este contato!!!");
        }

    }

    static public void listarContato() throws SQLException {
        try {
            ResultSet rs = ConsultaDAO.carregaTabela();
            while (rs.next()) {

                String c0 = rs.getString("id").trim();
                String c1 = rs.getString("nome").trim();
                String c2 = rs.getString("idade").trim();
                String c3 = rs.getString("telefone").trim();
                String c4 = rs.getString("profissao").trim();
                String c5 = rs.getString("sexo").trim();
                String c6 = rs.getString("email");
                String c7 = rs.getString("relacao");
                System.out.printf("ID: %-3s", c0);
                System.out.printf("Nome: %-32s", c1);
                System.out.printf("Idade: %-6s", c2);
                System.out.printf("Telefone: %-20s", c3);
                System.out.printf("Profissao: %-20s", c4);
                System.out.printf("Sexo: %-15s", c5);
                System.out.printf("E-mail: %-30s", c6);
                System.out.printf("Relação: %-15s", c7);
                System.out.println("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Solicitação interrompida: " + e, "Preencher item", 22
            );
        }
    }

    static public void editarCont() throws SQLException {
        System.out.println("Insira o codigo do contato a ser editado: ");
        System.out.print("->");
        int id = sc.nextInt();
        if (pesquisaCont.Verifica(id)) {
            System.out.println("Insira as novas informações");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.nextLine();
            System.out.print("Profissao: ");
            String profissao = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Profissional, Amigo, Familia: ");
            String relacao = sc.nextLine();
            Contato obj = new Contato(id, nome, idade, sexo, profissao, telefone, email, relacao);
            IncluirEditarDAO incCont = new IncluirEditarDAO();
            incCont.Editar(obj);
            System.out.println("Contato editado com sucesso!!!");
        } else {
            System.out.println("ID inexistente");
        }

    }
}
