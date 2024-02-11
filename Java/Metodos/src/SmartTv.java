public class SmartTv {
    boolean isOn = false;
    int channel = 1;
    int volume = 5;

    public void botaoPower(){        
        this.isOn = !this.isOn;        
    }

    public void increaseVolume(){
        volume++;
    }
    public void decreaseVolume(){
        volume--;
    }
    public void increaseChannel(){
        channel++;
    }
    public void decreaseChannel(){
        channel--;
    }

    public void chooseChannel(int channelInput){
        channel = channelInput;
    }

}
