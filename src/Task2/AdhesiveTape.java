package Task2;

import java.util.Objects;

public class AdhesiveTape extends Tape {
    private Integer stickiness;

    public Integer getStickiness() {
        return stickiness;
    }

    public void setStickiness(Integer stickiness) {
        if (stickiness < 0 || stickiness > 10) {
            throw new IllegalArgumentException("stickiness must be between 0 and 10");
        }
        this.stickiness = stickiness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdhesiveTape)) return false;
        AdhesiveTape that = (AdhesiveTape) o;
        return Objects.equals(stickiness, that.stickiness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stickiness);
    }
}
