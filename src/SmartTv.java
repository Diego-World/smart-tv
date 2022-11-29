public class SmartTv {
    // Atributos

    boolean ligada = false;
    int volume = 10;
    int canal= 5;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;
    }

    public void descerCanal(){
        canal--;
    }
}
