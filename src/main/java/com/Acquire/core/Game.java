package com.Acquire.core;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    Random random = new Random();
    CreateBoard board;
    CreatePile pile;
    ArrayList<Piece> player1hand;
    ArrayList<Piece> player2hand;
    ArrayList<Piece> temppile;
    ArrayList<Piece> affectedpieces;
    ArrayList<Piece> chains;
    ArrayList<Piece> emptypieces;
    ArrayList<Piece> piecestoupdate;
    ArrayList<Piece> currenthand;
    ArrayList<Chain> chainsonboard;
    Boolean addingToChain = false;
    Boolean chainmustbecreated = false;
    Boolean chainmergemustbepicked = false;
    Boolean deadtile = false;
    Boolean doublemergermustbepicked = false;
    Boolean triplemergermustbepicked = false;
    Boolean singlemerger = false;
    Boolean doublemerger = false;
    Boolean triplemerger = false;
    Chain chaincreated;
    Chain chaineaten;
    Chain chaineaten1;
    Chain chaineaten2;
    Chain merge1;
    Chain merge2;
    Piece pieceput;
    Piece checkpiece0;
    Piece checkpiece1;
    Piece checkpiece2;
    Piece checkpiece3;
    Piece[][] tempboard;
    int numofchains;
    Players currentplayer = Players.Player1;
    Players currentdisposer = Players.Player1;
    Boolean cantputpiece;
    int indexofpieceput;


    public void initvalues() {
        numofchains = 0;
        chainsonboard = new ArrayList<>();
        affectedpieces = new ArrayList<>();
        player1hand = new ArrayList<>();
        player2hand = new ArrayList<>();
        board = new CreateBoard();
        pile = new CreatePile();
        Chain.L.setPlayer1(0);
        Chain.T.setPlayer1(0);
        Chain.A.setPlayer1(0);
        Chain.F.setPlayer1(0);
        Chain.W.setPlayer1(0);
        Chain.C.setPlayer1(0);
        Chain.I.setPlayer1(0);
        Chain.L.setPlayer2(0);
        Chain.T.setPlayer2(0);
        Chain.A.setPlayer2(0);
        Chain.F.setPlayer2(0);
        Chain.W.setPlayer2(0);
        Chain.C.setPlayer2(0);
        Chain.I.setPlayer2(0);
        Chain.L.setAvailable(25);
        Chain.T.setAvailable(25);
        Chain.A.setAvailable(25);
        Chain.F.setAvailable(25);
        Chain.W.setAvailable(25);
        Chain.C.setAvailable(25);
        Chain.I.setAvailable(25);
        Chain.L.setSize(0);
        Chain.T.setSize(0);
        Chain.A.setSize(0);
        Chain.F.setSize(0);
        Chain.W.setSize(0);
        Chain.C.setSize(0);
        Chain.I.setSize(0);
        Chain.L.setCost(0);
        Chain.T.setCost(0);
        Chain.A.setCost(0);
        Chain.F.setCost(0);
        Chain.W.setCost(0);
        Chain.C.setCost(0);
        Chain.I.setCost(0);
        Players.Player1.setCash(6000);
        Players.Player2.setCash(6000);
    }

    public void updateAllValues() {
        chaincreated = Chain.EMPTY;
        chaineaten = Chain.EMPTY;
        chaineaten1 = Chain.EMPTY;
        chaineaten2 = Chain.EMPTY;
        chainmustbecreated = false;
        addingToChain = false;
        deadtile = false;
        singlemerger = false;
        doublemerger = false;
        triplemerger = false;
        cantputpiece = false;
    }

    public void drawhands() {
        temppile = pile.getPile();
        for (int i = 0; i < 12; i++){
            int index = random.nextInt(temppile.size());
            if (i < 6) {
                player1hand.add(temppile.remove(index));
            } else {
                player2hand.add(temppile.remove(index));
            }
        }
        pile.setPile(temppile);
        Players.Player1.setHand(player1hand);
        Players.Player2.setHand(player2hand);
    }

    public void put(int index){
        cantputpiece = false;
        indexofpieceput = index;
        temppile = pile.getPile();
        currenthand = currentplayer.getHand();
        pieceput = currenthand.get(index);
        int x = pieceput.getX();
        int y = pieceput.getY();
        tempboard = board.getBoard();
        affectedpieces.clear();
        getAffectedPieces(tempboard, pieceput, x, y);
        checkAffectedPieces();
        updateBoard();
    }

    public void buyStock(ArrayList<Chain> cart, int carttotal) {
        for (Chain chain : cart) {
            if (currentplayer.equals(Players.Player1)) {
                chain.setPlayer1(chain.getPlayer1() + 1);
                System.out.println("Player 1 bought " + chain.toString());
                System.out.println("Player 1 now has " + chain.getPlayer1() + " stocks of " + chain.toString());
            } else if (currentplayer.equals(Players.Player2)) {
                chain.setPlayer2(chain.getPlayer2() + 1);
                System.out.println("Player 2 bought " + chain.toString());
                System.out.println("Player 2 now has " + chain.getPlayer2() + " stocks of " + chain.toString());
            }
        }
        if (currentplayer.equals(Players.Player1)) {
            Players.Player1.setCash(Players.Player1.getCash() - carttotal);
            System.out.println("Player 1 now has " + Players.Player1.getCash() + " dollars");
        } else if (currentplayer.equals(Players.Player2)) {
            Players.Player2.setCash(Players.Player2.getCash() - carttotal);
            System.out.println("Player 2 now has " + Players.Player2.getCash() + " dollars");
        }
    }

    public void getAffectedPieces(Piece[][] tempboard, Piece piece, int x, int y) {
        piece.setChain(Chain.EMPTY);
        checkpiece0 = Piece.NONE;
        checkpiece1 = Piece.NONE;
        checkpiece2 = Piece.NONE;
        checkpiece3 = Piece.NONE;
        if (y != 0) {
            checkpiece0 = tempboard[x][y - 1];
            checkDead(checkpiece0);
        }
        if (x != 8) {
            checkpiece1 = tempboard[x + 1][y];
            checkDead(checkpiece1);
        }
        if (y != 11) {
            checkpiece2 = tempboard[x][y + 1];
            checkDead(checkpiece2);
        }
        if (x != 0) {
            checkpiece3 = tempboard[x - 1][y];
            checkDead(checkpiece3);
        }
        if ((!checkpiece0.getChain().equals(Chain.NONE)) || (!checkpiece1.getChain().equals(Chain.NONE)) || (!checkpiece2.getChain().equals(Chain.NONE)) || (!checkpiece3.getChain().equals(Chain.NONE))) {
            addToAffectedPieces(checkpiece0);
            addToAffectedPieces(checkpiece1);
            addToAffectedPieces(checkpiece2);
            addToAffectedPieces(checkpiece3);
        }
    }

    public void addToAffectedPieces(Piece piece) {
        if (!piece.getChain().equals(Chain.NONE)) {
            affectedpieces.add(piece);
        }
    }

    public void checkDead(Piece piece){
        if (piece.getChain().equals(Chain.DEAD)) {
            piece = Piece.NONE;
        }
    }

    public void checkAffectedPieces() {
        tempboard = board.getBoard();
        chains = new ArrayList<>();
        emptypieces = new ArrayList<>();
        for (Piece piece : affectedpieces) {
            if (piece.getChain().equals(Chain.EMPTY)) {
                emptypieces.add(piece);
            } else {
                chains.add(piece);
            }
        }
        handlePieces(emptypieces, chains);
        board.setBoard(tempboard);
    }

    public void handlePieces(ArrayList<Piece> emptypieces, ArrayList<Piece> chains) {
        if (emptypieces.size() > 0 && chains.size() == 0) {
            handle0chains();
        } else if (chains.size() == 1) {
            handle1chains(chains);
        } else if (chains.size() == 2) {
            handle2chains(chains);
        } else if (chains.size() == 3) {
            handle3chains(chains);
        } else if (chains.size() == 4) {
            handle4chains(chains);
        }
    }

    public void handle0chains() {
        if (numofchains <= 6) {
            chainmustbecreated = true;
        } else {
            cantputpiece = true;
        }
    }

    public void handle1chains(ArrayList<Piece> chains) {
        chaincreated = chains.get(0).getChain();
        addingToChain = true;
    }

    public void handle2chains(ArrayList<Piece> chains) {
        if (chains.get(0).getChain().equals(chains.get(1).getChain())) {
            chaincreated = chains.get(0).getChain();
            addingToChain = true;
        } else {
            int chain1size = chains.get(0).getChain().getSize();
            int chain2size = chains.get(1).getChain().getSize();
            if (chain1size > 10 && chain2size > 10) {
                deadtile = true;
            } else if (chain1size > chain2size) {
                chaincreated = chains.get(0).getChain();
                chaineaten = chains.get(1).getChain();
                singlemerger = true;
            } else if (chain1size < chain2size) {
                chaincreated = chains.get(1).getChain();
                chaineaten = chains.get(0).getChain();
                singlemerger = true;
            } else {
                cantputpiece = true;
            }
        }
    }

    public void handle3chains(ArrayList<Piece> chains) {
        if (chains.get(0).getChain().equals(chains.get(1).getChain()) && chains.get(0).getChain().equals(chains.get(2).getChain())) {
            chaincreated = chains.get(0).getChain();
            addingToChain = true;
        } else if (chains.get(0).getChain().equals(chains.get(1).getChain())) {
            int chain1size = chains.get(0).getChain().getSize();
            int chain2size = chains.get(2).getChain().getSize();
            if (chain1size > 10 && chain2size > 10) {
                deadtile = true;
            } else if (chain1size > chain2size) {
                chaincreated = chains.get(0).getChain();
                chaineaten = chains.get(2).getChain();
                singlemerger = true;
            } else if (chain1size < chain2size) {
                chaincreated = chains.get(2).getChain();
                chaineaten = chains.get(0).getChain();
                singlemerger = true;
            } else {
                chainmergemustbepicked = true;
            }
        } else if (chains.get(1).getChain().equals(chains.get(2).getChain())) {
            int chain1size = chains.get(0).getChain().getSize();
            int chain2size = chains.get(1).getChain().getSize();
            if (chain1size > 10 && chain2size > 10) {
                deadtile = true;
            } else if (chain1size > chain2size) {
                chaincreated = chains.get(0).getChain();
                chaineaten = chains.get(1).getChain();
                singlemerger = true;
            } else if (chain1size < chain2size) {
                chaincreated = chains.get(1).getChain();
                chaineaten = chains.get(0).getChain();
                singlemerger = true;
            } else {
                chainmergemustbepicked = true;
            }
        } else if (chains.get(0).getChain().equals(chains.get(2).getChain())) {
            int chain1size = chains.get(0).getChain().getSize();
            int chain2size = chains.get(1).getChain().getSize();
            if (chain1size > 10 && chain2size > 10) {
                deadtile = true;
            } else if (chain1size > chain2size) {
                chaincreated = chains.get(0).getChain();
                chaineaten = chains.get(1).getChain();
                singlemerger = true;
            } else if (chain1size < chain2size) {
                chaincreated = chains.get(1).getChain();
                chaineaten = chains.get(0).getChain();
                singlemerger = true;
            } else {
                cantputpiece = true;
            }
        } else {
            int chain1size = chains.get(0).getChain().getSize();
            int chain2size = chains.get(1).getChain().getSize();
            int chain3size = chains.get(2).getChain().getSize();
            if ((chain1size > 10 && chain2size > 10) || (chain2size > 10 && chain3size > 10) || (chain1size > 10 && chain3size > 10)) {
                deadtile = true;
            } else if ((chain1size > chain2size) && (chain1size > chain3size)) {
                chaincreated = chains.get(0).getChain();
                if (chain2size > chain3size) {
                    chaineaten = chains.get(1).getChain();
                    chaineaten1 = chains.get(2).getChain();
                    doublemerger = true;
                } else if (chain2size < chain3size) {
                    chaineaten = chains.get(2).getChain();
                    chaineaten1 = chains.get(1).getChain();
                    doublemerger = true;
                } else {
                    cantputpiece = true;
                }
            } else if ((chain2size > chain1size) && (chain2size > chain3size)) {
                chaincreated = chains.get(1).getChain();
                if (chain1size > chain3size) {
                    chaineaten = chains.get(0).getChain();
                    chaineaten1 = chains.get(2).getChain();
                    doublemerger = true;
                } else if (chain1size < chain3size) {
                    chaineaten = chains.get(2).getChain();
                    chaineaten1 = chains.get(0).getChain();
                    doublemerger = true;
                } else {
                    cantputpiece = true;
                }
            } else if ((chain3size > chain1size) && (chain3size > chain2size)) {
                chaincreated = chains.get(2).getChain();
                if (chain2size > chain1size) {
                    chaineaten = chains.get(1).getChain();
                    chaineaten1 = chains.get(0).getChain();
                    doublemerger = true;
                } else if (chain2size < chain1size) {
                    chaineaten = chains.get(0).getChain();
                    chaineaten1 = chains.get(1).getChain();
                    doublemerger = true;
                } else {
                    cantputpiece = true;
                }
            } else if ((chain1size == chain2size) && (chain1size == chain3size)) {
                cantputpiece = true;
            }
        }
    }

    public void handle4chains(ArrayList<Piece> chains) {
        Chain Chain1 = chains.get(0).getChain();
        Chain Chain2 = chains.get(1).getChain();
        Chain Chain3 = chains.get(2).getChain();
        Chain Chain4 = chains.get(3).getChain();
        int chain1size = Chain1.getSize();
        int chain2size = Chain2.getSize();
        int chain3size = Chain3.getSize();
        int chain4size = Chain4.getSize();
        if (Chain1.equals(Chain2) && Chain1.equals(Chain3) && Chain1.equals(Chain4)) {
            chaincreated = Chain1;
            addingToChain = true;
        } else if (Chain1.equals(Chain2) && Chain1.equals(Chain3)) {
            if (chain1size > 10 && chain4size > 10) {
                deadtile = true;
            } else {
                if (chain1size > chain4size) {
                    chaincreated = Chain1;
                    chaineaten = Chain4;
                    singlemerger = true;
                } else if (chain1size < chain4size) {
                    chaincreated = Chain4;
                    chaineaten = Chain1;
                    singlemerger = true;
                } else {
                    cantputpiece = true;
                }
            }
        } else if (Chain1.equals(Chain2) && Chain1.equals(Chain4)) {
            if (chain1size > 10 && chain3size > 10) {
                deadtile = true;
            } else {
                if (chain1size > chain3size) {
                    chaincreated = Chain1;
                    chaineaten = Chain3;
                    singlemerger = true;
                } else if (chain1size < chain3size) {
                    chaincreated = Chain3;
                    chaineaten = Chain1;
                    singlemerger = true;
                } else {
                    cantputpiece = true;
                }
            }
        } else if (Chain1.equals(Chain3) && Chain1.equals(Chain4)) {
            if (chain1size > 10 && chain4size > 10) {
                deadtile = true;
            } else {
                if (chain1size > chain2size) {
                    chaincreated = Chain1;
                    chaineaten = Chain2;
                    singlemerger = true;
                } else if (chain1size < chain2size) {
                    chaincreated = Chain2;
                    chaineaten = Chain1;
                    singlemerger = true;
                } else {
                    cantputpiece = true;
                }
            }
        } else if (Chain2.equals(Chain3) && Chain2.equals(Chain4)) {
            if (chain1size > 10 && chain4size > 10) {
                deadtile = true;
            } else {
                if (chain2size > chain1size) {
                    chaincreated = Chain2;
                    chaineaten = Chain1;
                    singlemerger = true;
                } else if (chain2size < chain1size) {
                    chaincreated = Chain1;
                    chaineaten = Chain2;
                    singlemerger = true;
                } else {
                    cantputpiece = true;
                }
            }
        } else if (Chain1.equals(Chain2)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(2));
            temp.add(chains.get(3));
            handle3chains(temp);
        } else if (Chain1.equals(Chain3)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(1));
            temp.add(chains.get(3));
            handle3chains(temp);
        } else if (Chain1.equals(Chain4)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(1));
            temp.add(chains.get(2));
            handle3chains(temp);
        } else if (Chain2.equals(Chain3)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(1));
            temp.add(chains.get(3));
            handle3chains(temp);
        } else if (Chain2.equals(Chain4)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(1));
            temp.add(chains.get(2));
            handle3chains(temp);
        } else if (Chain3.equals(Chain4)) {
            ArrayList<Piece> temp = new ArrayList<>();
            temp.add(chains.get(0));
            temp.add(chains.get(1));
            temp.add(chains.get(2));
            handle3chains(temp);
        } else {
            if ((chain1size > 10 && chain2size > 10) || (chain1size > 10 && chain3size > 10) || (chain1size > 10 && chain4size > 10) || (chain2size > 10 && chain3size > 10) || (chain2size > 10 && chain4size > 10) || (chain3size > 10 && chain4size > 10)) {
                deadtile = true;
            } else if ((chain1size > chain2size) && (chain1size > chain3size) && (chain1size > chain4size)){
                chaincreated = Chain1;
                if ((chain2size > chain3size) && (chain2size > chain4size)) {
                    chaineaten = Chain2;
                    if (chain3size > chain4size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain3size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain3size > chain2size) && (chain3size > chain4size)) {
                    chaineaten = Chain3;
                    if (chain2size > chain4size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain2size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain4size > chain2size) && (chain4size > chain3size)) {
                    chaineaten = Chain4;
                    if (chain2size > chain3size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else if (chain2size < chain3size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else {
                    cantputpiece = true;
                }
            } else if ((chain2size > chain1size) && (chain2size > chain3size) && (chain2size > chain4size)) {
                chaincreated = Chain2;
                if ((chain1size > chain3size) && (chain1size > chain4size)) {
                    chaineaten = Chain1;
                    if (chain3size > chain4size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain3size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain3size > chain1size) && (chain3size > chain4size)) {
                    chaineaten = Chain3;
                    if (chain1size > chain4size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain1size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain4size > chain1size) && (chain4size > chain3size)) {
                    chaineaten = Chain4;
                    if (chain1size > chain3size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else if (chain1size < chain3size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else {
                    cantputpiece = true;
                }
            } else if ((chain3size > chain1size) && (chain3size > chain2size) && (chain3size > chain4size)) {
                chaincreated = Chain3;
                if ((chain1size > chain2size) && (chain1size > chain4size)) {
                    chaineaten = Chain1;
                    if (chain2size > chain4size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain2size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain2size > chain1size) && (chain2size > chain4size)) {
                    chaineaten = Chain2;
                    if (chain1size > chain4size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain4;
                        triplemerger = true;
                    } else if (chain1size < chain4size) {
                        chaineaten1 = Chain4;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain4size > chain1size) && (chain4size > chain2size)) {
                    chaineaten = Chain4;
                    if (chain1size > chain2size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else if (chain1size < chain2size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else {
                    cantputpiece = true;
                }
            } else if ((chain4size > chain1size) && (chain4size > chain2size) && (chain4size > chain3size)) {
                chaincreated = Chain4;
                if ((chain1size > chain2size) && (chain1size > chain3size)) {
                    chaineaten = Chain1;
                    if (chain2size > chain3size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else if (chain2size < chain3size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain2size > chain1size) && (chain2size > chain3size)) {
                    chaineaten = Chain2;
                    if (chain1size > chain3size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain3;
                        triplemerger = true;
                    } else if (chain1size < chain3size) {
                        chaineaten1 = Chain3;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else if ((chain3size > chain1size) && (chain3size > chain2size)) {
                    chaineaten = Chain3;
                    if (chain1size > chain2size) {
                        chaineaten1 = Chain1;
                        chaineaten2 = Chain2;
                        triplemerger = true;
                    } else if (chain1size < chain2size) {
                        chaineaten1 = Chain2;
                        chaineaten2 = Chain1;
                        triplemerger = true;
                    } else {
                        cantputpiece = true;
                    }
                } else {
                    cantputpiece = true;
                }
            } else {
                cantputpiece = true;
            }
        }
    }

    public void nonmergechangePieces() {
        for (Piece piece : emptypieces) {
            piece.setChain(chaincreated);
            chaincreated.setSize(chaincreated.getSize() + 1);
        }
        pieceput.setChain(chaincreated);
        chaincreated.setSize(chaincreated.getSize() + 1);
    }

    public void mergechainPieces() {
        tempboard = board.getBoard();
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 12; y++) {
                if (tempboard[x][y].getChain().equals(chaineaten)) {
                    tempboard[x][y].setChain(chaincreated);
                    chaincreated.setSize(chaincreated.getSize() + 1);
                }
            }
        }
        chaineaten.setSize(0);
        board.setBoard(tempboard);
    }

    public void updatePieces() {
        if (!cantputpiece) {
            if (chainmustbecreated) {
                nonmergechangePieces();
                if (chaincreated.getAvailable() > 0) {
                    if (currentplayer.equals(Players.Player1)) {
                        chaincreated.setPlayer1(chaincreated.getPlayer1() + 1);
                    } else if (currentplayer.equals(Players.Player2)) {
                        chaincreated.setPlayer2(chaincreated.getPlayer2() + 1);
                    }
                }
                numofchains += 1;
                chainsonboard.add(chaincreated);
            } else if (addingToChain) {
                nonmergechangePieces();
            } else if (deadtile) {
                pieceput.setChain(Chain.DEAD);
            } else if (singlemerger) {
                mergechainPieces();
                nonmergechangePieces();
                numofchains -= 1;
                chainsonboard.remove(chaineaten);
            } else if (doublemerger && !triplemerger) {
                mergechainPieces();
                nonmergechangePieces();
                chainsonboard.remove(chaineaten);
                chaineaten = chaineaten1;
                numofchains -= 1;
                singlemerger = true;
                doublemerger = false;
            } else if (triplemerger) {
                mergechainPieces();
                nonmergechangePieces();
                chainsonboard.remove(chaineaten);
                chaineaten = chaineaten1;
                chaineaten1 = chaineaten2;
                numofchains -= 1;
                doublemerger = true;
                triplemerger = false;
            }
            tempboard[pieceput.getX()][pieceput.getY()] = pieceput;
            board.setBoard(tempboard);
            int randompiece = random.nextInt(temppile.size());
            currenthand.set(indexofpieceput, temppile.remove(randompiece));
            currentplayer.setHand(currenthand);
            pile.setPile(temppile);
            System.out.println(numofchains);
        } else {
            updateAllValues();
        }
    }

    public void updateBoard() {
        piecestoupdate = new ArrayList<>();
        tempboard = board.getBoard();
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 12; y++) {
                if (!(tempboard[x][y].equals(Piece.NONE))) {
                    piecestoupdate.add(tempboard[x][y]);
                }
            }
        }
    }

    public void mergePayouts(Chain chosen) {
        if (chosen.getPlayer1() > chosen.getPlayer2()) {
            Players.Player1.setCash(Players.Player1.getCash() + chosen.getMajority());
            if (chosen.getPlayer2() > 0) {
                Players.Player2.setCash(Players.Player2.getCash() + chosen.getMinority());
            } else {
                Players.Player1.setCash(Players.Player1.getCash() + chosen.getMinority());
            }
        } else if (chosen.getPlayer1() < chosen.getPlayer2()) {
            Players.Player2.setCash(Players.Player2.getCash() + chosen.getMajority());
            if (chosen.getPlayer1() > 0) {
                Players.Player1.setCash(Players.Player1.getCash() + chosen.getMinority());
            } else {
                Players.Player2.setCash(Players.Player2.getCash() + chosen.getMinority());
            }
        } else if (chosen.getPlayer1() == chosen.getPlayer2()) {
            if (chosen.getPlayer1() != 0) {
                double temppayout = (double) (chosen.getMajority() / 2) / 1000;
                temppayout = Math.ceil(temppayout);
                int eachpayout = (int) (temppayout * 1000);
                Players.Player1.setCash(Players.Player1.getCash() + eachpayout);
                Players.Player2.setCash(Players.Player2.getCash() + eachpayout);
            }
        }
    }

    public void sellAllStocks(Chain chosen) {
        Players.Player1.setCash(Players.Player1.getCash() + (chosen.getPlayer1() * chosen.getCost() * 100));
        Players.Player2.setCash(Players.Player2.getCash() + (chosen.getPlayer2() * chosen.getCost() * 100));
        mergePayouts(chosen);
    }

    public void handleDispose(int keep, int trade, int sell) {
        currentdisposer.setCash(currentdisposer.getCash() + (sell * chaineaten.getCost() * 100));
        if (currentdisposer == Players.Player1) {
            chaineaten.setPlayer1(keep);
            chaincreated.setPlayer1(chaincreated.getPlayer1() + trade);
        } else if (currentdisposer == Players.Player2) {
            chaineaten.setPlayer2(keep);
            chaincreated.setPlayer2(chaincreated.getPlayer2() + trade);
        }
        switchdisposer();
    }

    public void switchturns() {
        if (currentplayer.equals(Players.Player1)) {
            currentplayer = Players.Player2;
            currentdisposer = Players.Player2;
        } else if (currentplayer.equals(Players.Player2)) {
            currentplayer = Players.Player1;
            currentdisposer = Players.Player1;
        }
        updateAllValues();
    }

    public void switchdisposer() {
        if (currentdisposer.equals(Players.Player1)) {
            currentdisposer = Players.Player2;
        } else if (currentplayer.equals(Players.Player2)) {
            currentdisposer = Players.Player1;
        }
    }

    public Chain getChaineaten() {
        return chaineaten;
    }

    public Players getCurrentdisposer() {
        return currentdisposer;
    }

    public Players getCurrentplayer() {
        return currentplayer;
    }

    public Boolean getChainmustbecreated() {
        return chainmustbecreated;
    }

    public Boolean getChainmergemustbepicked() {
        return chainmergemustbepicked;
    }

    public Boolean getDoublemergermustbepicked() {
        return doublemergermustbepicked;
    }

    public Boolean getTriplemergermustbepicked() {
        return triplemergermustbepicked;
    }

    public void setChainCreated(Chain chain) {
        chaincreated = chain;
    }

    public Boolean getSinglemerger() {
        return singlemerger;
    }

    public Boolean getDoublemerger() {
        return doublemerger;
    }

    public Boolean getTriplemerger() {
        return triplemerger;
    }

    public ArrayList<Piece> getPiecestoupdate() {
        return piecestoupdate;
    }

    public Boolean getCantputpiece() {
        return cantputpiece;
    }

    public ArrayList<Chain> getChainsonboard() {
        return chainsonboard;
    }
}
