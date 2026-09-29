public class EtiquetaCorreios implements EtiquetaEnvio {
    @Override
    public void gerar(String destinatario, String endereco) {
        System.out.println("Etiqueta Correios - " + destinatario + ", " + endereco);
    }

    @Override
    public String getDescricao() {
        return "Etiqueta de envio dos Correios (Brasil)";
    }
}
