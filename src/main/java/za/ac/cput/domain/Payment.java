package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Payment {
    private Long paymentId;
    private Long orderId;
    private String transactionId;
    private double amount;
    private PaymentMethod method;
    private PaymentStatus status;
    private LocalDateTime paymentDate;
    private String receiptUrl;

    protected Payment() {}

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.orderId = builder.orderId;
        this.transactionId = builder.transactionId;
        this.amount = builder.amount;
        this.method = builder.method;
        this.status = builder.status;
        this.paymentDate = builder.paymentDate;
        this.receiptUrl = builder.receiptUrl;
    }

    // Getters
    public Long getPaymentId() { return paymentId; }
    public Long getOrderId() { return orderId; }
    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public PaymentMethod getMethod() { return method; }
    public PaymentStatus getStatus() { return status; }
    public LocalDateTime getPaymentDate() { return paymentDate; }
    public String getReceiptUrl() { return receiptUrl; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", method=" + method +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private Long paymentId;
        private Long orderId;
        private String transactionId;
        private double amount;
        private PaymentMethod method;
        private PaymentStatus status = PaymentStatus.PENDING;
        private LocalDateTime paymentDate = LocalDateTime.now();
        private String receiptUrl;

        public Builder setPaymentId(Long paymentId) { this.paymentId = paymentId; return this; }
        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setTransactionId(String transactionId) { this.transactionId = transactionId; return this; }
        public Builder setAmount(double amount) { this.amount = amount; return this; }
        public Builder setMethod(PaymentMethod method) { this.method = method; return this; }
        public Builder setStatus(PaymentStatus status) { this.status = status; return this; }
        public Builder setPaymentDate(LocalDateTime paymentDate) { this.paymentDate = paymentDate; return this; }
        public Builder setReceiptUrl(String receiptUrl) { this.receiptUrl = receiptUrl; return this; }

        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            this.orderId = payment.orderId;
            this.transactionId = payment.transactionId;
            this.amount = payment.amount;
            this.method = payment.method;
            this.status = payment.status;
            this.paymentDate = payment.paymentDate;
            this.receiptUrl = payment.receiptUrl;
            return this;
        }
        public Payment build() { return new Payment(this); }
    }
}
