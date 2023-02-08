package com.Acquire.core;

public class CreateBoard {
    private Piece[][] board = new Piece[9][12];

    public CreateBoard() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 12; y++) {
                board[x][y] = Piece.NONE;
            }
        }
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] newboard) {
        this.board = newboard;
    }
}
