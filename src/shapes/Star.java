package shapes;

public class Star {
    Triangle eins, zwei;

    public Star() {
        // Instanzvariable initialisieren
        eins = new Triangle();
        zwei = new Triangle();
        eins.changeColor("yellow");
        zwei.changeColor("yellow");

        eins.changeSize(-60, 70);
        eins.moveVertical(80);

        makeVisible();

    }

    public void makeVisible() {
        eins.makeVisible();
        zwei.makeVisible();
    }

    public void makeInvisible() {
        eins.makeInvisible();
        zwei.makeInvisible();
    }

    public void moveHorizontal(int x) {
        eins.moveHorizontal(x);
        zwei.moveHorizontal(x);
    }

    public void moveVertical(int x) {
        eins.moveVertical(x);
        zwei.moveVertical(x);
    }

    public void changeColor(String newColor) {
        eins.changeColor(newColor);
        zwei.changeColor(newColor);
    }
}
