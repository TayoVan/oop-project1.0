import java.util.Scanner;

public class PublicUtilities {
    private double payment;
    private String paymentDate;

    public PublicUtilities() {}

    public void input(Scanner sc) {
        System.out.println("~Кумуналка~");
        System.out.print("\n Сума платежу: ");
        payment = sc.nextDouble();
        sc.nextLine();
        System.out.print("\n Дата платежу: ");
        paymentDate = sc.nextLine();
    }

    @Override
    public String toString() {
        return "PublicUtilities{" +
                "payment=" + payment +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }
}