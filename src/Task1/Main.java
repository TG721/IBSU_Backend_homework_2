package Task1;

public class Main {
    public static void main(String[] args) {
        Game gameObj = new Game("Tic Tac Toe",2);
        GameWithTimeLimit gameWLObj = new GameWithTimeLimit("Football",22, 100.0);
        System.out.println(gameObj);
        System.out.println(gameWLObj.equals(gameObj));
        System.out.println(gameWLObj.hashCode());
    }
}
