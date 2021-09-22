import java.util.ArrayList;

public class GroceryItems {

    private String item;
    private int quantity;

    public GroceryItems(String item) {
        this.item = item;
        this.quantity = 0;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
