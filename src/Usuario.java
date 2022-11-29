public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada: "+smartTv.ligada);
        System.out.println("Qual o canal atual: "+smartTv.canal);
        System.out.println("Qual o volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Estado - A Tv está ligada: "+smartTv.ligada);
        System.out.println("");
        System.out.println("A TV tá muito alta >:(, diminui isso ai!!! Coloca no volume 5!");
        for(int i=0;i<5;i++){
            smartTv.diminuirVolume();
        }
        System.out.println("Qual o volume atual: "+smartTv.volume);

        System.out.println("Vou fazer uma pegadinha com o meu avô hehe >:)");
        System.out.println("Vou aumentar o volume até o 50 e desligar a TV!");
        System.out.println("Quando ele ligar, vai tomar um susto!");
        System.out.println("");

        for(int i=0;i<45;i++){
            smartTv.aumentarVolume();

            if(smartTv.volume == 50){
                smartTv.desligar();
            }
        }
        System.out.println("Qual o volume atual: "+smartTv.volume);
        System.out.println("A Tv está ligada: "+smartTv.ligada);

        System.out.println("O avô do menino mal criado liga a TV e toma um susto com o volume alto!");
    }
}