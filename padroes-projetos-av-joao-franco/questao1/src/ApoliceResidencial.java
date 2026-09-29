import java.util.Arrays;
import java.util.List;

public class ApoliceResidencial implements Apolice {
    private String nomeSegurado;
    private double valorImovel;

    public ApoliceResidencial(String nomeSegurado, double valorImovel) {
        this.nomeSegurado = nomeSegurado;
        this.valorImovel = valorImovel;
    }

    @Override
    public String getLinhaProduto() {
        return "Residencial";
    }

    @Override
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    @Override
    public double calcularPremioMensal() {
        return (valorImovel * 0.015) / 12.0;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("escritura ou contrato de locação");
    }
}
