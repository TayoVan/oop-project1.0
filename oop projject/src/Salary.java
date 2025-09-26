import java.util.Scanner;

public class Salary {
    private double salaryRate;
    private double salarySupplement;

    public Salary() {}

    public void input(Scanner sc) {
        System.out.println("~Зірпліта~");
        System.out.print("\n Ставка: ");
        salaryRate = sc.nextDouble();
        System.out.print("\n Надбавка: ");
        salarySupplement = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salaryRate=" + salaryRate +
                ", salarySupplement=" + salarySupplement +
                '}';
    }
}