package ads.poo;

public class Ferrari extends Veiculo implements Conversivel{

    private boolean capota = true;

    public Ferrari(int id) {
        super(id, 0, 200);
        this.capota = capota;
    }

    @Override
    public boolean abrirFecharCapota() {
        if (velocidadeAtual == 0){
            capota = !capota;
        }
        return false;
    }

    @Override
    int acelerar(int i) {
        if(velocidadeAtual + i <= 200){
            this.velocidadeAtual = velocidadeAtual + i;
        }else {
            this.velocidadeAtual = velocidadeMax;
        }
        return velocidadeAtual;
    }

    @Override
    int frear(int i) {
        if(velocidadeAtual - i >= 0){
            this.velocidadeAtual = velocidadeAtual - i;
        }else {
            this.velocidadeAtual = 0;
        }
        return velocidadeAtual;
    }
}
