package za.ac.cput.factory;

import org.apache.commons.collections.Factory;
import za.ac.cput.domain.EmailNotification;

import java.time.LocalDateTime;

public class EmailNotificationFactory implements IEmailNotificationFactory{
    public EmailNotification create(Long emailId, String recipientEmail, String subject, String body,
                                    String attachmentUrl, boolean isSent, LocalDateTime sentDate,
                                    String emailType) {

        if (recipientEmail == null || recipientEmail.isEmpty())
            return null;
        if (!recipientEmail.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$"))
            return null;
        if (subject == null || subject.isEmpty())
            return null;
        if (body == null || body.isEmpty())
            return null;
        if (emailType == null || emailType.isEmpty())
            return null;

        return new EmailNotification.Builder()
                .setEmailId(emailId)
                .setRecipientEmail(recipientEmail)
                .setSubject(subject)
                .setBody(body)
                .setAttachmentUrl(attachmentUrl)
                .setIsSent(isSent)
                .setSentDate(sentDate)
                .setEmailType(emailType)
                .build();
    }
}
