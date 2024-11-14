package ads.poo;

public class Contador {
    //Atributos

    private int valorAtual;

    //Métodos
    //Atribuir um valor ao contador
    //Incrementar o contador
    //Obter o atual valor do contador

    public void definirValor(int v){
        valorAtual = v;
    }

    public void incrementarContador(){
        valorAtual++;
    }

    public int obterValor(){
        return valorAtual;
    }

}
