package za.ac.cput.factory;

import za.ac.cput.domain.RefundRequest;
import za.ac.cput.domain.RefundStatus;

import java.time.LocalDateTime;

public interface IRefundRequestFactory {
    RefundRequest create(Long refundId, Long orderId, String reason, double refundAmount,
                         RefundStatus status, LocalDateTime requestDate, LocalDateTime processedDate);
}
