package ads.poo;

public class Carta {

    private Naipe n;
    private Valor v;

    public Carta(Naipe n, Valor v) {
        this.n = n;
        this.v = v;
    }

    @Override
    public String toString() {
        return v + ", de " + n;
    }
}
