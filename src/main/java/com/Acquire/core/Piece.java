package com.Acquire.core;

public enum Piece {
    NONE {
        Chain chain = Chain.NONE;

        @Override
        public String toString() {
            return "NONE";
        }

        @Override
        public int getX() {
            return 10000;
        }

        @Override
        public int getY() {
            return 10000;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A1 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 1";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A2 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 2";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A3 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 3";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A4 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 4";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A5 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 5";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A6 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 6";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A7 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 7";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A8 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 8";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A9 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 9";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A10 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 10";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A11 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 11";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, A12 {
        Chain chain;

        @Override
        public String toString() {
            return "A - 12";
        }

        @Override
        public int getX() {
            return 0;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B1 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 1";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B2 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 2";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B3 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 3";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B4 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 4";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B5 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 5";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B6 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 6";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B7 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 7";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B8 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 8";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B9 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 9";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B10 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 10";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B11 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 11";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, B12 {
        Chain chain;

        @Override
        public String toString() {
            return "B - 12";
        }

        @Override
        public int getX() {
            return 1;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C1 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 1";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C2 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 2";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C3 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 3";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C4 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 4";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C5 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 5";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C6 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 6";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C7 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 7";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C8 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 8";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C9 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 9";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C10 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 10";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C11 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 11";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, C12 {
        Chain chain;

        @Override
        public String toString() {
            return "C - 12";
        }

        @Override
        public int getX() {
            return 2;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D1 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 1";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D2 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 2";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D3 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 3";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D4 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 4";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D5 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 5";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D6 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 6";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D7 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 7";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D8 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 8";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D9 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 9";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D10 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 10";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D11 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 11";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, D12 {
        Chain chain;

        @Override
        public String toString() {
            return "D - 12";
        }

        @Override
        public int getX() {
            return 3;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E1 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 1";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E2 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 2";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E3 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 3";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E4 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 4";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E5 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 5";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E6 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 6";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E7 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 7";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E8 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 8";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E9 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 9";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E10 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 10";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E11 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 11";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, E12 {
        Chain chain;

        @Override
        public String toString() {
            return "E - 12";
        }

        @Override
        public int getX() {
            return 4;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F1 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 1";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F2 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 2";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F3 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 3";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F4 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 4";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F5 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 5";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F6 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 6";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F7 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 7";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F8 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 8";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F9 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 9";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F10 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 10";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F11 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 11";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, F12 {
        Chain chain;

        @Override
        public String toString() {
            return "F - 12";
        }

        @Override
        public int getX() {
            return 5;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G1 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 1";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G2 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 2";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G3 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 3";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G4 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 4";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G5 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 5";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G6 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 6";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G7 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 7";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G8 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 8";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G9 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 9";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G10 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 10";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G11 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 11";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, G12 {
        Chain chain;

        @Override
        public String toString() {
            return "G - 12";
        }

        @Override
        public int getX() {
            return 6;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H1 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 1";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H2 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 2";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H3 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 3";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H4 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 4";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H5 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 5";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H6 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 6";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H7 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 7";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H8 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 8";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H9 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 9";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H10 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 10";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H11 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 11";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, H12 {
        Chain chain;

        @Override
        public String toString() {
            return "H - 12";
        }

        @Override
        public int getX() {
            return 7;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I1 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 1";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 0;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I2 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 2";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 1;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I3 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 3";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 2;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I4 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 4";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 3;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I5 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 5";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 4;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I6 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 6";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 5;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I7 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 7";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 6;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I8 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 8";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 7;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I9 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 9";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 8;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I10 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 10";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 9;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I11 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 11";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 10;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    }, I12 {
        Chain chain;

        @Override
        public String toString() {
            return "I - 12";
        }

        @Override
        public int getX() {
            return 8;
        }

        @Override
        public int getY() {
            return 11;
        }

        @Override
        public Chain getChain() {
            return this.chain;
        }

        @Override
        public void setChain(Chain newchain) {
            this.chain = newchain;
        }
    };

    public abstract int getX();
    public abstract int getY();
    public abstract String toString();
    public abstract Chain getChain();
    public abstract void setChain(Chain newchain);
}