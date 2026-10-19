package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Long cartId;
    private Long studentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private double totalAmount;
    private List<CartItem> items;

    protected Cart() {}

    private Cart(Builder builder) {
        this.cartId = builder.cartId;
        this.studentId = builder.studentId;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.totalAmount = builder.totalAmount;
        this.items = builder.items;
    }

    // Getters
    public Long getCartId() { return cartId; }
    public Long getStudentId() { return studentId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public double getTotalAmount() { return totalAmount; }
    public List<CartItem> getItems() { return items; }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", studentId=" + studentId +
                ", totalAmount=" + totalAmount +
                ", itemsCount=" + items  +
                '}';
    }

    public static class Builder {
        private Long cartId;
        private Long studentId;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private double totalAmount;
        private List<CartItem> items;

        public Builder setCartId(Long cartId) { this.cartId = cartId; return this; }
        public Builder setStudentId(Long studentId) { this.studentId = studentId; return this; }
        public Builder setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; return this; }
        public Builder setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; return this; }
        public Builder setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; return this; }
        public Builder setItems(List<CartItem> items) { this.items = items; return this; }

        public Builder copy(Cart cart){
            this.cartId = cart.cartId;
            this.studentId = cart.studentId;
            this.createdAt = cart.createdAt;
            this.updatedAt = cart.updatedAt;
            this.totalAmount = cart.totalAmount;
            this.items = cart.items;
            return this;
        }
        public Cart build() { return new Cart(this); }
    }
}
