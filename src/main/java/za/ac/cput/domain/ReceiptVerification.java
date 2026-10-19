package za.ac.cput.domain;

import java.time.LocalDateTime;

public class ReceiptVerification {
    private Long verificationId;
    private Long orderId;
    private Long studentId;
    private Document productImage;
    private Document studentCardImage;
    private String enteredStudentNumber;
    private String actualStudentNumber;
    private boolean studentNumberMatch;
    private boolean productImageValid;
    private boolean studentCardValid;
    private VerificationStatus status;
    private LocalDateTime verificationDate;
    private String rejectionReason;

    protected ReceiptVerification() {}

    private ReceiptVerification(Builder builder) {
        this.verificationId = builder.verificationId;
        this.orderId = builder.orderId;
        this.studentId = builder.studentId;
        this.productImage = builder.productImage;
        this.studentCardImage = builder.studentCardImage;
        this.enteredStudentNumber = builder.enteredStudentNumber;
        this.actualStudentNumber = builder.actualStudentNumber;
        this.studentNumberMatch = builder.studentNumberMatch;
        this.productImageValid = builder.productImageValid;
        this.studentCardValid = builder.studentCardValid;
        this.status = builder.status;
        this.verificationDate = builder.verificationDate;
        this.rejectionReason = builder.rejectionReason;
    }

    // Getters
    public Long getVerificationId() { return verificationId; }
    public Long getOrderId() { return orderId; }
    public Long getStudentId() { return studentId; }
    public Document getProductImage() { return productImage; }
    public Document getStudentCardImage() { return studentCardImage; }
    public String getEnteredStudentNumber() { return enteredStudentNumber; }
    public String getActualStudentNumber() { return actualStudentNumber; }
    public boolean isStudentNumberMatch() { return studentNumberMatch; }
    public boolean isProductImageValid() { return productImageValid; }
    public boolean isStudentCardValid() { return studentCardValid; }
    public VerificationStatus getStatus() { return status; }
    public LocalDateTime getVerificationDate() { return verificationDate; }
    public String getRejectionReason() { return rejectionReason; }



    @Override
    public String toString() {
        return "ReceiptVerification{" +
                "verificationId=" + verificationId +
                ", status=" + status +
                ", verificationDate=" + verificationDate +
                '}';
    }

    public static class Builder {
        private Long verificationId;
        private Long orderId;
        private Long studentId;
        private Document productImage;
        private Document studentCardImage;
        private String enteredStudentNumber;
        private String actualStudentNumber;
        private boolean studentNumberMatch = false;
        private boolean productImageValid = false;
        private boolean studentCardValid = false;
        private VerificationStatus status = VerificationStatus.PENDING;
        private LocalDateTime verificationDate = LocalDateTime.now();
        private String rejectionReason;

        public Builder setVerificationId(Long verificationId) { this.verificationId = verificationId; return this; }
        public Builder setOrderId(Long orderId) { this.orderId = orderId; return this; }
        public Builder setStudentId(Long studentId) { this.studentId = studentId; return this; }
        public Builder setProductImage(Document productImage) { this.productImage = productImage; return this; }
        public Builder setStudentCardImage(Document studentCardImage) { this.studentCardImage = studentCardImage; return this; }
        public Builder setEnteredStudentNumber(String enteredStudentNumber) { this.enteredStudentNumber = enteredStudentNumber; return this; }
        public Builder setActualStudentNumber(String actualStudentNumber) { this.actualStudentNumber = actualStudentNumber; return this; }
        public Builder setStudentNumberMatch(boolean studentNumberMatch) { this.studentNumberMatch = studentNumberMatch; return this; }
        public Builder setProductImageValid(boolean productImageValid) { this.productImageValid = productImageValid; return this; }
        public Builder setStudentCardValid(boolean studentCardValid) { this.studentCardValid = studentCardValid; return this; }
        public Builder setStatus(VerificationStatus status) { this.status = status; return this; }
        public Builder setVerificationDate(LocalDateTime verificationDate) { this.verificationDate = verificationDate; return this; }
        public Builder setRejectionReason(String rejectionReason) { this.rejectionReason = rejectionReason; return this; }

        public Builder copy(ReceiptVerification receiptVerification){
            this.verificationId = receiptVerification.verificationId;
            this.orderId = receiptVerification.orderId;
            this.studentId = receiptVerification.studentId;
            this.productImage = receiptVerification.productImage;
            this.studentCardImage = receiptVerification.studentCardImage;
            this.enteredStudentNumber = receiptVerification.enteredStudentNumber;
            this.actualStudentNumber = receiptVerification.actualStudentNumber;
            this.studentNumberMatch = receiptVerification.studentNumberMatch;
            this.productImageValid = receiptVerification.productImageValid;
            this.studentCardValid = receiptVerification.studentCardValid;
            this.status = receiptVerification.status;
            this.verificationDate = receiptVerification.verificationDate;
            this.rejectionReason = receiptVerification.rejectionReason;
            return this;
        }
        public ReceiptVerification build() { return new ReceiptVerification(this); }
    }
}
