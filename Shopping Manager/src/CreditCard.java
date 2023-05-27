public class CreditCard {
    private final int cardNumber;
    private final int verificationNumber;
    private final String expireDate;

    public CreditCard(int cardNumber, int verificationNumber, String expireDate) {
        this.cardNumber = cardNumber;
        this.verificationNumber = verificationNumber;
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return
                "Card Number: " + cardNumber +
                ", Verification Number: " + verificationNumber +
                ", Expire Date: " + expireDate+'\n';
    }
}
