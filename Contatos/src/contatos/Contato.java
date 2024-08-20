/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos;

/**
 *
 * @author Pedrinho
 */
public class Contato implements Comparable <Contato>{
    
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private String telefone;
    private String email;
    private String relacao;
    
    
    public Contato(String nome, int idade, String sexo, String profissao, String telefone, String email, String relacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
        this.relacao = relacao;
    }
    public Contato(int id ,String nome, int idade, String sexo, String profissao, String telefone, String email, String relacao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
        this.relacao = relacao;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome
                + "\nIdade: " + idade
                + "\nSexo: " + sexo
                + "\nProfissao: " + profissao
                + "\nTelefone: " + telefone
                + "\nE-mail: " + email
                + "\n");
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getRelacao() {
        return relacao;
    }

    public void setRelacao(String relacao) {
        this.relacao = relacao;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Contato o) {
        if (o.getIdade() < this.idade) {
            return 1;
        }else if (o.getIdade() > this.idade) {
            return -1;
           
        }else{
            return 0;
        }
           
    }
}
