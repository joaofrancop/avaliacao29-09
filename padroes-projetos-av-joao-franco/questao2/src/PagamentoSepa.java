public class PagamentoSepa implements Pagamento {
    @Override
    public void processar(double valorPedido) {
        System.out.println("Pagamento SEPA Direct Debit - EUR "
            + String.format("%.2f", valorPedido));
    }

    @Override
    public String getDescricao() {
        return "Pagamento via SEPA Direct Debit (Alemanha)";
    }
}
