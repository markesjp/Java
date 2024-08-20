/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apptempo;

import java.util.Scanner;

/**
 *
 * @author jhon_
 */
public class AppTempo {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int hora, minuto, segundo, op = 0;
        // TODO code application logic here

        System.out.println("INforme a o hora: ");
        hora = sc.nextInt();
        System.out.println("INforme a o minuto: ");
        minuto = sc.nextInt();
        System.out.println("INforme a o segundo: ");
        segundo = sc.nextInt();

        Tempo tempo = new Tempo(hora, minuto, segundo);

        while (op != 5) {
            System.out.println("O que deseja fazer? ");
            System.out.println("1|Incrementar minuto");
            System.out.println("2|Decrementar minuto");
            System.out.println("3|Mostrar horario hhmmss");
            System.out.println("4|Mostrar horario hhmmss AM/PM");
            System.out.println("5|Sair");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1 -> {
                    tempo.maisMinuto();
                    tempo.mostrarTempo();
                    break;
                }
                case 2 -> {
                    tempo.menosMinutos();
                    tempo.mostrarTempo();
                    break;
                }
                case 3 -> {
                    tempo.mostrarTempo();
                    break;
                }
                case 4 -> {
                    tempo.mostrarTempoAM();
                    break;
                }
                case 5 ->{
                    System.out.println("Programa encerrando!!!");
                    break;
                }
                default ->{
                    System.out.println("Opcao invalida!!!");
                    break;
                }
            }

        }
    }

}
