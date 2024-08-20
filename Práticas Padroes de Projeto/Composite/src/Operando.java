class Operando implements Componente {
    private double valor;

    public Operando(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor;
    }
}