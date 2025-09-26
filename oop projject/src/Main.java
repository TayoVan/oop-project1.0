import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Transport t = new Transport();
        t.input(sc);

        Driver d = new Driver();
        d.input(sc);

        PaymentCheck pc = new PaymentCheck();
        pc.input(sc);

        Parking p = new Parking();
        p.input(sc);

        Staff s = new Staff();
        s.input(sc);

        Salary sal = new Salary();
        sal.input(sc);

        Count c = new Count();
        c.input(sc);

        PublicUtilities pu = new PublicUtilities();
        pu.input(sc);

        System.out.println("\n~ Результати ~");
        System.out.println(t);
        System.out.println(d);
        System.out.println(pc);
        System.out.println(p);
        System.out.println(s);
        System.out.println(sal);
        System.out.println(c);
        System.out.println(pu);

        sc.close();
    }
}