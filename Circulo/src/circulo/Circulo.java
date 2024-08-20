/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import static circulo.Principal.C;

/**
 *
 * @author jhon_
 */
public class Circulo {

    private double raio;
    private Ponto centro;
    private String nome;
        
    public void setRaio(double r) {
        if (r > 0) {
            raio = r;
        }
    }

    public double getRaio() {
        return raio;
    }

    public void exibeDados(){
        System.out.println("=====================================");
        System.out.print("    Dados do circulo de de raio ");
        System.out.format("%.2f", this.raio);
        System.out.print("\n    Diametro      : ");
        System.out.format("%.2f", diametro());
        System.out.print("\n    Circunferencia: ");
        System.out.format("%.2f", circunferencia());
        System.out.print("\n    Area          : ");
        System.out.format("%.2f", area());
        System.out.println("\n=====================================");
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        if(!nome.equals(""))
            this.nome = nome;
    }
    
    public void iniCirc (Ponto centro, double r){
        C.setCentro(centro);
        C.setRaio(r);
    }
    
    public double diametro(){
        return (double) (this.raio*2);
    }
    
    public double circunferencia(){
        return (double) ((raio*2)*Math.PI);
    }
    
    public double area(){
        return (double) (Math.PI*(Math.pow(this.raio,2)));
    }
    
}

