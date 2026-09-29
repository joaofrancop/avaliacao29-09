public abstract class GeradorApolice {

    protected abstract Apolice criarApolice();

    public void emitir() {
        Apolice apolice = criarApolice();
        double premioMensal = apolice.calcularPremioMensal();
        imprimirResumo(apolice, premioMensal);
    }

    private void imprimirResumo(Apolice apolice, double premioMensal) {
        System.out.println("--- Resumo da emissão ---");
        System.out.println("Linha de produto : " + apolice.getLinhaProduto());
        System.out.println("Segurado         : " + apolice.getNomeSegurado());
        System.out.println("Prêmio mensal    : R$ " + String.format("%.2f", premioMensal));
        System.out.println(
            "Documentos exigidos: " + String.join(", ", apolice.getDocumentosExigidos())
        );
        System.out.println();
    }
}
