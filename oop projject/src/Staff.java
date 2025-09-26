import java.util.Scanner;

public class Staff {
    private String name;
    private int age;
    private String workshift;
    private int workExperience;
    private String workPosition;
    private String staffKind;

    public Staff() {}

    public void input(Scanner sc) {
        System.out.println("~Стаф ю ноу?~");
        System.out.print("\n Ім'я співробітника: ");
        name = sc.nextLine();
        System.out.print("\n Вік: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("\n Робоча зміна: ");
        workshift = sc.nextLine();
        System.out.print("\n Стаж: ");
        workExperience = sc.nextInt();
        sc.nextLine();
        System.out.print("\n Посада: ");
        workPosition = sc.nextLine();
        System.out.print("\n Тип роботи: ");
        staffKind = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workshift='" + workshift + '\'' +
                ", workExperience=" + workExperience +
                ", workPosition='" + workPosition + '\'' +
                ", staffKind='" + staffKind + '\'' +
                '}';
    }
}