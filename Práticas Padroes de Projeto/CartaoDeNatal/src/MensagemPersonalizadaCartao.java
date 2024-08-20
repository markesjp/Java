public class MensagemPersonalizadaCartao implements DecoradorCartao {
    private CartaoNatal cartao;
    private String mensagemAdicional;

    public MensagemPersonalizadaCartao(CartaoNatal cartao, String mensagemAdicional) {
        this.cartao = cartao;
        this.mensagemAdicional = mensagemAdicional;
    }

    @Override
    public String getMensagem() {
        return cartao.getMensagem() + " - " + mensagemAdicional;
    }

    @Override
    public String adicionarMensagem() {
        return "Mensagem personalizada adicionada: " + mensagemAdicional;
    }
}