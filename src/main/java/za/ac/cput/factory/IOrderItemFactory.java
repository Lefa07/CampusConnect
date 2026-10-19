package za.ac.cput.factory;

import za.ac.cput.domain.OrderItem;

public interface IOrderItemFactory {
    OrderItem create(Long orderItemId, Long orderId, Long productId, int quantity, double priceAtPurchase);
}
