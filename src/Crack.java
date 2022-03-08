public class Crack {
    Crypt cr = new Crypt();

    public void textAusgeben(String s) {
        System.out.println(cr.caesarVerschieben(diffBerechnen(s), s));
    }

    public int diffBerechnen(String s) {
        int h = 0;
        int c;
        char b = 0;

        for (int i = 65; i < 91; i++) {
            c = 0;

            for (int j = 0; j < s.length(); j++) {
                if ((char) i == s.charAt(j)) {
                    c++;
                }
            }

            if (h < c) {
                h = c;
                b = (char) i;
            }
        }

        int x = 69 - (int) b;

        return x;
    }
}
