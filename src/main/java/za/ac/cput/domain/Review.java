package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Review {
    private Long reviewId;
    private Long reviewerId;
    private Long revieweeId;
    private Long productId;
    private int rating;
    private String comment;
    private LocalDateTime date;
    private boolean isFlagged;
    private String response;

    protected Review() {}

    private Review(Builder builder) {
        this.reviewId = builder.reviewId;
        this.reviewerId = builder.reviewerId;
        this.revieweeId = builder.revieweeId;
        this.productId = builder.productId;
        this.rating = builder.rating;
        this.comment = builder.comment;
        this.date = builder.date;
        this.isFlagged = builder.isFlagged;
        this.response = builder.response;
    }

    // Getters
    public Long getReviewId() { return reviewId; }
    public Long getReviewerId() { return reviewerId; }
    public Long getRevieweeId() { return revieweeId; }
    public Long getProductId() { return productId; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public LocalDateTime getDate() { return date; }
    public boolean isFlagged() { return isFlagged; }
    public String getResponse() { return response; }



    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private Long reviewId;
        private Long reviewerId;
        private Long revieweeId;
        private Long productId;
        private int rating;
        private String comment;
        private LocalDateTime date;
        private boolean isFlagged = false;
        private String response;

        public Builder setReviewId(Long reviewId) { this.reviewId = reviewId; return this; }
        public Builder setReviewerId(Long reviewerId) { this.reviewerId = reviewerId; return this; }
        public Builder setRevieweeId(Long revieweeId) { this.revieweeId = revieweeId; return this; }
        public Builder setProductId(Long productId) { this.productId = productId; return this; }
        public Builder setRating(int rating) { this.rating = rating; return this; }
        public Builder setComment(String comment) { this.comment = comment; return this; }
        public Builder setDate(LocalDateTime date) { this.date = date; return this; }
        public Builder setIsFlagged(boolean isFlagged) { this.isFlagged = isFlagged; return this; }
        public Builder setResponse(String response) { this.response = response; return this; }

        public Builder copy(Review review){
            this.reviewId = review.reviewId;
            this.reviewerId = review.reviewerId;
            this.revieweeId = review.revieweeId;
            this.productId = review.productId;
            this.rating = review.rating;
            this.comment = review.comment;
            this.date = review.date;
            this.isFlagged = review.isFlagged;
            this.response = review.response;
            return this;
        }
        public Review build() { return new Review(this); }
    }
}
