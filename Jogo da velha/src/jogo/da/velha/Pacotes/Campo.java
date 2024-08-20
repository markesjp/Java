/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.da.velha.Pacotes;

/**
 *
 * @author jhon_
 */
public class Campo {
    private char simbolo;
    
    public Campo(){
        simbolo = ' ';
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo == ' '){
            this.simbolo = simbolo;
        }else{
            System.out.print("Campo utilizado");
        }
         
    }
    
}
