/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_app;

/**
 *
 * @author Priyank
 */
public class ABC {
    


    // data fields
    int channel=1;
    int volumeLevel=1;
    boolean on;
    // constructors
    TV(){}
    void turnOn(){
        on=true;
    }
    void turnOff(){
        on=false;
    }
    void setChannel(int ch){
        if(on){
            if(ch>=1 && ch<=120)
                this.channel= ch;    
        }
    }
    void setVolume(int volume){
        if(on){
            if(volume>=1 && volume<=7)
                volumeLevel=volume;   
        }
    }
    void channelUp(){
        if(on){
            if(channel<120)
                ++channel;// channel= channel+1;  
        }
    }
    void channelDown(){
        if(on){
            if(channel>1)       
                --channel; 
        }
    }
    void volumeUp(){
        if(on){
            if(volumeLevel<7)
                ++volumeLevel;
        }
    }
    void volumeDown(){
        if(on){
            if(volumeLevel>1)
                 --volumeLevel;
        }
    }

    @Override
    public String toString() {
        if(on){
            return "TV{" + "channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + '}';
        }
        else
            return "TV is OFF";
            
    }
    
    
        
}    

