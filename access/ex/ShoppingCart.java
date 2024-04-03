package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item){
        cart.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (Item item : cart) {
            System.out.println("상품명: " + item.getProductName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    public int calculateTotalPrice(){
        int result = 0;
        for (Item item : cart) {
            result += item.getTotalPrice();
        }
        return result;
    }
}
