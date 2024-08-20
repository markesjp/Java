/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinapassagem;

import java.util.Scanner;

/**
 *
 * @author jhon_
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        MaquinaDePassagem maquinaDePassagem = new MaquinaDePassagem(2);
        while(1>0){
        System.out.print("Passagem "+maquinaDePassagem.getPreco()+ " R$");
        System.out.println(" insira o valor para emitir a sua");
        System.out.print("-> "); 
        i = sc.nextInt();
        sc.nextLine();
            if (maquinaDePassagem.inserirDinheiro(i)) {
                break;
            }
        }
    }
}
