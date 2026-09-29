public class NotaFiscalBrasil implements DocumentoFiscal {
    @Override
    public void emitir(double valorPedido) {
        double icms = valorPedido * 0.18;
        System.out.println("Documento fiscal NF-e - valor R$ "
            + String.format("%.2f", valorPedido) + ", ICMS 18%: R$ "
            + String.format("%.2f", icms));
    }

    @Override
    public String getDescricao() {
        return "NF-e (Brasil) com ICMS de 18%";
    }
}
