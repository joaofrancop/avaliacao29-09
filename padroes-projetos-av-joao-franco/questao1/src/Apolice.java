import java.util.List;

public interface Apolice {
    String getLinhaProduto();

    String getNomeSegurado();

    double calcularPremioMensal();

    List<String> getDocumentosExigidos();
}
