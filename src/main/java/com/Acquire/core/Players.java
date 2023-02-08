package com.Acquire.core;

import java.util.ArrayList;

public enum Players {
    Player1 {

        ArrayList<Piece> hand;
        int cash;
        int net;

        @Override
        public int getCash() {
            return cash;
        }

        @Override
        public int getNet() {
            int valueL = (Chain.L.getPlayer1() * Chain.L.getCost() * 100);
            int valueT = (Chain.T.getPlayer1() * Chain.T.getCost() * 100);
            int valueA = (Chain.A.getPlayer1() * Chain.A.getCost() * 100);
            int valueF = (Chain.F.getPlayer1() * Chain.F.getCost() * 100);
            int valueW = (Chain.W.getPlayer1() * Chain.W.getCost() * 100);
            int valueC = (Chain.C.getPlayer1() * Chain.C.getCost() * 100);
            int valueI = (Chain.I.getPlayer1() * Chain.I.getCost() * 100);
            return cash + valueL + valueT + valueA + valueF + valueW + valueC + valueI;
        }

        @Override
        public ArrayList<Piece> getHand() {
            return hand;
        }

        @Override
        public void setHand(ArrayList<Piece> hand) {
            this.hand = hand;
        }

        @Override
        public void setCash(int cash) {
            this.cash = cash;
        }

        @Override
        public void setNet(int net) {
            this.net = net + cash;
        }

        @Override
        public String toString() {
            return "Player 1";
        }
    }, Player2 {

        ArrayList<Piece> hand;
        int cash;
        int net;

        @Override
        public int getCash() {
            return cash;
        }

        @Override
        public int getNet() {
            int valueL = (Chain.L.getPlayer2() * Chain.L.getCost() * 100);
            int valueT = (Chain.T.getPlayer2() * Chain.T.getCost() * 100);
            int valueA = (Chain.A.getPlayer2() * Chain.A.getCost() * 100);
            int valueF = (Chain.F.getPlayer2() * Chain.F.getCost() * 100);
            int valueW = (Chain.W.getPlayer2() * Chain.W.getCost() * 100);
            int valueC = (Chain.C.getPlayer2() * Chain.C.getCost() * 100);
            int valueI = (Chain.I.getPlayer2() * Chain.I.getCost() * 100);
            return cash + valueL + valueT + valueA + valueF + valueW + valueC + valueI;
        }

        @Override
        public ArrayList<Piece> getHand() {
            return hand;
        }

        @Override
        public void setHand(ArrayList<Piece> hand) {
            this.hand = hand;
        }

        @Override
        public void setCash(int cash) {
            this.cash = cash;
        }

        @Override
        public void setNet(int net) {
            this.net = net + cash;
        }

        @Override
        public String toString() {
            return "Player 2";
        }
    };

    public abstract int getCash();

    public abstract int getNet();

    public abstract ArrayList<Piece> getHand();

    public abstract void setHand(ArrayList<Piece> hand);

    public abstract void setCash(int cash);

    public abstract void setNet(int net);
}
