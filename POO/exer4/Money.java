package exer4;

public class Money implements PaymentMethod {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento em dinheiro no valor de R$" + value);
    }
}
