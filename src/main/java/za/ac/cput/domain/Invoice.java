package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private LocalDateTime issueDate;
    private LocalDateTime dueDate;
    private List<LineItem> items;
    private double tax;
    private double total;
    private String paymentTerms;

    protected Invoice() {}

    private Invoice(Builder builder) {
        this.invoiceNumber = builder.invoiceNumber;
        this.issueDate = builder.issueDate;
        this.dueDate = builder.dueDate;
        this.items = builder.items;
        this.tax = builder.tax;
        this.total = builder.total;
        this.paymentTerms = builder.paymentTerms;
    }

    // Getters
    public String getInvoiceNumber() { return invoiceNumber; }
    public LocalDateTime getIssueDate() { return issueDate; }
    public LocalDateTime getDueDate() { return dueDate; }
    public List<LineItem> getItems() { return items; }
    public double getTax() { return tax; }
    public double getTotal() { return total; }
    public String getPaymentTerms() { return paymentTerms; }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", total=" + total +
                '}';
    }

    public static class Builder {
        private String invoiceNumber;
        private LocalDateTime issueDate = LocalDateTime.now();
        private LocalDateTime dueDate;
        private List<LineItem> items;
        private double tax;
        private double total;
        private String paymentTerms;

        public Builder setInvoiceNumber(String invoiceNumber) { this.invoiceNumber = invoiceNumber; return this; }
        public Builder setIssueDate(LocalDateTime issueDate) { this.issueDate = issueDate; return this; }
        public Builder setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; return this; }
        public Builder setItems(List<LineItem> items) { this.items = items; return this; }
        public Builder setTax(double tax) { this.tax = tax; return this; }
        public Builder setTotal(double total) { this.total = total; return this; }
        public Builder setPaymentTerms(String paymentTerms) { this.paymentTerms = paymentTerms; return this; }

        public Builder copy(Invoice invoice){
            this.invoiceNumber = invoice.invoiceNumber;
            this.issueDate = invoice.issueDate;
            this.dueDate = invoice.dueDate;
            this.items = invoice.items;
            this.tax = invoice.tax;
            this.total = invoice.total;
            this.paymentTerms = invoice.paymentTerms;
            return this;
        }
        public Invoice build() { return new Invoice(this); }
    }
}
