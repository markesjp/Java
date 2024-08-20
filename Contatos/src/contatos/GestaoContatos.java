/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatos;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;

/**
 *
 * @author Pedrinho
 */
public class GestaoContatos {

    ArrayList<Contato> Familia = new ArrayList();
    ArrayList<Contato> Amigos = new ArrayList();
    ArrayList<Contato> Profissional = new ArrayList();

    public void adicionaContato(Contato contato, int tipo) {

        switch (tipo) {
            case 1 ->
                Familia.add(contato);
            case 2 ->
                Amigos.add(contato);
            case 3 ->
                Profissional.add(contato);
        }
    }

    public void eliminaContato(String nome) {
        for (Contato elemento : Familia) {
            if (elemento.getNome().equals(nome)) {
                Familia.remove(elemento);
            }
        }
        for (Contato elemento : Familia) {
            if (elemento.getNome().equals(nome)) {
                Familia.remove(elemento);
            }
        }
        for (Contato elemento : Familia) {
            if (elemento.getNome().equals(nome)) {
                Familia.remove(elemento);
            }
        }
    }

    public void listaContatos(int tipo) {
        switch (tipo) {
            case 1:
                for (Contato elemento : Familia) {
                    elemento.toString();
                }
            case 2:
                for (Contato elemento : Amigos) {
                    elemento.toString();
                }
            case 3:
                for (Contato elemento : Profissional) {
                    elemento.toString();
                }
        }
    }

    @Override
    public String toString() {
        String all = "Familia\n";

        for (Contato elemento : Familia) {
            all = all + elemento.toString();
        }
        all = all + "Amigo";
        for (Contato elemento : Amigos) {
            all = all + elemento.toString();
        }
        all = all + "Profissional";
        for (Contato elemento : Profissional) {
            all = all + elemento.toString();
        }
        return all;

    }

    public Contato maisVelho(int tipo) {
        switch (tipo) {
            case 1 -> {
                sort(Familia);
                return Familia.get(0);
            }
            case 2 -> {
                sort(Amigos);
                return Amigos.get(0);
            }
            case 3 -> {
                sort(Profissional);
                return Profissional.get(0);
            }
        }
        return null;
    }
    public Contato maisNovo(int tipo) {
        switch (tipo) {
            case 1 -> {
                Collections.sort(Familia, Collections.reverseOrder());
                return Familia.get(0);
            }
            case 2 -> {
                Collections.sort(Amigos, Collections.reverseOrder());
                return Amigos.get(0);
            }
            case 3 -> {
                Collections.sort(Profissional, Collections.reverseOrder());
                return Profissional.get(0);
            }
        }
        return null;
    }
}
