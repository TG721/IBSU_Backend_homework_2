package Task1;

public class GameWithTimeLimit extends Game {
    private Double timeLimit;

    public GameWithTimeLimit(String name, Integer maxNumPlayers, Double timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }

    @Override
    public int hashCode() {
        return (int) (timeLimit + this.name.length() + this.maxNumPlayers);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != GameWithTimeLimit.class) {
            return false;
        } else {
            GameWithTimeLimit obj1 = (GameWithTimeLimit) obj;
            return obj1.timeLimit.equals(this.timeLimit) && obj1.maxNumPlayers.equals(this.maxNumPlayers) && obj1.name.equals(this.name);

        }
    }
}
