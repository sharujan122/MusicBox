package test;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try{
            Sequencer sequencer = MidiSystem.getSequencer();//getSequencer is a risky method
            System.out.println("We got a sequencer");
        } catch (MidiUnavailableException ex) {//when there is an error
            System.out.println("Bummer");
        }
    } // close play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } // close main
} // close class
