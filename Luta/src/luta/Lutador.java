/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

/**
 *
 * @author jhon_
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,  int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+ this.getIdade() + " e pesando "+ this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
        
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

//Getters

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2 || this.peso > 120.2) {
            this.categoria = "Inv?lido";
        }else if (this.peso<= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.3) {
            this.categoria = "M?dio";
        }else if (this.peso <=120.2) {
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
   
    
    
    
}
