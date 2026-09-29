public interface CheckoutFactory {
    DocumentoFiscal criarDocumentoFiscal();

    Pagamento criarPagamento();

    EtiquetaEnvio criarEtiquetaEnvio();
}
