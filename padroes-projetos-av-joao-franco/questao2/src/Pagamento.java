public interface Pagamento {
    void processar(double valorPedido);

    String getDescricao();
}
