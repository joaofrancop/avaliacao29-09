public class GeradorApoliceVida extends GeradorApolice {
    private String nomeSegurado;
    private double capitalSegurado;

    public GeradorApoliceVida(String nomeSegurado, double capitalSegurado) {
        this.nomeSegurado = nomeSegurado;
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(nomeSegurado, capitalSegurado);
    }
}
