package za.ac.cput.domain;

import java.time.LocalDateTime;

public class EmailNotification {
    private Long emailId;
    private String recipientEmail;
    private String subject;
    private String body;
    private String attachmentUrl;
    private boolean isSent;
    private LocalDateTime sentDate;
    private String emailType;

    protected EmailNotification() {}

    private EmailNotification(Builder builder) {
        this.emailId = builder.emailId;
        this.recipientEmail = builder.recipientEmail;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachmentUrl = builder.attachmentUrl;
        this.isSent = builder.isSent;
        this.sentDate = builder.sentDate;
        this.emailType = builder.emailType;
    }

    // Getters
    public Long getEmailId() { return emailId; }
    public String getRecipientEmail() { return recipientEmail; }
    public String getSubject() { return subject; }
    public String getBody() { return body; }
    public String getAttachmentUrl() { return attachmentUrl; }
    public boolean isSent() { return isSent; }
    public LocalDateTime getSentDate() { return sentDate; }
    public String getEmailType() { return emailType; }

    @Override
    public String toString() {
        return "EmailNotification{" +
                "emailId=" + emailId +
                ", recipientEmail='" + recipientEmail + '\'' +
                ", subject='" + subject + '\'' +
                ", isSent=" + isSent +
                '}';
    }

    public static class Builder {
        private Long emailId;
        private String recipientEmail;
        private String subject;
        private String body;
        private String attachmentUrl;
        private boolean isSent = false;
        private LocalDateTime sentDate;
        private String emailType;

        public Builder setEmailId(Long emailId) { this.emailId = emailId; return this; }
        public Builder setRecipientEmail(String recipientEmail) { this.recipientEmail = recipientEmail; return this; }
        public Builder setSubject(String subject) { this.subject = subject; return this; }
        public Builder setBody(String body) { this.body = body; return this; }
        public Builder setAttachmentUrl(String attachmentUrl) { this.attachmentUrl = attachmentUrl; return this; }
        public Builder setIsSent(boolean isSent) { this.isSent = isSent; return this; }
        public Builder setSentDate(LocalDateTime sentDate) { this.sentDate = sentDate; return this; }
        public Builder setEmailType(String emailType) { this.emailType = emailType; return this; }

        public Builder copy(EmailNotification emailNotification){
            this.emailId = emailNotification.emailId;
            this.recipientEmail = emailNotification.recipientEmail;
            this.subject = emailNotification.subject;
            this.body = emailNotification.body;
            this.attachmentUrl = emailNotification.attachmentUrl;
            this.isSent = emailNotification.isSent;
            this.sentDate = emailNotification.sentDate;
            this.emailType = emailNotification.emailType;
            return this;
        }
        public EmailNotification build() { return new EmailNotification(this); }
    }
}
