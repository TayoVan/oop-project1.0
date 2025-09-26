import java.util.Scanner;

public class Transport {
    private String carModel;
    private String carGovNumber;
    private String enterDate;
    private String exitDate;

    public Transport() {}

    public void input(Scanner sc) {
        System.out.print("\n ~Дані транспортної карєти~ ") ;
        System.out.print("\n Введіть модель бібікі: ");
        carModel = sc.nextLine();
        System.out.print("\n Введіть номер ( не телефону) бібікі: ");
        carGovNumber = sc.nextLine();
        System.out.print("\n Введіть дату в'їзду карєти: ");
        enterDate = sc.nextLine();
        System.out.print("\n Введіть дату виїзду карєти: ");
        exitDate = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Transport{" +
                "carModel='" + carModel + '\'' +
                ", carGovNumber='" + carGovNumber + '\'' +
                ", enterDate='" + enterDate + '\'' +
                ", exitDate='" + exitDate + '\'' +
                '}';
    }
}