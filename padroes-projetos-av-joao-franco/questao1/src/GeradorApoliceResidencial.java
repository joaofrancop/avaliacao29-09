public class GeradorApoliceResidencial extends GeradorApolice {
    private String nomeSegurado;
    private double valorImovel;

    public GeradorApoliceResidencial(String nomeSegurado, double valorImovel) {
        this.nomeSegurado = nomeSegurado;
        this.valorImovel = valorImovel;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(nomeSegurado, valorImovel);
    }
}
