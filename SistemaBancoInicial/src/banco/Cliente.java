package banco;

public class Cliente {
    private static int ct = 0;

    static int getCt() {
        return ct;
    }
    private String nome, CPF, telefone;
    private int idade;
    private Conta conta;
    
    public Conta getConta() {
        return conta;
    }
    
    public String mostraDadosConta() {
        String r = "";
        r += conta.getNum()+" ";
        r += nome+" ";
        r += conta.getSaldo();
        return r;
    }
    
    public void cadastraCliente(String n, String cpf, String t, int i, Conta c) {
        nome = n;
        CPF = cpf;
        telefone = t;
        idade = i;
        conta = c;
        ct++;
    }
    
    public boolean estaNegativado() {
        return conta.ehNegativo();
    }

    int getIdade() {
        return idade;
    }
    
}