package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VerificationLog {
    private Long logId;
    private Long documentId;
    private Long verifiedBy;
    private LocalDateTime verificationDate;
    private ApprovalStatus status;
    private String comments;
    private List<VerificationLog> history;

    protected VerificationLog() {}

    private VerificationLog(Builder builder) {
        this.logId = builder.logId;
        this.documentId = builder.documentId;
        this.verifiedBy = builder.verifiedBy;
        this.verificationDate = builder.verificationDate;
        this.status = builder.status;
        this.comments = builder.comments;
        this.history = builder.history;
    }

    // Getters
    public Long getLogId() { return logId; }
    public Long getDocumentId() { return documentId; }
    public Long getVerifiedBy() { return verifiedBy; }
    public LocalDateTime getVerificationDate() { return verificationDate; }
    public ApprovalStatus getStatus() { return status; }
    public String getComments() { return comments; }
    public List<VerificationLog> getHistory() { return history; }


    @Override
    public String toString() {
        return "VerificationLog{" +
                "logId=" + logId +
                ", documentId=" + documentId +
                ", status=" + status +
                ", verificationDate=" + verificationDate +
                '}';
    }

    public static class Builder {
        private Long logId;
        private Long documentId;
        private Long verifiedBy;
        private LocalDateTime verificationDate = LocalDateTime.now();
        private ApprovalStatus status;
        private String comments;
        private List<VerificationLog> history;

        public Builder setLogId(Long logId) { this.logId = logId; return this; }
        public Builder setDocumentId(Long documentId) { this.documentId = documentId; return this; }
        public Builder setVerifiedBy(Long verifiedBy) { this.verifiedBy = verifiedBy; return this; }
        public Builder setVerificationDate(LocalDateTime verificationDate) { this.verificationDate = verificationDate; return this; }
        public Builder setStatus(ApprovalStatus status) { this.status = status; return this; }
        public Builder setComments(String comments) { this.comments = comments; return this; }
        public Builder setHistory(List<VerificationLog> history) { this.history = history; return this; }

        public Builder copy(VerificationLog verificationLog){
            this.logId = verificationLog.logId;
            this.documentId = verificationLog.documentId;
            this.verifiedBy = verificationLog.verifiedBy;
            this.verificationDate = verificationLog.verificationDate;
            this.status = verificationLog.status;
            this.comments = verificationLog.comments;
            this.history = verificationLog.history;
            return this;
        }
        public VerificationLog build() { return new VerificationLog(this); }
    }
}