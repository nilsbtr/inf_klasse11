public class Crypt {

    // Verschiebung von Zeichen um den Wert a

    private char verschiebeZeichen(int a, char c) {
        int x = 0;

        if ((int) c > 96 && (int) c < 123) { // Kleinbuchstaben (97-122)
            if ((int) c + a > 122 || (int) c + a < 97) {
                x = 26;
            }
        } else if ((int) c > 64 && (int) c < 91) { // Großbuchstaben (65-90)
            if ((int) c + a > 90 || (int) c + a < 65) {
                x = 26;
            }
        } else { // Andere Symbole
            return c;
        }

        if (a >= 0) {
            return (char) (a + (int) c - x); // Verschlüsselung
        } else {
            return (char) (a + (int) c + x); // Entschlüsselung
        }

    }

    // Caesar Ver- und Entschluesselung

    public String caesarVerschieben(int zahl, String input) {
        String w = "";

        for (int i = 0; i < input.length(); i++) {
            w = w + verschiebeZeichen(zahl, input.charAt(i));
        }

        return w;
    }

    // Vigenere Ver- und Entschluesselung

    public String vigenereVerschluesseln(String key, String input) {
        key = key.toUpperCase();
        String s = "";

        for (int i = 0, a = 0; i < input.length(); i++, a++) {
            if (a == key.length()) {
                a = 0;
            }
            s = s + (char) verschiebeZeichen((int) key.charAt(a) - 65, input.charAt(i));
        }

        return s;
    }

    public String vigenereEntschluesseln(String key, String input) {
        key = key.toUpperCase();
        String s = "";

        for (int i = 0, a = 0; i < input.length(); i++, a++) {
            if (a == key.length()) {
                a = 0;
            }
            s = s + (char) verschiebeZeichen((int) -(key.charAt(a)) + 65, input.charAt(i));
        }

        return s;
    }
}