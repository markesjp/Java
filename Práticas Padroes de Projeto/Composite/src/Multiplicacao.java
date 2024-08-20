class Multiplicacao implements Componente {
    private Componente esquerda;
    private Componente direita;

    public Multiplicacao(Componente esquerda, Componente direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double calcular() {
        return esquerda.calcular() * direita.calcular();
    }
}