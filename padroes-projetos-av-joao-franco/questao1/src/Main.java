public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1 - Emissão de Apólices (Factory Method)\n");

        GeradorApolice emissorAuto = new GeradorApoliceAuto("João Pinheiro", 72_000.0);
        emissorAuto.emitir();

        GeradorApolice emissorResidencial = new GeradorApoliceResidencial("Bruna Medeiros", 480_000.0);
        emissorResidencial.emitir();

        GeradorApolice emissorVida = new GeradorApoliceVida("Felipe Franco", 200_000.0);
        emissorVida.emitir();
    }
}
