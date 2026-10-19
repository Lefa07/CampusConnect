package za.ac.cput.factory;

import za.ac.cput.domain.BookingConfirmation;

import java.time.LocalDateTime;

public class BookingConfirmationFactory implements IBookingConfirmationFactory {
    public BookingConfirmation create(String confirmationNumber, String qrCode,
                                      LocalDateTime confirmationTime, String termsAndConditions) {

        if (confirmationNumber == null || confirmationNumber.isEmpty())
            return null;
        if (qrCode == null || qrCode.isEmpty())
            return null;
        if (confirmationTime == null)
            return null;

        return new BookingConfirmation.Builder()
                .setConfirmationNumber(confirmationNumber)
                .setQrCode(qrCode)
                .setConfirmationTime(confirmationTime)
                .setTermsAndConditions(termsAndConditions)
                .build();
    }
}
