import java.util.Scanner;

public class Count {
    private int alltimeCustomers;
    private int inDayCustomers;
    private int inMonthCustomers;
    private int inHalfyearCustomers;
    private int inYearCustomers;

    public Count() {}

    public void input(Scanner sc) {
        System.out.println("~Рахуєм пасітітєлєй~");
        System.out.print("\n Всього відвідувачів: ");
        alltimeCustomers = sc.nextInt();
        System.out.print("\n За день: ");
        inDayCustomers = sc.nextInt();
        System.out.print("\n За місяць: ");
        inMonthCustomers = sc.nextInt();
        System.out.print("\n За пів року: ");
        inHalfyearCustomers = sc.nextInt();
        System.out.print("\n За рік: ");
        inYearCustomers = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Count{" +
                "alltimeCustomers=" + alltimeCustomers +
                ", inDayCustomers=" + inDayCustomers +
                ", inMonthCustomers=" + inMonthCustomers +
                ", inHalfyearCustomers=" + inHalfyearCustomers +
                ", inYearCustomers=" + inYearCustomers +
                '}';
    }
}