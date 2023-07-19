import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class EnumeracaoComposicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        sc.close();
    }

}
