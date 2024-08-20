public class EnfeiteCartao implements DecoradorCartao {
    private CartaoNatal cartao;

    public EnfeiteCartao(CartaoNatal cartao) {
        this.cartao = cartao;
    }

    @Override
    public String getMensagem() {
        return cartao.getMensagem() + " - Com enfeites festivos!";
    }

    @Override
    public String adicionarMensagem() {
        return "Enfeites festivos adicionados.";
    }
}


