public class Main {
    public static void main(String[] args) {
        CartaoNatal cartao1 = new MensagemNatal();
        CartaoNatal cartao2 = new EnfeiteCartao(new MensagemNatal());
        CartaoNatal cartao3 = new MensagemPersonalizadaCartao(new MensagemNatal(), "Tenha um ótimo ano novo!");
        CartaoNatal cartao4 = new EnfeiteCartao(new MensagemPersonalizadaCartao(new MensagemNatal(), "Aproveite as festas!"));
        CartaoNatal cartao5 = new MensagemPersonalizadaCartao(new EnfeiteCartao(new MensagemNatal()), "Divirta-se!");

        imprimirCartao(cartao1);
        imprimirCartao(cartao2);
        imprimirCartao(cartao3);
        imprimirCartao(cartao4);
        imprimirCartao(cartao5);
    }

    private static void imprimirCartao(CartaoNatal cartao) {
        System.out.println("Cartão de Natal: " + cartao.getMensagem());
    }
}
