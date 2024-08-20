/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luta;

/**
 *
 * @author jhon_
 */
public class Luta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0]= new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1]= new Lutador("Putscript", "EUA", 31, 1.70, 68.9, 11, 2, 1);
        l[2]= new Lutador("Dead Code", "Inglaterra", 31, 1.82, 68.9, 11, 2, 1);
        l[3]= new Lutador("Gilsinho", "Brasil", 54, 1.64, 63, 82, 2, 7);
        l[4]= new Lutador("NerdArt", "Japao", 31, 1.79, 68.9, 11, 2, 1);
        l[5]= new Lutador("SnapShadow", "Espanha", 31, 1.72, 200, 11, 2, 1);
        
        
        Match UEC01 = new Match ();
        UEC01.marcarLuta(l[0],l[5]);
        UEC01.lutar();
    }
    
}
