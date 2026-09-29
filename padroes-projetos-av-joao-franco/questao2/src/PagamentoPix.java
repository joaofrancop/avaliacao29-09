public class PagamentoPix implements Pagamento {
    @Override
    public void processar(double valorPedido) {
        System.out.println("Pagamento Pix - débito de R$ " + String.format("%.2f", valorPedido));
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Pix (Brasil)";
    }
}
