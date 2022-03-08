import java.util.Scanner;

public class Zähler {
    public int x;
    public int a;
    Scanner eingabe = new Scanner(System.in);

    public void zaehlerSetzen() {
        System.out.print("Erste Zahl: ");
        x = eingabe.nextInt();

        System.out.print("Wiederholungen: ");
        a = eingabe.nextInt();

        for (int i = 0; i <= a; i++) {
            System.out.println(x);
            x++;

            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}
