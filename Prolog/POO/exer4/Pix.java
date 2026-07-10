package exer4;

public class Pix implements PaymentMethod {
    private String key;

    public Pix(String key) {
        this.key = key;
    }

    @Override
    public void pay(double value) {
        System.out.println("Pagamento via Pix com a chave " + key + " no valor de R$" + value);
    }
}
