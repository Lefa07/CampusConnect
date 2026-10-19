package za.ac.cput.domain;

public class CartItem {
    private Long cartItemId;
    private Long cartId;
    private Long productId;
    private int quantity;
    private double priceAtAdd;

    protected CartItem() {}

    private CartItem(Builder builder) {
        this.cartItemId = builder.cartItemId;
        this.cartId = builder.cartId;
        this.productId = builder.productId;
        this.quantity = builder.quantity;
        this.priceAtAdd = builder.priceAtAdd;
    }

    // Getters
    public Long getCartItemId() { return cartItemId; }
    public Long getCartId() { return cartId; }
    public Long getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPriceAtAdd() { return priceAtAdd; }



    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }

    public static class Builder {
        private Long cartItemId;
        private Long cartId;
        private Long productId;
        private int quantity;
        private double priceAtAdd;

        public Builder setCartItemId(Long cartItemId) { this.cartItemId = cartItemId; return this; }
        public Builder setCartId(Long cartId) { this.cartId = cartId; return this; }
        public Builder setProductId(Long productId) { this.productId = productId; return this; }
        public Builder setQuantity(int quantity) { this.quantity = quantity; return this; }
        public Builder setPriceAtAdd(double priceAtAdd) { this.priceAtAdd = priceAtAdd; return this; }

        public Builder copy(CartItem cartItem){
            this.cartItemId = cartItem.cartItemId;
            this.cartId = cartItem.cartId;
            this.productId = cartItem.productId;
            this.quantity = cartItem.quantity;
            this.priceAtAdd = cartItem.priceAtAdd;
            return this;
        }

        public CartItem build() { return new CartItem(this); }
    }
}
