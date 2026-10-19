package za.ac.cput.factory;

import za.ac.cput.domain.*;

import java.time.LocalDateTime;
import java.util.List;

public interface IOrderFactory {
    Order create(Long orderId, Long buyerId, String orderReference, LocalDateTime orderDate,
                 double totalAmount, OrderStatus status, String specialInstructions,
                 LocalDateTime completedDate, List<OrderItem> orderItems,
                 Payment payment, Delivery delivery, Receipt receipt);
}
