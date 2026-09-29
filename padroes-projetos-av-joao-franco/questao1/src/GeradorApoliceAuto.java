public class GeradorApoliceAuto extends GeradorApolice {
    private String nomeSegurado;
    private double valorVeiculo;

    public GeradorApoliceAuto(String nomeSegurado, double valorVeiculo) {
        this.nomeSegurado = nomeSegurado;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(nomeSegurado, valorVeiculo);
    }
}
