package main.game;

public interface Move {
    Moves scoreAgainst(Moves playerTwoMove);
}
