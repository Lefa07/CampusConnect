package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Receipt {
    private String receiptNumber;
    private LocalDateTime receiptDate;
    private double amount;
    private String paymentMethod;
    private String transactionId;

    protected Receipt() {}

    private Receipt(Builder builder) {
        this.receiptNumber = builder.receiptNumber;
        this.receiptDate = builder.receiptDate;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.transactionId = builder.transactionId;
    }

    // Getters
    public String getReceiptNumber() { return receiptNumber; }
    public LocalDateTime getReceiptDate() { return receiptDate; }
    public double getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod; }
    public String getTransactionId() { return transactionId; }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptNumber='" + receiptNumber + '\'' +
                ", receiptDate=" + receiptDate +
                ", amount=" + amount +
                '}';
    }

    public static class Builder {
        private String receiptNumber;
        private LocalDateTime receiptDate = LocalDateTime.now();
        private double amount;
        private String paymentMethod;
        private String transactionId;

        public Builder setReceiptNumber(String receiptNumber) { this.receiptNumber = receiptNumber; return this; }
        public Builder setReceiptDate(LocalDateTime receiptDate) { this.receiptDate = receiptDate; return this; }
        public Builder setAmount(double amount) { this.amount = amount; return this; }
        public Builder setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; return this; }
        public Builder setTransactionId(String transactionId) { this.transactionId = transactionId; return this; }

        public Builder copy(Receipt receipt){
            this.receiptNumber = receipt.receiptNumber;
            this.receiptDate = receipt.receiptDate;
            this.amount = receipt.amount;
            this.paymentMethod = receipt.paymentMethod;
            this.transactionId = receipt.transactionId;
            return this;
        }
        public Receipt build() { return new Receipt(this); }
    }
}
