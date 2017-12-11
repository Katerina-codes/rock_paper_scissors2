package main.game;

public class GameRunner {
    public static void main(String[] args) {
        English englishLanguage = new English();
        CommandlineUi inputOutput = new CommandlineUi(System.out, System.in, englishLanguage);
        MoveFactory moves = new MoveFactory();
        Rules rules = new Rules(moves.getMoves());
        Game game = new Game(inputOutput, rules);
        game.runGameTwo();
    }
}