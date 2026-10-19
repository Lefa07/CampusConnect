package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private Long wishlistId;
    private Long studentId;
    private LocalDateTime createdAt;
    private String name;
    private List<WishlistItem> items;

    protected Wishlist() {}

    private Wishlist(Builder builder) {
        this.wishlistId = builder.wishlistId;
        this.studentId = builder.studentId;
        this.createdAt = builder.createdAt;
        this.name = builder.name;
        this.items = builder.items != null ? builder.items : new ArrayList<>();
    }

    // Getters
    public Long getWishlistId() { return wishlistId; }
    public Long getStudentId() { return studentId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getName() { return name; }
    public List<WishlistItem> getItems() { return items; }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlistId=" + wishlistId +
                ", name='" + name + '\'' +
                ", itemsCount=" + (items != null ? items.size() : 0) +
                '}';
    }

    public static class Builder {
        private Long wishlistId;
        private Long studentId;
        private LocalDateTime createdAt = LocalDateTime.now();
        private String name;
        private List<WishlistItem> items;

        public Builder setWishlistId(Long wishlistId) { this.wishlistId = wishlistId; return this; }
        public Builder setStudentId(Long studentId) { this.studentId = studentId; return this; }
        public Builder setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; return this; }
        public Builder setName(String name) { this.name = name; return this; }
        public Builder setItems(List<WishlistItem> items) { this.items = items; return this; }

        public Builder copy(Wishlist wishlist){
            this.wishlistId = wishlist.wishlistId;
            this.studentId = wishlist.studentId;
            this.createdAt = wishlist.createdAt;
            this.name = wishlist.name;
            this.items = wishlist.items;
            return this;
        }
        public Wishlist build() { return new Wishlist(this); }
    }
}
