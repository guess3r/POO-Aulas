package ads.poo;

public class BuzzLightyear {

    // Atributos:
    private boolean asa = false;
    private boolean capacete = true;
    private String[] frase = {"Ao infinito e além!", "Preparado para voar!", "Comandao estelar pronto para voar!",
            "Consigo resolver todas as missões do universo.", "Saudações, eu sou Buzz Lightyear e venho em missão de paz"};

    // Métodos:
    
    // Asa:

    public String asa(){
        if (asa == true){
            asa = false;
            return "Fechando asas!";
        }else {
            asa = true;
            return "Abrindo asas!";
        }
    }

    // Frase:

    public String falar(){
        int i = (int) (Math.random() * frase.length);
        return frase[i]; 
    }

    // Capacete

    public String capacete(){
        if (capacete == true){
            capacete = false;
            return "Abrindo capacete!";
        }else {
            capacete = true;
            return "Fechando capacete!";
        }
    }

    // Laser:

    public String laser(){
        return "Disparando laser *ZZZUM*";
    }

    // Soco

    public String golpeKarate(){
        return "Golpe de karatê estelar!";
    }

}
