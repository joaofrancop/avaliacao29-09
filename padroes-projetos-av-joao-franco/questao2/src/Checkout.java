public class Checkout {
    private CheckoutFactory factory;

    public Checkout(CheckoutFactory factory) {
        this.factory = factory;
    }

    public void finalizarPedido(double valor, String destinatario, String endereco) {
        DocumentoFiscal documento = factory.criarDocumentoFiscal();
        Pagamento pagamento = factory.criarPagamento();
        EtiquetaEnvio etiqueta = factory.criarEtiquetaEnvio();

        documento.emitir(valor);
        pagamento.processar(valor);
        etiqueta.gerar(destinatario, endereco);

        imprimirRelatorio(documento, pagamento, etiqueta);
    }

    private void imprimirRelatorio(DocumentoFiscal documento, Pagamento pagamento, EtiquetaEnvio etiqueta) {
        System.out.println("Relatório do pedido");
        System.out.println("1. " + documento.getDescricao());
        System.out.println("2. " + pagamento.getDescricao());
        System.out.println("3. " + etiqueta.getDescricao());
        System.out.println();
    }
}
