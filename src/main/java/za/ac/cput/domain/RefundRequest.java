package za.ac.cput.domain;

import java.time.LocalDateTime;

public class RefundRequest {
    private Long refundId;
    private Long orderId;
    private String reason;
    private double refundAmount;
    private RefundStatus status;
    private LocalDateTime requestDate;
    private LocalDateTime processedDate;

    protected RefundRequest() {}

    private RefundRequest(Builder builder) {
        this.refundId = builder.refundId;
        this.orderId = builder.orderId;
        this.reason = builder.reason;
        this.refundAmount = builder.refundAmount;
        this.status = builder.status;
        this.requestDate = builder.requestDate;
        this.processedDate = builder.processedDate;
    }

    // Getters
    public Long getRefundId() { return refundId; }
    public Long getOrderId() { return orderId; }
    public String getReason() { return reason; }
    public double getRefundAmount() { return refundAmount; }
    public RefundStatus getStatus() { return status; }
    public LocalDateTime getRequestDate() { return requestDate; }
    public LocalDateTime getProcessedDate() { return processedDate; }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "refundId=" + refundId +
                ", orderId=" + orderId +
                ", refundAmount=" + refundAmount +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private Long refundId;
        private Long orderId;
        private String reason;
        private double refundAmount;
        private RefundStatus status = RefundStatus.PENDING;
        private LocalDateTime requestDate = LocalDateTime.now();
        private LocalDateTime processedDate;

        public Builder setRefundId(Long refundId) { this.refundId = refundId; return this; }
        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setReason(String reason) { this.reason = reason; return this; }
        public Builder setRefundAmount(double refundAmount) { this.refundAmount = refundAmount; return this; }
        public Builder setStatus(RefundStatus status) { this.status = status; return this; }
        public Builder setRequestDate(LocalDateTime requestDate) { this.requestDate = requestDate; return this; }
        public Builder setProcessedDate(LocalDateTime processedDate) { this.processedDate = processedDate; return this; }

        public Builder copy(RefundRequest refundRequest){
            this.refundId = refundRequest.refundId;
            this.orderId = refundRequest.orderId;
            this.reason = refundRequest.reason;
            this.refundAmount = refundRequest.refundAmount;
            this.status = refundRequest.status;
            this.requestDate = refundRequest.requestDate;
            this.processedDate = refundRequest.processedDate;
            return this;
        }
        public RefundRequest build() { return new RefundRequest(this); }
    }
}
