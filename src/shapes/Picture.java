package shapes;

import java.util.Scanner;

public class Picture {

    Circle sonne, mond;
    Square boden, himmel, haus, fenster1, fenster2, fenster3, fenster4, tür1, tür2;
    Triangle dach;
    Person person1, person2;
    int g;
    int i;

    public static void main(String[] args) {
        Picture p = new Picture();
    }

    public Picture() {
        himmel = new Square();
        sonne = new Circle();
        mond = new Circle();
        boden = new Square();
        haus = new Square();
        dach = new Triangle();
        fenster1 = new Square();
        fenster2 = new Square();
        fenster3 = new Square();
        fenster4 = new Square();
        tür1 = new Square();
        tür2 = new Square();
        person1 = new Person();
        person2 = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("Geschwindigkeit (1-10): ");
        int x = sc.nextInt();
        g = 1000 / x;

        System.out.println();

        System.out.println("Ausführungen (1-10): ");
        int a = sc.nextInt();

        sc.close();
        System.out.println();
        System.out.println("------ Deine Wahl --------");
        System.out.println("Geschwindigkeit: " + x);
        System.out.println("Mehrfache Ausführung: " + a);
        System.out.println("--------------------------");
        System.out.println();

        makeVisible();
        makeVisiblePersonen();
        createPicture();
        makeNight();
    }

    public void makeVisible() {
        himmel.makeVisible();
        sonne.makeVisible();
        mond.makeVisible();
        boden.makeVisible();
        haus.makeVisible();
        dach.makeVisible();
        fenster1.makeVisible();
        fenster2.makeVisible();
        fenster3.makeVisible();
        fenster4.makeVisible();
        tür1.makeVisible();
        tür2.makeVisible();
    }

    public void makeVisiblePersonen() {
        person1.makeVisible();
        person2.makeVisible();
    }

    public void createPicture() {
        boden.moveHorizontal(-50);
        boden.moveVertical(200);
        boden.changeColor("green");
        boden.changeSize(500);

        himmel.moveHorizontal(-50);
        himmel.moveVertical(-300);
        himmel.changeColor("skyblue");
        himmel.changeSize(500);

        haus.moveHorizontal(200);
        haus.moveVertical(100);
        dach.moveHorizontal(250);
        dach.moveVertical(10);
        haus.changeColor("bricks");
        dach.changeColor("red");
        haus.changeSize(100);
        dach.changeSize(90, 100);

        sonne.moveHorizontal(90);
        mond.moveHorizontal(280 + 195);
        mond.moveVertical(312);
        sonne.changeColor("yellow");
        mond.changeColor("gray");
        mond.changeSize(40);

        fenster1.moveHorizontal(245);
        fenster1.moveVertical(160);
        fenster2.moveHorizontal(265);
        fenster2.moveVertical(160);
        fenster3.moveHorizontal(210);
        fenster3.moveVertical(120);
        fenster4.moveHorizontal(265);
        fenster4.moveVertical(120);
        tür1.moveHorizontal(210);
        tür1.moveVertical(160);
        tür2.moveHorizontal(210);
        tür2.moveVertical(175);
        fenster1.changeColor("white");
        fenster2.changeColor("white");
        fenster3.changeColor("white");
        fenster4.changeColor("white");
        tür1.changeColor("gray");
        tür2.changeColor("gray");
        fenster1.changeSize(25);
        fenster2.changeSize(25);
        fenster3.changeSize(25);
        fenster4.changeSize(25);
        tür1.changeSize(25);
        tür2.changeSize(25);

        person1.moveHorizontal(0);
        person1.moveVertical(172);
        person2.moveHorizontal(50);
        person2.moveVertical(172);
        person1.changeColor("blue");
        person2.changeColor("purple");
        person1.changeSize(40, 20);
        person2.changeSize(40, 20);

    }

    int n = 0;
    int d = 0;

    public void makeNight() {
        for (n = 0; n <= 39; n += 1) {
            try {
                Thread.sleep(g);
            } catch (Exception e) {
            }

            if (n < 39) {
                sonne.makeInvisible();
                sonne.moveHorizontal(-5);
                sonne.moveVertical(8);
                sonne.makeVisible();
                boden.makeVisible();

                mond.makeInvisible();
                mond.moveHorizontal(-5);
                mond.moveVertical(-8);
                mond.makeVisible();
                boden.makeVisible();

                System.out.println("Fortschritt Nacht: " + n + "/39");
            }
            if (n <= 36) {
                person1.makeInvisible();
                person1.moveHorizontal(6);
                makeVisiblePersonen();
            }

            if (n <= 34) {
                person2.makeInvisible();
                person2.moveHorizontal(5);
                makeVisiblePersonen();
            }

            if (n == 33) {
                tür1.changeColor("yellow");
                tür2.changeColor("yellow");
            }

            if (n == 38) {
                tür1.changeColor("gray");
                tür2.changeColor("gray");
                person1.makeInvisible();
                person2.makeInvisible();
            }

            if (n == 19) {
                himmel.changeColor("orange");
                makeVisible();
                makeVisiblePersonen();
            }

            if (n == 24) {
                mond.changeColor("white");
                himmel.changeColor("black");
                fenster1.changeColor("yellow");
                fenster2.changeColor("yellow");
                fenster3.changeColor("yellow");
                fenster4.changeColor("yellow");
                makeVisible();
                makeVisiblePersonen();
            }

            if (n == 39) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                System.out.println("Fortschritt Nacht: " + n + "/39");
                System.out.println("--------------------------");
                d = 0;
                makeDay();
            }
        }
    }

    public void makeDay() {
        for (d = 0; d <= 100; d += 1) {
            try {
                Thread.sleep(g);
            } catch (Exception e) {
            }

            if (d < 39) {
                sonne.makeInvisible();
                sonne.moveHorizontal(5);
                sonne.moveVertical(-8);
                sonne.makeVisible();
                boden.makeVisible();

                mond.makeInvisible();
                mond.moveHorizontal(5);
                mond.moveVertical(8);
                mond.makeVisible();
                boden.makeVisible();

                System.out.println("Fortschritt Tag: " + d + "/39");
            }

            if (d >= 1 && d <= 37) {
                person1.makeInvisible();
                person1.moveHorizontal(-6);
                makeVisiblePersonen();
            }

            if (d >= 1 && d <= 35) {
                person2.makeInvisible();
                person2.moveHorizontal(-5);
                makeVisiblePersonen();
            }

            if (d == 0) {
                tür1.changeColor("yellow");
                tür2.changeColor("yellow");
            }

            if (d == 5) {
                tür1.changeColor("gray");
                tür2.changeColor("gray");
            }

            if (d == 14) {
                mond.changeColor("gray");
                himmel.changeColor("orange");
                fenster1.changeColor("white");
                fenster2.changeColor("white");
                fenster3.changeColor("white");
                fenster4.changeColor("white");
                makeVisible();
                makeVisiblePersonen();
            }

            if (d == 18) {
                himmel.changeColor("skyblue");
                makeVisible();
            }

            if (d == 39) {

                try {
                    Thread.sleep(g);
                } catch (Exception e) {
                }

                if (i == 0) {
                    System.out.println("Fortschritt Tag: " + d + "/39");
                    System.out.println();
                    System.out.println("--------------------------");
                    System.out.println("---- Programm beendet ----");
                    System.out.println("--------------------------");
                    return;
                } else {
                    System.out.println("Fortschritt Tag: " + d + "/39");
                    System.out.println("--------------------------");
                    n = 0;
                    makeNight();
                    i = i - 1;
                }
            }
        }
    }
}