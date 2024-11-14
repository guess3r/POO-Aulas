package ads.poo;

public class Estudante {

    private String nome;
    private String curso;
    private String fase;
    private static int total = 0;

    public static int getTotal() {
        return total;
    }

    public Estudante(String nome, String curso, String fase) {
        this.nome = nome;
        this.curso = curso;
        this.fase = fase;
        total++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getFase() {
        return fase;
    }

    public String toString(){
        return"Nome: " + this.nome +
                "\nCurso: " + this.curso +
                "\nFase: " + this.fase;
    }

}
