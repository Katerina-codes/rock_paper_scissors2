package main.game;

public enum Result {
    DRAW("draw");

    private String result;

    Result(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
