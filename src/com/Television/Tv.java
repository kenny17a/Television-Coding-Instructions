package com.Television;

public class Tv {
    private boolean isOn;
    private int volume;
    private boolean isMute;

    private int tempVolume;

    private int channel;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseVolume() {
        if (isOn){
            volume++;
            tempVolume++;
        }
        if(volume > 100){
            volume = 100;
            tempVolume = 100;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if (isOn) {
            volume--;
            tempVolume--;
        }
        if (volume < 0) {
            volume = 0;
            tempVolume = 0;
        }
    }

    public void mute() {
        if (isOn) {
            isMute = true;
            volume = 0;
        }
    }


    public boolean isMute() {
        return isMute;
    }

    public void unMute() {
        isMute = false;
        volume = tempVolume;
    }

    public void increaseChannel() {
        if (isOn)channel++;
    }

    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
        if(isOn)channel--;
        if (channel < 0) channel = 0;
    }

    public void setChannel(int channel) {
        if (channel < 0) channel = 0;
        this.channel = channel;

    }
}
