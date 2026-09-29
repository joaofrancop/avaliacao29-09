public class NotaFiscalAlemanha implements DocumentoFiscal {
    @Override
    public void emitir(double valorPedido) {
        double imposto = valorPedido * 0.19;
        System.out.println("Documento fiscal VAT invoice - valor EUR "
            + String.format("%.2f", valorPedido) + ", imposto 19%: EUR "
            + String.format("%.2f", imposto));
    }

    @Override
    public String getDescricao() {
        return "VAT invoice (Alemanha) com imposto de 19%";
    }
}
