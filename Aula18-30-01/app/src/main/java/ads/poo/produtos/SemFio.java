package ads.poo.produtos;

public class SemFio extends Telefone{

    private double frequencia;
    private double distancia;
    private int quantidadeCanais;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, double distancia, int quantidadeCanais) {

        super(codigo, numSerie, modelo, peso, dimensao);

        this.frequencia = frequencia;
        this.distancia = distancia;
        this.quantidadeCanais = quantidadeCanais;

        this.codigo = 10;
    }

    public String trocarCanal(){
        return "trocando canal";
    }

    @Override
    public String imprimirDados() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append("frequencia=").append(frequencia);
        sb.append(", distancia=").append(distancia);
        sb.append(", quantidadeCanais=").append(quantidadeCanais);
        sb.append('}');
        sb.append(super.imprimirDados());
        return sb.toString();
    }
}
