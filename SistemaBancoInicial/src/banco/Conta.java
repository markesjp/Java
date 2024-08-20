package banco;

public class Conta {

    private static int ct = 0;
    private String tipo;
    private float saldo;
    private int num;
    private String usuario, senha;

    public void cadastraConta(String t, String usr1, String s1, float s) {
        tipo = t;
        usuario = usr1;
        senha = s1;
        if (s >= 500) {
            saldo = s;
        } else {
            saldo = 500;
        }
        num = getCt();
        ct++;
    }

    String mostraSaldo() {
        return "O saldo da conta num " + num + ", do tipo (" + tipo + ") eh " + saldo + " reais.";
    }

    int getNum() {
        return num;
    }

    float getSaldo() {
        return saldo;
    }

    String getSenha() {
        return senha;
    }

    boolean sacar(float valor) {
        if (valor <= (saldo + 100)) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(float valor) {
        saldo += valor;
        return true;
    }

    String getUsuario() {
        return usuario;
    }

    boolean ehNegativo() {
        return (saldo < 0);
    }

    void transferir(float valor, Conta c) {
        if (sacar(valor)) {
            c.depositar(valor);
            System.out.println("Transferencia concluida.");
        } else {
            System.out.println("Erro na operacao. Transferencia cancelada.");
        }
    }

    /**
     * @return the ct
     */
    public static int getCt() {
        return ct;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

}
