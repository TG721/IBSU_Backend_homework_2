package Task2;

public class Main {
    public static void main(String[] args) {
        Tape tapeObj = new Tape();
        tapeObj.setLengthInches(12);
        tapeObj.setLengthInches(100);
        VideoTape vidTape = new VideoTape();
        vidTape.setTimeMinutes(20);
        vidTape.setLengthInches(12);
        vidTape.setWidthInches(4);
        AdhesiveTape adTape = new AdhesiveTape();
        System.out.println(vidTape);
        System.out.println(vidTape.hashCode());
        System.out.println(vidTape.equals(tapeObj));
        adTape.setStickiness(12); //should give an error


    }
}
