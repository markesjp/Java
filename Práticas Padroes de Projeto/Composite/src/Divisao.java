class Divisao implements Componente {
    private Componente esquerda;
    private Componente direita;

    public Divisao(Componente esquerda, Componente direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double calcular() {
        double divisor = direita.calcular();
        if (divisor != 0) {
            return esquerda.calcular() / divisor;
        } else {
            throw new ArithmeticException("Divisão por zero.");
        }
    }
}