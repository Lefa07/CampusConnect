package za.ac.cput.factory;

import za.ac.cput.domain.LineItem;

public class LineItemFactory implements ILineItemFactory {
    @Override
    public LineItem create(String description, int quantity, double unitPrice, double total) {
        if (description == null || description.isEmpty())
            return null;
        if (quantity <= 0)
            return null;
        if (unitPrice < 0)
            return null;
        if (total < 0)
            return null;

        return new LineItem.Builder()
                .setDescription(description)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setTotal(total)
                .build();
    }
}
