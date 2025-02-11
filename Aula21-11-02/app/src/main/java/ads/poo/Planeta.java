package ads.poo;

public enum Planeta {
    Mer("Mercúrio", 1),
    Ven("Vênus", 2),
    Ter("Terra", 3),
    Mar("Marte", 4),
    Jup("Júpiter", 5),
    Sat("Saturno", 6),
    Ura("Urano", 7),
    Net("Netuno", 8);

    public final String extenso;
    public final int posicao;

    Planeta(String s, int posicao) {
        this.extenso = s;
        this.posicao = posicao;
    }

    public String toString() {
        return this.extenso + " está na posição " + posicao;
    }
}
