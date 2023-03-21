package Task1;

public class Game {
    protected String name;
    protected Integer maxNumPlayers;

    public Game(String name, Integer maxNumPlayers) {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString(){
        return String.format("Name of game - %s, maximum number of players %d.", name, maxNumPlayers);
    }
}
