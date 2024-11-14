package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class App {
    public static void main(String[] args) {
        Draw draw = new Draw();

        draw.setPenColor(Draw.BOOK_BLUE);
        draw.text(.5,.5,"Guesser");

        draw.setPenColor(Draw.RED);
        draw.line(.1,.1,.3,.3);
    }
}
