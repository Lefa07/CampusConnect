package za.ac.cput.factory;

import za.ac.cput.domain.BookingConfirmation;

import java.time.LocalDateTime;

public interface IBookingConfirmationFactory {
    BookingConfirmation create(String confirmationNumber, String qrCode,
                               LocalDateTime confirmationTime, String termsAndConditions);
}
