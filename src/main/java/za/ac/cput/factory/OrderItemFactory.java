package za.ac.cput.factory;

import za.ac.cput.domain.OrderItem;

public class OrderItemFactory implements IOrderItemFactory {
    public OrderItem create(Long orderItemId, Long orderId, Long productId, int quantity, double priceAtPurchase) {

        if (orderId == null)
            return null;
        if (productId == null)
            return null;
        if (quantity <= 0)
            return null;
        if (priceAtPurchase < 0)
            return null;

        return new OrderItem.Builder()
                .setOrderItemId(orderItemId)
                .setOrderId(orderId)
                .setProductId(productId)
                .setQuantity(quantity)
                .setPriceAtPurchase(priceAtPurchase)
                .build();
    }
}
