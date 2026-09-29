public class CheckoutBrasilFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaCorreios();
    }
}
