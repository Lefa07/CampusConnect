package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Notification {
    private Long notificationId;
    private Long recipientId;
    private NotificationType type;
    private String title;
    private String message;
    private boolean isRead;
    private LocalDateTime createdAt;
    private String actionUrl;

    protected Notification() {}

    private Notification(Builder builder) {
        this.notificationId = builder.notificationId;
        this.recipientId = builder.recipientId;
        this.type = builder.type;
        this.title = builder.title;
        this.message = builder.message;
        this.isRead = builder.isRead;
        this.createdAt = builder.createdAt;
        this.actionUrl = builder.actionUrl;
    }

    // Getters
    public Long getNotificationId() { return notificationId; }
    public Long getRecipientId() { return recipientId; }
    public NotificationType getType() { return type; }
    public String getTitle() { return title; }
    public String getMessage() { return message; }
    public boolean isRead() { return isRead; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getActionUrl() { return actionUrl; }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId=" + notificationId +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", isRead=" + isRead +
                '}';
    }

    public static class Builder {
        private Long notificationId;
        private Long recipientId;
        private NotificationType type;
        private String title;
        private String message;
        private boolean isRead = false;
        private LocalDateTime createdAt = LocalDateTime.now();
        private String actionUrl;

        public Builder setNotificationId(Long notificationId) { this.notificationId = notificationId; return this; }
        public Builder setRecipientId(Long recipientId) { this.recipientId = recipientId; return this; }
        public Builder setType(NotificationType type) { this.type = type; return this; }
        public Builder setTitle(String title) { this.title = title; return this; }
        public Builder setMessage(String message) { this.message = message; return this; }
        public Builder setIsRead(boolean isRead) { this.isRead = isRead; return this; }
        public Builder setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; return this; }
        public Builder setActionUrl(String actionUrl) { this.actionUrl = actionUrl; return this; }

        public Builder copy(Notification notification){
            this.notificationId = notification.notificationId;
            this.recipientId = notification.recipientId;
            this.type = notification.type;
            this.title = notification.title;
            this.message = notification.message;
            this.isRead = notification.isRead;
            this.createdAt = notification.createdAt;
            this.actionUrl = notification.actionUrl;
            return this;
        }
        public Notification build() { return new Notification(this); }
    }
}
