import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main (String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }//close main

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();//Get a sequencer and open it
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();//Get sequence from track

            ShortMessage a = new ShortMessage();//put midi event into track
            a.setMessage(144,1,44,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            a.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);//Give sequence to sequencer
            player.start();//play the sequence
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//close play
}//close class
