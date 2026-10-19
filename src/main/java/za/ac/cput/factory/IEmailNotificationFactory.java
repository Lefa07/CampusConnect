package za.ac.cput.factory;

import za.ac.cput.domain.EmailNotification;

import java.time.LocalDateTime;

public interface IEmailNotificationFactory {
    EmailNotification create(Long emailId, String recipientEmail, String subject, String body,
                             String attachmentUrl, boolean isSent, LocalDateTime sentDate,
                             String emailType);
}
