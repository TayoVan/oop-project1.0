import java.util.Scanner;

public class PaymentCheck {
    private int id;
    private boolean isPaid;
    private boolean isPaidByCash;
    private String transactionTime;

    public PaymentCheck() {}

    public void input(Scanner sc) {
        System.out.println("~Оплата пірківкі~");
        System.out.print("\n ID оплати: ");
        id = sc.nextInt();
        System.out.print("\n Оплачено (true/false): ");
        isPaid = sc.nextBoolean();
        System.out.print("\n Оплачено готівкою (true/false): ");
        isPaidByCash = sc.nextBoolean();
        sc.nextLine();
        System.out.print("\n Час транзакції: ");
        transactionTime = sc.nextLine();
    }

    @Override
    public String toString() {
        return "PaymentCheck{" +
                "id=" + id +
                ", isPaid=" + isPaid +
                ", isPaidByCash=" + isPaidByCash +
                ", transactionTime='" + transactionTime + '\'' +
                '}';
    }
}