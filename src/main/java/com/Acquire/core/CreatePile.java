package com.Acquire.core;

import java.util.ArrayList;
import java.util.EnumSet;

public class CreatePile {
    private ArrayList<Piece> pile;

    public CreatePile() {
        pile = new ArrayList<Piece>(EnumSet.allOf(Piece.class));
        pile.remove(Piece.NONE);
        for (int i = 0; i < pile.size(); i++){
            pile.get(i).setChain(Chain.EMPTY);
        }
    }

    public ArrayList<Piece> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Piece> pile) {
        this.pile = pile;
    }

    public String getPileString() {
        return pile.toString();
    }

}
