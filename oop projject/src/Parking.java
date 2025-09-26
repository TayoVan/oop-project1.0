import java.util.Scanner;

public class Parking {
    private boolean isFree;
    private boolean isPaid;
    private Transport parkplaceInfo;

    public Parking() {}

    public void input(Scanner sc) {
        System.out.println("~Місця паркінгу~");
        System.out.print("\n Чи вільне місце (true/false): ");
        isFree = sc.nextBoolean();
        System.out.print("\n Чи оплачене місце (true/false): ");
        isPaid = sc.nextBoolean();
        sc.nextLine();
        System.out.println("\n Введіть дані про транспорт:");
        parkplaceInfo = new Transport();
        parkplaceInfo.input(sc);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "isFree=" + isFree +
                ", isPaid=" + isPaid +
                ", parkplaceInfo=" + parkplaceInfo +
                '}';
    }
}