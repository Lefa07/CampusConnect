package za.ac.cput.factory;

import za.ac.cput.domain.Invoice;
import za.ac.cput.domain.LineItem;
import java.time.LocalDateTime;
import java.util.List;

public interface IInvoiceFactory {
    Invoice create(String invoiceNumber, LocalDateTime issueDate, LocalDateTime dueDate,
                   List<LineItem> items, double tax, double total, String paymentTerms);
}
