/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinapassagem;

/**
 *
 * @author jhon_
 */
public class MaquinaDePassagem {

    private int preco, total, quantidadeInserida;

    public MaquinaDePassagem(int preco) {
        this.setPreco(preco);
        this.total = 0;
        this.quantidadeInserida = 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getQuantidadeInserida() {
        return quantidadeInserida;
    }

    private void setQuantidadeInserida(int insert) {

        this.quantidadeInserida+=insert;

    }

    public boolean inserirDinheiro(int insert) {
        if (insert == 2 || insert == 1) {
            this.setQuantidadeInserida(insert);
            emissaoPassagem();
            System.out.println("Apenas aceitamos notas de 1 ou 2 reais!");
        }
        return emissaoPassagem();
    }

    private boolean emissaoPassagem() {
        if (this.quantidadeInserida >= this.preco) {
            System.out.println("Imprimindo passagem, obrigado(a) pela preferência!");
            return true;
        } else {
            System.out.println("Valor inserido insuficiente, favor complete o valor da passagem! Faltam " + (this.preco - this.quantidadeInserida) + " reais!");
            return false;
        }
    }
}
