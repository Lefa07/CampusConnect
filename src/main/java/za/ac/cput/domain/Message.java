package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Message {
    private Long messageId;
    private Long chatRoomId;
    private Long senderId;
    private String content;
    private LocalDateTime timestamp;
    private boolean isRead;
    private boolean isDeleted;

    protected Message() {}

    private Message(Builder builder) {
        this.messageId = builder.messageId;
        this.chatRoomId = builder.chatRoomId;
        this.senderId = builder.senderId;
        this.content = builder.content;
        this.timestamp = builder.timestamp;
        this.isRead = builder.isRead;
        this.isDeleted = builder.isDeleted;
    }

    // Getters
    public Long getMessageId() { return messageId; }
    public Long getChatRoomId() { return chatRoomId; }
    public Long getSenderId() { return senderId; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public boolean isRead() { return isRead; }
    public boolean isDeleted() { return isDeleted; }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", senderId=" + senderId +
                ", content='" + content +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class Builder {
        private Long messageId;
        private Long chatRoomId;
        private Long senderId;
        private String content;
        private LocalDateTime timestamp;
        private boolean isRead;
        private boolean isDeleted;

        public Builder setMessageId(Long messageId) { this.messageId = messageId; return this; }
        public Builder setChatRoomId(Long chatRoomId) { this.chatRoomId = chatRoomId; return this; }
        public Builder setSenderId(Long senderId) { this.senderId = senderId; return this; }
        public Builder setContent(String content) { this.content = content; return this; }
        public Builder setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; return this; }
        public Builder setIsRead(boolean isRead) { this.isRead = isRead; return this; }
        public Builder setIsDeleted(boolean isDeleted) { this.isDeleted = isDeleted; return this; }

        public Builder copy(Message message){
            this.messageId = message.messageId;
            this.chatRoomId = message.chatRoomId;
            this.senderId = message.senderId;
            this.content = message.content;
            this.timestamp = message.timestamp;
            this.isRead = message.isRead;
            this.isDeleted = message.isDeleted;
            return this;
        }
        public Message build() { return new Message(this); }
    }
}