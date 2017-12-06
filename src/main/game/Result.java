package main.game;

public enum Result {
    DRAW("draw"),
    PLAYER_ONE_WINS(""),
    PLAYER_TWO_WINS("");

    private String result;

    Result(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
