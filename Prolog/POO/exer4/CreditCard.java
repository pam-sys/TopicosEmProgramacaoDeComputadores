package exer4;

public class CreditCard implements PaymentMethod {
    private String holderName;
    private String cardNumber;

    public CreditCard(String holderName, String cardNumber) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double value) {
        System.out.println("Pagamento com cartão de crédito de " + holderName + " (" + cardNumber + ") no valor de R$" + value);
    }
}
