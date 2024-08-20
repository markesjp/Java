/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptempo;

/**
 *
 * @author jhon_
 */
public class Tempo {

    private int hora, minuto, segundo;
    
    public Tempo(){
        
    }
    
    public Tempo(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 || hora <= 23) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 59 || minuto >= 0) {
            this.minuto = minuto;
        }

    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 || segundo <= 59) {
            this.segundo = segundo;
        }

    }
    public void mostrarTempo(){
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
    }
    
    public void mostrarTempoAM(){
        if(this.hora>12)
        System.out.println(this.hora-12+":"+this.minuto+":"+this.segundo+" PM");
        else{
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" AM");
        }
        
    }
    
    public void maisMinuto(){
        if(this.minuto == 59){
            if(this.hora==23){
                System.out.println("nao eh possivel add minutos");
            }else{
            this.minuto = 0;
            this.setHora(this.hora+=1);
            }
        }else
        this.setMinuto(this.minuto+=1);
    }
    
    public void menosMinutos(){
        if(this.minuto == 0){
            if(this.hora==0){
                System.out.println("nao eh possivel decrementar minutos");
            }else{
            this.setHora(this.hora-=1);
            this.minuto = 59;
            }
        }else
        this.setMinuto(this.minuto-=1);
    }

}
