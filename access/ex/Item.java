package access.ex;

public class Item {
    private String productName;
    private int price;
    private int amount;

    public Item(String productName, int price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public String getProductName(){
        return productName;
    }

    public int getPrice(){
        return price;
    }
    public int getAmount(){
        return amount;
    }

    public int getTotalPrice(){
        return price*amount;
    }
}
