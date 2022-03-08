public class Wiederholungen {
    public int x;
    public int i;
    public int e;
    public int a;
    public int b;

    public void erstelleBeispiele() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 3);
        }

        i = 0;

        while (i < 10) {
            System.out.println(i * 3);
            i++;
        }
    }

    public void rechneFakultaet(int x) {
        int e = 1;

        for (int i = 1; i <= x; i++) {
            e = e * i;
        }

        System.out.println(e);

        return;
    }

    public void renchenFibannocci(int x) {
        a = 1;
        b = 1;
        i = 0;

        while (i < x) {
            a = a + b;
            System.out.println(a);
            i++;
            b = a + b;
            System.out.println(b);
            i++;
        }
    }
}
