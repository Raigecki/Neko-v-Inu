package com.game.components;

import java.util.Set;

import com.game.rules.*;

public class Board {

    private GameType gt;
    private int[][] board;

    /////////////////////////////Constructors/////////////////////////////

    public Board() {
        //TODO
    }
    public Board(String gameType) {
        //TODO
    }

    ///////////////////////////////Methods//////////////////////////////

    public boolean checkWinCondition() {
        //TODO
        return false;
    }

    public Piece getPieceAt(Coordinate c) {
        //TODO
        return null;
    }

    public Set<Coordinate> getPossibleMoves(Piece p) {
        //TODO
        return null;
    }

    public void move(Piece p, Coordinate dest) {
        //TODO
    }
}