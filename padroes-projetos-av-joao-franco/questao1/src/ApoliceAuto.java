import java.util.Arrays;
import java.util.List;

public class ApoliceAuto implements Apolice {
    private String nomeSegurado;
    private double valorVeiculo;

    public ApoliceAuto(String nomeSegurado, double valorVeiculo) {
        this.nomeSegurado = nomeSegurado;
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public String getLinhaProduto() {
        return "Auto";
    }

    @Override
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    @Override
    public double calcularPremioMensal() {
        return (valorVeiculo * 0.08) / 12.0;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("CNH e CRLV");
    }
}
