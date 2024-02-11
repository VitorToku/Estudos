public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.botaoPower();        

        smartTv.increaseVolume();       

        smartTv.chooseChannel(98);
        System.out.println("TV Ligada? " + smartTv.isOn);
        System.out.println("Canal Atual: " + smartTv.channel);
        System.out.println("Volume atual:  " + smartTv.volume);
    }
}
