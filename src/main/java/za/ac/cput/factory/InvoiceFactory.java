package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.domain.LineItem;

import java.time.LocalDateTime;
import java.util.List;

public class InvoiceFactory implements IInvoiceFactory {

    public Invoice create(String invoiceNumber, LocalDateTime issueDate, LocalDateTime dueDate,
                          List<LineItem> items, double tax, double total, String paymentTerms) {

        if (invoiceNumber == null || invoiceNumber.isEmpty())
            return null;
        if (issueDate == null)
            return null;
        if (dueDate == null || dueDate.isBefore(issueDate))
            return null;
        if (items == null || items.isEmpty())
            return null;
        if (tax < 0)
            return null;
        if (total < 0) 
            return null;
        if (paymentTerms == null || paymentTerms.isEmpty())
            return null;

        return new Invoice.Builder()
                .setInvoiceNumber(invoiceNumber)
                .setIssueDate(issueDate)
                .setDueDate(dueDate)
                .setItems(items)
                .setTax(tax)
                .setTotal(total)
                .setPaymentTerms(paymentTerms)
                .build();
    }
}
