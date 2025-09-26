import java.util.Scanner;

public class Driver {
    private String phoneNumber;
    private String email;
    private String name;
    private String surname;
    private Transport transport;

    public Driver() {}

    public void input(Scanner sc) {
        System.out.println("~Дані власника бібікі~");
        System.out.print("\n Телефон: ");
        phoneNumber = sc.nextLine();
        System.out.print("\n Email: ");
        email = sc.nextLine();
        System.out.print("\n Ім'я: ");
        name = sc.nextLine();
        System.out.print("\n Прізвище: ");
        surname = sc.nextLine();
        System.out.println("\n Введіть дані про транспорт:");
        transport = new Transport();
        transport.input(sc);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", transport=" + transport +
                '}';
    }
}