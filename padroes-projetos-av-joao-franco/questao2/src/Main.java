public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 2: Checkout Internacional (Abstract Factory)\n");

        Checkout checkoutBrasil = new Checkout(new CheckoutBrasilFactory());
        checkoutBrasil.finalizarPedido(
            899.90,
            "Carla Franco",
            "Rua guararapes 1629 - Curitiba/PR"
        );

        Checkout checkoutAlemanha = new Checkout(new CheckoutAlemanhaFactory());
        checkoutAlemanha.finalizarPedido(
            120.00,
            "João Pinheiro",
            "Keske Alemanha 123 - Alemanha"
        );
    }
}
