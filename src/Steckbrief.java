public class Steckbrief {
    private int alter;
    private double größe;
    private String name;
    private double x;

    public void ersteMethode() {
        alter = 16;
        größe = 1.76;
        name = "Nils";

        System.out.println("Hallo mein Name ist " + name + ". " + "Ich bin " + alter + " Jahre alt und bin " + größe
                + " Meter groß.");

    }

    public double zweiteMethode(double x) {
        return (x + 1) * x / 2;
    }

    public void dritteMethode() {
        System.out.println("Die Summe aller Zahlen bis " + x + " ist " + zweiteMethode(x));
    }
}
