import java.util.Arrays;
import java.util.List;

public class ApoliceVida implements Apolice {
    private String nomeSegurado;
    private double capitalSegurado;

    public ApoliceVida(String nomeSegurado, double capitalSegurado) {
        this.nomeSegurado = nomeSegurado;
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    public String getLinhaProduto() {
        return "Vida";
    }

    @Override
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    @Override
    public double calcularPremioMensal() {
        return (capitalSegurado * 0.03) / 12.0;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("documento de identidade e CPF");
    }
}
