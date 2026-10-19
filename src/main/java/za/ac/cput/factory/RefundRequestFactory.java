package za.ac.cput.factory;

import za.ac.cput.domain.RefundRequest;
import za.ac.cput.domain.RefundStatus;

import java.time.LocalDateTime;

public class RefundRequestFactory implements IRefundRequestFactory {
    public RefundRequest create(Long refundId, Long orderId, String reason, double refundAmount,
                                RefundStatus status, LocalDateTime requestDate, LocalDateTime processedDate) {

        if (orderId == null)
            return null;
        if (reason == null || reason.isEmpty())
            return null;
        if (refundAmount <= 0)
            return null;
        if (requestDate == null)
            return null;

        return new RefundRequest.Builder()
                .setRefundId(refundId)
                .setOrderId(orderId)
                .setReason(reason)
                .setRefundAmount(refundAmount)
                .setStatus(status)
                .setRequestDate(requestDate)
                .setProcessedDate(processedDate)
                .build();
    }
}
