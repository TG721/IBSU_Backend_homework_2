package Task2;

import java.util.Objects;

public class Tape {
    private double lengthInches;
    private double widthInches;

    public double getLengthInches() {
        return lengthInches;
    }

    public void setLengthInches(double lengthInches) {
        this.lengthInches = lengthInches;
    }

    public double getWidthInches() {
        return widthInches;
    }

    public void setWidthInches(double widthInches) {
        this.widthInches = widthInches;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "lengthInches=" + lengthInches +
                ", widthInches=" + widthInches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tape tape)) return false;
        return Double.compare(tape.lengthInches, lengthInches) == 0 && Double.compare(tape.widthInches, widthInches) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthInches, widthInches);
    }
}
