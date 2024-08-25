package tests;

import boardgame.Board;
import boardgame.Position;

public class Tests {
    public static void main(String[] args) {
        Position pos = new Position(3, 0);
        Board board = new Board(8, 8);
        System.out.println(pos);
    }
}
