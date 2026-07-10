package exer4;

public class Main {
    public static void main(String[] args) {
        PaymentMethod cartao = new CreditCard("Ana", "1234-5678-9012-3456");
        PaymentMethod dinheiro = new Money();
        PaymentMethod pix = new Pix("ana@email.com");

        cartao.pay(150.00);
        dinheiro.pay(50.00);
        pix.pay(75.50);
    }
}
