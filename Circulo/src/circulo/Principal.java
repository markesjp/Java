/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author jhon_
 */
public class Principal {

    static Ponto centro = new Ponto();
    static Circulo C = new Circulo();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y, raio;
        
        System.out.print("Informe a coordenada X do centro: ");
        x = sc.nextFloat();
        
        System.out.print("Informe a coordenada Y do centro: ");
        y = sc.nextFloat();
        
        centro.iniPonto(x,y);

        System.out.print("Informe o raio do circulo: ");
        raio = sc.nextFloat();
        
        C.iniCirc(centro, raio);
        C.exibeDados();
    }
    
    
    
    
    
}
