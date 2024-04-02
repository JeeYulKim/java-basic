package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = {
                new ProductOrder("두부",2000,2),
                new ProductOrder("김치", 5000,1),
                new ProductOrder("콜라",1500,2),
        };
        int sum = 0;
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " +p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.total();
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
