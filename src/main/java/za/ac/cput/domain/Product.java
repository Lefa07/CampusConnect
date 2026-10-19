package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Product {
    private Long productId;
    private Long sellerId;
    private Category category;
    private String title;
    private String description;
    private double price;
    private String condition;
    private List<String> images;
    private ProductStatus status;
    private int viewCount;
    private LocalDateTime dateListed;
    private LocalDateTime dateUpdated;

    protected Product() {}

    private Product(Builder builder) {
        this.productId = builder.productId;
        this.sellerId = builder.sellerId;
        this.category = builder.category;
        this.title = builder.title;
        this.description = builder.description;
        this.price = builder.price;
        this.condition = builder.condition;
        this.images = builder.images;
        this.status = builder.status;
        this.viewCount = builder.viewCount;
        this.dateListed = builder.dateListed;
        this.dateUpdated = builder.dateUpdated;
    }

    // Getters
    public Long getProductId() { return productId; }
    public Long getSellerId() { return sellerId; }
    public Category getCategory() { return category; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getCondition() { return condition; }
    public List<String> getImages() { return images; }
    public ProductStatus getStatus() { return status; }
    public int getViewCount() { return viewCount; }
    public LocalDateTime getDateListed() { return dateListed; }
    public LocalDateTime getDateUpdated() { return dateUpdated; }

    public boolean isAvailable() {
        return status == ProductStatus.AVAILABLE;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private Long productId;
        private Long sellerId;
        private Category category;
        private String title;
        private String description;
        private double price;
        private String condition;
        private List<String> images;
        private ProductStatus status;
        private int viewCount;
        private LocalDateTime dateListed;
        private LocalDateTime dateUpdated;

        public Builder setProductId(Long productId) { this.productId = productId; return this; }
        public Builder setSellerId(Long sellerId) { this.sellerId = sellerId; return this; }
        public Builder setCategory(Category category) { this.category = category; return this; }
        public Builder setTitle(String title) { this.title = title; return this; }
        public Builder setDescription(String description) { this.description = description; return this; }
        public Builder setPrice(double price) { this.price = price; return this; }
        public Builder setCondition(String condition) { this.condition = condition; return this; }
        public Builder setImages(List<String> images) { this.images = images; return this; }
        public Builder setStatus(ProductStatus status) { this.status = status; return this; }
        public Builder setViewCount(int viewCount) { this.viewCount = viewCount; return this; }
        public Builder setDateListed(LocalDateTime dateListed) { this.dateListed = dateListed; return this; }
        public Builder setDateUpdated(LocalDateTime dateUpdated) { this.dateUpdated = dateUpdated; return this; }

        public Builder copy(Product product){
            this.productId = product.productId;
            this.sellerId = product.sellerId;
            this.category = product.category;
            this.title = product.title;
            this.description = product.description;
            this.price = product.price;
            this.condition = product.condition;
            this.images = product.images;
            this.status = product.status;
            this.viewCount = product.viewCount;
            this.dateListed = product.dateListed;
            this.dateUpdated = product.dateUpdated;
            return this;
        }
        public Product build() { return new Product(this); }
    }
}
