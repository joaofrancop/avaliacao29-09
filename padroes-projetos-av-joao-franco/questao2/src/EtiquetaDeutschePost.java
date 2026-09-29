public class EtiquetaDeutschePost implements EtiquetaEnvio {
    @Override
    public void gerar(String destinatario, String endereco) {
        System.out.println("Etiqueta Deutsche Post - " + destinatario + ", " + endereco);
    }

    @Override
    public String getDescricao() {
        return "Etiqueta de envio da Deutsche Post (Alemanha)";
    }
}
