import java.util.Scanner;

public class Waage {
    Scanner eingabe = new Scanner(System.in);
    double gewicht;
    double groesse;

    public Waage() {
        gewicht = 0;
        groesse = 0;
    }

    public void wiegen() {
        System.out.println("Geben Sie ihr Gewicht in kg ein (xxx,x) : ");
        gewicht = eingabe.nextDouble();
    }

    public void messen() {
        System.out.println("Geben Sie ihre Koerpergroesse in cm ein (xxx) : ");
        groesse = eingabe.nextDouble();
    }

    private double idealgewichtBerechnen() {
        return (groesse - 100) * 0.9;
    }

    private double differenzBerechnen() {
        return gewicht - idealgewichtBerechnen();
    }

    private double bodyMassIndexBerechnen() {
        return (gewicht) / ((groesse / 100) * (groesse / 100));
    }

    public void anzeigen() {
        System.out.println("Gewicht : " + gewicht + " kg.");
        System.out.println("Körpergröße : " + groesse + " cm.");
        System.out.println("Idealgewicht : " + idealgewichtBerechnen() + " kg.");
        System.out.println("Differenz : " + differenzBerechnen() + " kg.");
        System.out.println("BMI: " + bodyMassIndexBerechnen());
    }
}