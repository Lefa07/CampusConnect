package za.ac.cput.factory;

import za.ac.cput.domain.*;

import java.time.LocalDateTime;
import java.util.List;

public class OrderFactory implements IOrderFactory{
    public Order create(Long orderId, Long buyerId, String orderReference, LocalDateTime orderDate,
                        double totalAmount, OrderStatus status, String specialInstructions,
                        LocalDateTime completedDate, List<OrderItem> orderItems,
                        Payment payment, Delivery delivery, Receipt receipt) {

        if (buyerId == null)
            return null;
        if (orderReference == null || orderReference.isEmpty())
            return null;
        if (orderDate == null)
            return null;
        if (totalAmount < 0)
            return null;
        if (orderItems == null || orderItems.isEmpty())
            return null;

        return new Order.Builder()
                .setOrderId(orderId)
                .setBuyerId(buyerId)
                .setOrderReference(orderReference)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .setSpecialInstructions(specialInstructions)
                .setCompletedDate(completedDate)
                .setOrderItems(orderItems)
                .setPayment(payment)
                .setDelivery(delivery)
                .setReceipt(receipt)
                .build();
    }
}
