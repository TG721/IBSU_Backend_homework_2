package Task2;

import java.util.Objects;

public class VideoTape extends Tape{
    public Integer getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(Integer timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    private Integer timeMinutes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoTape)) return false;
        VideoTape videoTape = (VideoTape) o;
        return Objects.equals(getTimeMinutes(), videoTape.getTimeMinutes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimeMinutes());
    }
}
