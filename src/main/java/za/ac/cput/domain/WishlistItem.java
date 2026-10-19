package za.ac.cput.domain;

import java.time.LocalDateTime;

public class WishlistItem {
    private Long wishlistItemId;
    private Long wishlistId;
    private Long productId;
    private LocalDateTime dateAdded;
    private boolean notifyOnPriceDrop;
    private Double targetPrice;

    protected WishlistItem() {}

    private WishlistItem(Builder builder) {
        this.wishlistItemId = builder.wishlistItemId;
        this.wishlistId = builder.wishlistId;
        this.productId = builder.productId;
        this.dateAdded = builder.dateAdded;
        this.notifyOnPriceDrop = builder.notifyOnPriceDrop;
        this.targetPrice = builder.targetPrice;
    }

    // Getters
    public Long getWishlistItemId() { return wishlistItemId; }
    public Long getWishlistId() { return wishlistId; }
    public Long getProductId() { return productId; }
    public LocalDateTime getDateAdded() { return dateAdded; }
    public boolean isNotifyOnPriceDrop() { return notifyOnPriceDrop; }
    public Double getTargetPrice() { return targetPrice; }

    @Override
    public String toString() {
        return "WishlistItem{" +
                "wishlistItemId=" + wishlistItemId +
                ", productId=" + productId +
                ", notifyOnPriceDrop=" + notifyOnPriceDrop +
                '}';
    }

    public static class Builder {
        private Long wishlistItemId;
        private Long wishlistId;
        private Long productId;
        private LocalDateTime dateAdded = LocalDateTime.now();
        private boolean notifyOnPriceDrop = false;
        private Double targetPrice;

        public Builder setWishlistItemId(Long wishlistItemId) { this.wishlistItemId = wishlistItemId; return this; }
        public Builder setWishlistId(Long wishlistId) { this.wishlistId = wishlistId; return this; }
        public Builder setProductId(Long productId) { this.productId = productId; return this; }
        public Builder setDateAdded(LocalDateTime dateAdded) { this.dateAdded = dateAdded; return this; }
        public Builder setNotifyOnPriceDrop(boolean notifyOnPriceDrop) { this.notifyOnPriceDrop = notifyOnPriceDrop; return this; }
        public Builder setTargetPrice(Double targetPrice) { this.targetPrice = targetPrice; return this; }

        public Builder copy(WishlistItem wishlistItem){
            this.wishlistItemId = wishlistItem.wishlistItemId;
            this.wishlistId = wishlistItem.wishlistId;
            this.productId = wishlistItem.productId;
            this.dateAdded = wishlistItem.dateAdded;
            this.notifyOnPriceDrop = wishlistItem.notifyOnPriceDrop;
            this.targetPrice = wishlistItem.targetPrice;
            return this;
        }
        public WishlistItem build() { return new WishlistItem(this); }
    }
}
