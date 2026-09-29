public class CheckoutAlemanhaFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalAlemanha();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoSepa();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaDeutschePost();
    }
}
