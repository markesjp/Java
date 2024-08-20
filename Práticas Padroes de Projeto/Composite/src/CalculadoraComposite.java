public class CalculadoraComposite {
    public static void main(String[] args) {
        // Expressões
        Componente expressaoA = new Operando(0);
        Componente expressaoB = new Soma(new Operando(1), new Operando(2));
        Componente expressaoC = new Multiplicacao(new Operando(1), new Soma(new Operando(2), new Operando(3)));
        Componente expressaoD = new Soma(new Multiplicacao(new Operando(2), new Operando(3)),
                new Divisao(new Operando(4), new Subtracao(new Operando(5), new Operando(3))));

        // Resultados
        System.out.println("Resultado da expressão a): " + expressaoA.calcular());
        System.out.println("Resultado da expressão b): " + expressaoB.calcular());
        System.out.println("Resultado da expressão c): " + expressaoC.calcular());
        System.out.println("Resultado da expressão d): " + expressaoD.calcular());
    }
}