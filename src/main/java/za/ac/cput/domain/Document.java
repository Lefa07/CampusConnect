package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Document {
    private Long documentId;
    private Long studentId;
    private DocumentType type;
    private String fileUrl;
    private String fileName;
    private Long fileSize;
    private LocalDateTime uploadDate;
    private ApprovalStatus approvalStatus;
    private Long verifiedBy;
    private LocalDateTime verificationDate;
    private LocalDateTime expiryDate;

    protected Document() {}

    private Document(Builder builder) {
        this.documentId = builder.documentId;
        this.studentId = builder.studentId;
        this.type = builder.type;
        this.fileUrl = builder.fileUrl;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.uploadDate = builder.uploadDate;
        this.approvalStatus = builder.approvalStatus;
        this.verifiedBy = builder.verifiedBy;
        this.verificationDate = builder.verificationDate;
        this.expiryDate = builder.expiryDate;
    }

    // Getters
    public Long getDocumentId() { return documentId; }
    public Long getStudentId() { return studentId; }
    public DocumentType getType() { return type; }
    public String getFileUrl() { return fileUrl; }
    public String getFileName() { return fileName; }
    public Long getFileSize() { return fileSize; }
    public LocalDateTime getUploadDate() { return uploadDate; }
    public ApprovalStatus getApprovalStatus() { return approvalStatus; }
    public Long getVerifiedBy() { return verifiedBy; }
    public LocalDateTime getVerificationDate() { return verificationDate; }
    public LocalDateTime getExpiryDate() { return expiryDate; }



    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", type=" + type +
                ", fileName='" + fileName + '\'' +
                ", approvalStatus=" + approvalStatus +
                '}';
    }

    public static class Builder {
        private Long documentId;
        private Long studentId;
        private DocumentType type;
        private String fileUrl;
        private String fileName;
        private Long fileSize;
        private LocalDateTime uploadDate = LocalDateTime.now();
        private ApprovalStatus approvalStatus = ApprovalStatus.PENDING;
        private Long verifiedBy;
        private LocalDateTime verificationDate;
        private LocalDateTime expiryDate;

        public Builder setDocumentId(Long documentId) { this.documentId = documentId; return this; }
        public Builder setStudentId(Long studentId) { this.studentId = studentId; return this; }
        public Builder setType(DocumentType type) { this.type = type; return this; }
        public Builder setFileUrl(String fileUrl) { this.fileUrl = fileUrl; return this; }
        public Builder setFileName(String fileName) { this.fileName = fileName; return this; }
        public Builder setFileSize(Long fileSize) { this.fileSize = fileSize; return this; }
        public Builder setUploadDate(LocalDateTime uploadDate) { this.uploadDate = uploadDate; return this; }
        public Builder setApprovalStatus(ApprovalStatus approvalStatus) { this.approvalStatus = approvalStatus; return this; }
        public Builder setVerifiedBy(Long verifiedBy) { this.verifiedBy = verifiedBy; return this; }
        public Builder setVerificationDate(LocalDateTime verificationDate) { this.verificationDate = verificationDate; return this; }
        public Builder setExpiryDate(LocalDateTime expiryDate) { this.expiryDate = expiryDate; return this; }

        public Builder copy(Document document){
            this.documentId = document.documentId;
            this.studentId = document.studentId;
            this.type = document.type;
            this.fileUrl = document.fileUrl;
            this.fileName = document.fileName;
            this.fileSize = document.fileSize;
            this.uploadDate = document.uploadDate;
            this.approvalStatus = document.approvalStatus;
            this.verifiedBy = document.verifiedBy;
            this.verificationDate = document.verificationDate;
            this.expiryDate = document.expiryDate;
            return this;
        }
        public Document build() { return new Document(this); }
    }
}
