package za.ac.cput.factory;

import za.ac.cput.domain.LineItem;

public interface ILineItemFactory {
    LineItem create(String description, int quantity, double unitPrice, double total);
}
