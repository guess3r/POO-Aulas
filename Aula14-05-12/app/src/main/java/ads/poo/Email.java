package ads.poo;

public class Email {

    private String valor;
    private String rotulo;

    public Email(String rotulo, String valor) {
        setValor(valor);
        this.rotulo = rotulo;
    }

    boolean setValor(String valor) {
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(valor.matches(eR) == true){
            this.valor = valor;
            return true;
        }else {
            this.valor = "";
            return false;
        }
    }

    public String toString() {
            return this.rotulo + ": " + this.valor;
    }
}
