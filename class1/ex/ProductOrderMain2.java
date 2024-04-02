package class1.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i< orders.length; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기

            orders[i]= new ProductOrder(productName,price,quantity);
        }

        for (ProductOrder p : orders) {
            System.out.println("상품명: " +p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.total();
        }
        System.out.println("총 결제 금액: " + sum);

    }

}
