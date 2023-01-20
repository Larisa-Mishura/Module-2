package module2.container;

import module2.model.Item;

import java.util.Comparator;

public class SumInvoiceComparator implements Comparator<Invoice> {
    @Override
    public int compare(Invoice o1, Invoice o2) {
        return Integer.compare(invoiceSum(o1), invoiceSum(o2));
    }

    private int invoiceSum(Invoice<Item> invoice){
        int sum = 0;
        for (Item item : invoice.getProductList()){
            sum += item.getPrice();
        }
        return sum;
    }
}
