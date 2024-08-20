/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo.da.velha;

import java.util.Scanner;
import jogo.da.velha.Pacotes.Campo;

/**
 *
 * @author jhon_
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Campo[][] velha = new Campo [3][3];
        char simbAtual = 'X';
        Boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);
        
        iniciarJogo(velha);
        
        while(game){
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try {
                if(verificarJogada(velha, jogar(scan, simbAtual), simbAtual)){
                    if(simbAtual == 'X'){
                        simbAtual = 'O';
                   
                    }else
                        simbAtual = 'X';
                }
            } catch (Exception e) {
                System.out.println("Erro!!!");
            }
        }
    }
    public static void iniciarJogo(Campo[][] velha) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = new Campo();
                
            }
            
        }
        
    }
    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.println("       0   1   2");
        System.out.printf(" 0     %c | %c | %c \n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
        System.out.println("     -------------");
        System.out.printf(" 1     %c | %c | %c \n", velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("     -------------");
        System.out.printf(" 2     %c | %c | %c \n", velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
        
    }
    
    public static void limparTela() {
        for (int i = 0; i < 200; i++) {
            System.out.println("");
        }
        
    }
    
    public static int[] jogar(Scanner scan, char sa){
        int p[] = new int [2];
        System.out.printf("%s %c%n","Quem Joga", sa);
        System.out.print("%nInforme a linha: ");
        p[0] = scan.nextInt();
        System.out.print("%nInforme a coluna: ");
        p[1] = scan.nextInt();
        return p;
    }
    
    public static Boolean verificarJogada(Campo[][] velha, int p[], char simbAtual){
        if(velha[p[0]][p[1]].getSimbolo()== ' '){
            velha[p[0]][p[1]].setSimbolo(simbAtual);
            return true;
            }else{
            return false;
        }
        
    }
    
    public static String verificaVitoria(Campo[][] velha){
        if(velha[0][0].getSimbolo()=='O' && velha[0][1].getSimbolo()=='O' && velha[0][2].getSimbolo()=='O' ||
           velha[1][0].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[1][2].getSimbolo()=='O' ||
           velha[2][0].getSimbolo()=='O' && velha[2][1].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O' ||
           velha[0][0].getSimbolo()=='O' && velha[1][0].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O' ||
           velha[0][1].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][1].getSimbolo()=='O' ||
           velha[0][2].getSimbolo()=='O' && velha[1][2].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O' ||
           velha[0][0].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O' ||
           velha[0][2].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')
           return "O";
        else
            if(velha[0][0].getSimbolo()=='X' && velha[0][1].getSimbolo()=='X' && velha[0][2].getSimbolo()=='X' ||
               velha[1][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[1][2].getSimbolo()=='X' ||
               velha[2][0].getSimbolo()=='X' && velha[2][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X' ||
               velha[0][0].getSimbolo()=='X' && velha[1][0].getSimbolo()=='X' && velha[2][0].getSimbolo()=='X' ||
               velha[0][1].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][1].getSimbolo()=='X' ||
               velha[0][2].getSimbolo()=='X' && velha[1][2].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X' ||
               velha[0][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X' ||
               velha[0][2].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][0].getSimbolo()=='X')
           return "X";
        else
           return "";
    }
}
