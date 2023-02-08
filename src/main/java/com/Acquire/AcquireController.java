package com.Acquire;

import com.Acquire.core.Chain;
import com.Acquire.core.Game;
import com.Acquire.core.Piece;
import com.Acquire.core.Players;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AcquireController {

    @FXML
    TextField response;
    @FXML
    Button submit;
    @FXML
    TextArea chat;
    @FXML
    TextField Turn;
    @FXML
    TextField cashplayer1, cashplayer2, netplayer1, netplayer2;
    @FXML
    TextField graphL, graphT, graphA, graphF, graphW, graphC, graphI;
    @FXML
    TextField luxorplayer1, towerplayer1, americanplayer1, festivalplayer1, westernplayer1, continentalplayer1, imperialplayer1;
    @FXML
    TextField luxorplayer2, towerplayer2, americanplayer2, festivalplayer2, westernplayer2, continentalplayer2, imperialplayer2;
    @FXML
    TextField luxoravailable, toweravailable, americanavailable, festivalavailable, westernavailable, continentalavailable, imperialavailable;
    @FXML
    TextField luxorsize, towersize, americansize, festivalsize, westernsize, continentalsize, imperialsize;
    @FXML
    TextField luxorcost, towercost, americancost, festivalcost, westerncost, continentalcost, imperialcost;
    @FXML
    Button tile0, tile1, tile2, tile3, tile4, tile5;
    @FXML
    TextField A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12;
    @FXML
    TextField B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12;
    @FXML
    TextField C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12;
    @FXML
    TextField D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12;
    @FXML
    TextField E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12;
    @FXML
    TextField F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12;
    @FXML
    TextField G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11, G12;
    @FXML
    TextField H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12;
    @FXML
    TextField I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12;
    @FXML
    TextField cart0, cart1, cart2;
    @FXML
    TextField Tradenum, Keepnum, Sellnum, Totalnum, Mergename;
    Map<String, TextField> boardspaces = new HashMap<>();
    ArrayList<Chain> cart = new ArrayList<>();
    int carttotal = 0;
    int numitems = 0;
    int totalkeep = 0;
    int totaltrade = 0;
    int totalsell = 0;
    int totalstocks = 0;
    int totalstocktemp = 0;
    int disposenum = 0;
    Boolean stageput;
    Boolean stagemerge;
    Boolean stagebuy;
    Boolean stageswitchturns;
    Chain dispose;
    Game acquire;

    public void startgame() {
        stageput = true;
        stagebuy = false;
        stagemerge = false;
        stageswitchturns = false;
        acquire = new Game();
        acquire.initvalues();
        acquire.updateAllValues();
        createBoardSpaces();
        resetBoard();
        updateGameGraphs();
        acquire.drawhands();
        updateHand(acquire.getCurrentplayer().getHand());
        Turn.setText(acquire.getCurrentplayer().toString());
    }

    public void put(Event event) {
        if (stageput) {
            Button button = (Button) event.getSource();
            int index = Integer.parseInt(button.getId().substring(4));
            acquire.put(index);
            if (!acquire.getCantputpiece()) {
                stageput = !stageput;
                stagebuy = true;
            }
            setChatbox();
            updateGameGraphs();
        }
    }

    public void setChatbox() {
        if (acquire.getChainmustbecreated()) {
            chat.setText("Please type the hotel chain you would like to start. (A, C, etc.)");
            stagebuy = false;
        } else if (acquire.getSinglemerger()) {
            chat.setText("There is a merger, please dispose of shares.");
            acquire.mergePayouts(acquire.getChaineaten());
            stagemerge = true;
            disposenum = 0;
            Chain dispose = acquire.getChaineaten();
            if (acquire.getCurrentdisposer() == Players.Player1) {
                totalstocks = dispose.getPlayer1();
                totalstocktemp = dispose.getPlayer1();
            } else {
                totalstocks = dispose.getPlayer2();
                totalstocktemp = dispose.getPlayer2();
            }
            disposeUpdate();
            updateGameGraphs();
        } else if (acquire.getDoublemerger()) {
            chat.setText("There is a double merger, please dispose of shares.");
            acquire.mergePayouts(acquire.getChaineaten());
            stagemerge = true;
            disposenum = 0;
            Chain dispose = acquire.getChaineaten();
            if (acquire.getCurrentdisposer() == Players.Player1) {
                totalstocks = dispose.getPlayer1();
                totalstocktemp = dispose.getPlayer1();
            } else {
                totalstocks = dispose.getPlayer2();
                totalstocktemp = dispose.getPlayer2();
            }
            disposeUpdate();
            updateGameGraphs();
        } else if (acquire.getTriplemerger()) {
            chat.setText("There is a triple merger, please dispose of shares.");
            acquire.mergePayouts(acquire.getChaineaten());
            stagemerge = true;
            disposenum = 0;
            Chain dispose = acquire.getChaineaten();
            if (acquire.getCurrentdisposer() == Players.Player1) {
                totalstocks = dispose.getPlayer1();
                totalstocktemp = dispose.getPlayer1();
            } else {
                totalstocks = dispose.getPlayer2();
                totalstocktemp = dispose.getPlayer2();
            }
            disposeUpdate();
            updateGameGraphs();
        } else {
            if (!acquire.getCantputpiece()) {
                acquire.updatePieces();
                acquire.updateBoard();
                updateBoard();
                updateGameGraphs();
                updateHand(acquire.getCurrentplayer().getHand());
                chat.setText("Please buy stocks using the buttons below, if no stocks are available or you don't want to buy click checkout.");
            } else {
                chat.setText("You can't put that piece there");
            }
        }
    }

    public void newChain() {
        if (acquire.getChainmustbecreated()) {
            if (response.getText().equals(Chain.L.toString())) {
                whichChain(Chain.L);
            } else if (response.getText().equals(Chain.T.toString())) {
                whichChain(Chain.T);
            } else if (response.getText().equals(Chain.A.toString())) {
                whichChain(Chain.A);
            } else if (response.getText().equals(Chain.F.toString())) {
                whichChain(Chain.F);
            } else if (response.getText().equals(Chain.W.toString())) {
                whichChain(Chain.W);
            } else if (response.getText().equals(Chain.C.toString())) {
                whichChain(Chain.C);
            } else if (response.getText().equals(Chain.I.toString())) {
                whichChain(Chain.I);
            } else {
                chat.setText("Invalid choice.");
            }
        }
    }

    public void dispose(Event event) {
        if (stagemerge) {
            if (acquire.getSinglemerger()) {
                Button button = (Button) event.getSource();
                String buttonId = button.getId();
                disposeUpdate();
                if (buttonId.equals("Keep")) {
                    if (totalstocks > 0) {
                        totalkeep += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Trade")) {
                    if (totalstocks > 1) {
                        totaltrade += 1;
                        totalstocks = totalstocks - 2;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Sell")) {
                    if (totalstocks > 0) {
                        totalsell += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("MergeClear")) {
                    resetDisposeValues();
                    if (acquire.getCurrentdisposer() == Players.Player1) {
                        totalstocks = dispose.getPlayer1();
                        totalstocktemp = dispose.getPlayer1();
                    } else {
                        totalstocks = dispose.getPlayer2();
                        totalstocktemp = dispose.getPlayer2();
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Done")) {
                    if ((totalkeep + totalsell + (totaltrade * 2)) == totalstocktemp) {
                        acquire.handleDispose(totalkeep, totaltrade, totalsell);
                        resetDisposeValues();
                        protecthand();
                        if (disposenum == 0) {
                            chat.setText("The other player must now dispose of all shares.");
                            if (acquire.getCurrentdisposer() == Players.Player1) {
                                totalstocks = dispose.getPlayer1();
                                totalstocktemp = dispose.getPlayer1();
                            } else if (acquire.getCurrentdisposer() == Players.Player2){
                                totalstocks = dispose.getPlayer2();
                                totalstocktemp = dispose.getPlayer2();
                            }
                            disposenum = 1;
                        } else {
                            stagemerge = !stagemerge;
                            chat.setText("All mergers are now finished");
                            mergeUpdate();
                            stagebuy = true;
                        }
                        disposeUpdate();
                        updateGameGraphs();
                    } else {
                        chat.setText("Please dispose of all shares.");
                    }
                }
            } else if (acquire.getDoublemerger()) {
                Button button = (Button) event.getSource();
                String buttonId = button.getId();
                disposeUpdate();
                if (buttonId.equals("Keep")) {
                    if (totalstocks > 0) {
                        totalkeep += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Trade")) {
                    if (totalstocks > 1) {
                        totaltrade += 1;
                        totalstocks = totalstocks - 2;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Sell")) {
                    if (totalstocks > 0) {
                        totalsell += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("MergeClear")) {
                    resetDisposeValues();
                    if (acquire.getCurrentdisposer() == Players.Player1) {
                        totalstocks = dispose.getPlayer1();
                        totalstocktemp = dispose.getPlayer1();
                    } else {
                        totalstocks = dispose.getPlayer2();
                        totalstocktemp = dispose.getPlayer2();
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Done")) {
                    if ((totalkeep + totalsell + (totaltrade * 2)) == totalstocktemp) {
                        acquire.handleDispose(totalkeep, totaltrade, totalsell);
                        resetDisposeValues();
                        protecthand();
                        if (disposenum == 0) {
                            chat.setText("The other player must now dispose of all shares.");
                            if (acquire.getCurrentdisposer() == Players.Player1) {
                                totalstocks = dispose.getPlayer1();
                                totalstocktemp = dispose.getPlayer1();
                            } else if (acquire.getCurrentdisposer() == Players.Player2){
                                totalstocks = dispose.getPlayer2();
                                totalstocktemp = dispose.getPlayer2();
                            }
                            disposenum = 1;
                        } else {
                            acquire.updatePieces();
                            resetDisposeValues();
                            if (acquire.getCurrentdisposer() == Players.Player1) {
                                totalstocks = dispose.getPlayer1();
                                totalstocktemp = dispose.getPlayer1();
                            } else if (acquire.getCurrentdisposer() == Players.Player2){
                                totalstocks = dispose.getPlayer2();
                                totalstocktemp = dispose.getPlayer2();
                            }
                            mergeUpdate();
                            chat.setText("The first merger is now finished.");
                            disposenum = 0;
                        }
                        disposeUpdate();
                        updateGameGraphs();
                    } else {
                        chat.setText("Please dispose of all shares.");
                    }
                }
            } else if (acquire.getTriplemerger()) {
                Button button = (Button) event.getSource();
                String buttonId = button.getId();
                disposeUpdate();
                if (buttonId.equals("Keep")) {
                    if (totalstocks > 0) {
                        totalkeep += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Trade")) {
                    if (totalstocks > 1) {
                        totaltrade += 1;
                        totalstocks = totalstocks - 2;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Sell")) {
                    if (totalstocks > 0) {
                        totalsell += 1;
                        totalstocks = totalstocks - 1;
                    }
                    disposeUpdate();
                } else if (buttonId.equals("MergeClear")) {
                    resetDisposeValues();
                    if (acquire.getCurrentdisposer() == Players.Player1) {
                        totalstocks = dispose.getPlayer1();
                        totalstocktemp = dispose.getPlayer1();
                    } else {
                        totalstocks = dispose.getPlayer2();
                        totalstocktemp = dispose.getPlayer2();
                    }
                    disposeUpdate();
                } else if (buttonId.equals("Done")) {
                    if ((totalkeep + totalsell + (totaltrade * 2)) == totalstocktemp) {
                        acquire.handleDispose(totalkeep, totaltrade, totalsell);
                        resetDisposeValues();
                        protecthand();
                        if (disposenum == 0) {
                            chat.setText("The other player must now dispose of all shares.");
                            if (acquire.getCurrentdisposer() == Players.Player1) {
                                totalstocks = dispose.getPlayer1();
                                totalstocktemp = dispose.getPlayer1();
                            } else if (acquire.getCurrentdisposer() == Players.Player2){
                                totalstocks = dispose.getPlayer2();
                                totalstocktemp = dispose.getPlayer2();
                            }
                            disposenum = 1;
                        } else {
                            acquire.updatePieces();
                            resetDisposeValues();
                            if (acquire.getCurrentdisposer() == Players.Player1) {
                                totalstocks = dispose.getPlayer1();
                                totalstocktemp = dispose.getPlayer1();
                            } else if (acquire.getCurrentdisposer() == Players.Player2){
                                totalstocks = dispose.getPlayer2();
                                totalstocktemp = dispose.getPlayer2();
                            }
                            mergeUpdate();
                            chat.setText("The second merger is now finished.");
                            disposenum = 0;
                        }
                        disposeUpdate();
                        updateGameGraphs();
                    } else {
                        chat.setText("Please dispose of all shares.");
                    }
                }
            }
        }
    }

    public void resetDisposeValues() {
        dispose = acquire.getChaineaten();
        totalkeep = 0;
        totalstocks = 0;
        totaltrade = 0;
        totalsell = 0;
        totalstocktemp = 0;
    }

    public void mergeUpdate() {
        acquire.updatePieces();
        acquire.updateBoard();
        updateBoard();
        updateGameGraphs();
    }

    public void disposeUpdate() {
        Keepnum.setText(String.valueOf(totalkeep));
        Tradenum.setText(String.valueOf(totaltrade));
        Sellnum.setText(String.valueOf(totalsell));
        Totalnum.setText(String.valueOf(totalstocks));
        Mergename.setText(acquire.getChaineaten().toString());
    }

    public void buyStock(Event event){
        if (stagebuy) {
            if (!stagemerge) {
                Button button = (Button) event.getSource();
                String buttonId = button.getId();
                if (buttonId.equals(Chain.L.toString())) {
                    whichBuy(Chain.L);
                }
                if (buttonId.equals(Chain.T.toString())) {
                    whichBuy(Chain.T);
                }
                if (buttonId.equals(Chain.A.toString())) {
                    whichBuy(Chain.A);
                }
                if (buttonId.equals(Chain.F.toString())) {
                    whichBuy(Chain.F);
                }
                if (buttonId.equals(Chain.W.toString())) {
                    whichBuy(Chain.W);
                }
                if (buttonId.equals(Chain.C.toString())) {
                    whichBuy(Chain.C);
                }
                if (buttonId.equals(Chain.I.toString())) {
                    whichBuy(Chain.I);
                }
                if (buttonId.equals("Clear")) {
                    resetCart();
                }
                if (buttonId.equals("Checkout")) {
                    acquire.buyStock(cart, carttotal);
                    resetCart();
                    updateCart();
                    updateGameGraphs();
                    chat.setText("Please hit the switch turns button after the other player has switched.");
                    protecthand();
                    stagebuy = !stagebuy;
                    stageswitchturns = true;
                }
            }
        }
    }

    public void switchturns(){
        if (stageswitchturns) {
            acquire.switchturns();
            updateHand(acquire.getCurrentplayer().getHand());
            Turn.setText(acquire.getCurrentplayer().toString());
            stageswitchturns = !stageswitchturns;
            stageput = true;
        }
    }

    public void protecthand() {
        tile0.setText("");
        tile1.setText("");
        tile2.setText("");
        tile3.setText("");
        tile4.setText("");
        tile5.setText("");
    }

    public void resetBoard() {
        for (Map.Entry<String, TextField> entry : boardspaces.entrySet()) {
            TextField space = entry.getValue();
            String fxid = space.getId();
            String letter = "";
            String number = "";
            if (fxid.length() == 2) {
                letter = fxid.substring(0,1);
                number = fxid.substring(1,2);
            } else if (fxid.length() == 3) {
                letter = fxid.substring(0,1);
                number = fxid.substring(1,3);
            }
            String tiletext = letter + " - " + number;
            space.setText(tiletext);
            space.setBackground(Piece.NONE.getChain().getBackground());
            space.setBorder(Piece.NONE.getChain().getBorder());
        }
        graphL.setBackground(Chain.L.getBackground());
        graphL.setBorder(Chain.L.getBorder());
        graphT.setBackground(Chain.T.getBackground());
        graphT.setBorder(Chain.T.getBorder());
        graphA.setBackground(Chain.A.getBackground());
        graphA.setBorder(Chain.A.getBorder());
        graphF.setBackground(Chain.F.getBackground());
        graphF.setBorder(Chain.F.getBorder());
        graphW.setBackground(Chain.W.getBackground());
        graphW.setBorder(Chain.W.getBorder());
        graphC.setBackground(Chain.C.getBackground());
        graphC.setBorder(Chain.C.getBorder());
        graphI.setBackground(Chain.I.getBackground());
        graphI.setBorder(Chain.I.getBorder());
    }

    public void whichBuy(Chain chosen) {
        if (cart.size() < 4) {
            if ((acquire.getCurrentplayer().getCash() - (carttotal + (chosen.getCost() * 100))) >= 0) {
                if (chosen.getAvailable() > 0) {
                    if (chosen.getSize() > 0) {
                        cart.add(chosen);
                        carttotal += (chosen.getCost() * 100);
                        updateCart();
                    }
                }
            }
        }
    }

    public void resetCart() {
        cart = new ArrayList<>();
        carttotal = 0;
        numitems = 0;
        updateCart();
    }

    public void updateCart() {
        if (cart.size() > 0) {
            if (cart.size() == 1) {
                cart0.setText(cart.get(0).toString());
            } else if (cart.size() == 2) {
                cart0.setText(cart.get(0).toString());
                cart1.setText(cart.get(1).toString());
            } else if (cart.size() == 3) {
                cart0.setText(cart.get(0).toString());
                cart1.setText(cart.get(1).toString());
                cart2.setText(cart.get(2).toString());
            }
        } else {
            cart0.setText("");
            cart1.setText("");
            cart2.setText("");
        }
    }


    public void whichChain(Chain chosen) {
        ArrayList<Chain> chainsonboard = acquire.getChainsonboard();
        if (!chainsonboard.contains(chosen)) {
            acquire.setChainCreated(chosen);
            chat.setText("You started hotel chain " + chosen.toString());
            acquire.updatePieces();
            acquire.updateBoard();
            updateBoard();
            updateGameGraphs();
            updateHand(acquire.getCurrentplayer().getHand());
            stagebuy = true;
        } else {
            chat.setText("That chain is already on the board.");
        }
    }

    public void endGame() {
        stageput = false;
        stagebuy = false;
        stageswitchturns = false;
        stagemerge = false;
        acquire.sellAllStocks(Chain.L);
        acquire.sellAllStocks(Chain.T);
        acquire.sellAllStocks(Chain.A);
        acquire.sellAllStocks(Chain.F);
        acquire.sellAllStocks(Chain.W);
        acquire.sellAllStocks(Chain.C);
        acquire.sellAllStocks(Chain.I);
        updateGameGraphs();
        if (Players.Player1.getNet() > Players.Player2.getNet()) {
            chat.setText("Player 1 won the game.");
        } else {
            chat.setText("Player 2 won the game.");
        }
    }

    public void updateBoard() {
        for (Piece piece : acquire.getPiecestoupdate()) {
            TextField update = boardspaces.get(piece.toString());
            update.setText(piece.getChain().toString());
            update.setBackground(piece.getChain().getBackground());
            update.setBorder(piece.getChain().getBorder());
        }
    }

    public void updateHand(ArrayList<Piece> hand) {
        tile0.setText(hand.get(0).toString());
        tile1.setText(hand.get(1).toString());
        tile2.setText(hand.get(2).toString());
        tile3.setText(hand.get(3).toString());
        tile4.setText(hand.get(4).toString());
        tile5.setText(hand.get(5).toString());
    }

    public void updateGameGraphs() {
        luxorplayer1.setText(String.valueOf(Chain.L.getPlayer1()));
        towerplayer1.setText(String.valueOf(Chain.T.getPlayer1()));
        americanplayer1.setText(String.valueOf(Chain.A.getPlayer1()));
        festivalplayer1.setText(String.valueOf(Chain.F.getPlayer1()));
        westernplayer1.setText(String.valueOf(Chain.W.getPlayer1()));
        continentalplayer1.setText(String.valueOf(Chain.C.getPlayer1()));
        imperialplayer1.setText(String.valueOf(Chain.I.getPlayer1()));
        luxorplayer2.setText(String.valueOf(Chain.L.getPlayer2()));
        towerplayer2.setText(String.valueOf(Chain.T.getPlayer2()));
        americanplayer2.setText(String.valueOf(Chain.A.getPlayer2()));
        festivalplayer2.setText(String.valueOf(Chain.F.getPlayer2()));
        westernplayer2.setText(String.valueOf(Chain.W.getPlayer2()));
        continentalplayer2.setText(String.valueOf(Chain.C.getPlayer2()));
        imperialplayer2.setText(String.valueOf(Chain.I.getPlayer2()));
        luxoravailable.setText(String.valueOf(Chain.L.getAvailable()));
        toweravailable.setText(String.valueOf(Chain.T.getAvailable()));
        americanavailable.setText(String.valueOf(Chain.A.getAvailable()));
        festivalavailable.setText(String.valueOf(Chain.F.getAvailable()));
        westernavailable.setText(String.valueOf(Chain.W.getAvailable()));
        continentalavailable.setText(String.valueOf(Chain.C.getAvailable()));
        imperialavailable.setText(String.valueOf(Chain.I.getAvailable()));
        luxorsize.setText(String.valueOf(Chain.L.getSize()));
        towersize.setText(String.valueOf(Chain.T.getSize()));
        americansize.setText(String.valueOf(Chain.A.getSize()));
        festivalsize.setText(String.valueOf(Chain.F.getSize()));
        westernsize.setText(String.valueOf(Chain.W.getSize()));
        continentalsize.setText(String.valueOf(Chain.C.getSize()));
        imperialsize.setText(String.valueOf(Chain.I.getSize()));
        luxorcost.setText(String.valueOf(Chain.L.getCost()));
        towercost.setText(String.valueOf(Chain.T.getCost()));
        americancost.setText(String.valueOf(Chain.A.getCost()));
        westerncost.setText(String.valueOf(Chain.F.getCost()));
        festivalcost.setText(String.valueOf(Chain.W.getCost()));
        continentalcost.setText(String.valueOf(Chain.C.getCost()));
        imperialcost.setText(String.valueOf(Chain.I.getCost()));
        cashplayer1.setText(String.valueOf(Players.Player1.getCash()));
        netplayer1.setText(String.valueOf(Players.Player1.getNet()));
        cashplayer2.setText(String.valueOf(Players.Player2.getCash()));
        netplayer2.setText(String.valueOf(Players.Player2.getNet()));
    }

    public void createBoardSpaces() {
        boardspaces.put(Piece.A1.toString(), A1);
        boardspaces.put(Piece.A2.toString(), A2);
        boardspaces.put(Piece.A3.toString(), A3);
        boardspaces.put(Piece.A4.toString(), A4);
        boardspaces.put(Piece.A5.toString(), A5);
        boardspaces.put(Piece.A6.toString(), A6);
        boardspaces.put(Piece.A7.toString(), A7);
        boardspaces.put(Piece.A8.toString(), A8);
        boardspaces.put(Piece.A9.toString(), A9);
        boardspaces.put(Piece.A10.toString(), A10);
        boardspaces.put(Piece.A11.toString(), A11);
        boardspaces.put(Piece.A12.toString(), A12);
        boardspaces.put(Piece.B1.toString(), B1);
        boardspaces.put(Piece.B2.toString(), B2);
        boardspaces.put(Piece.B3.toString(), B3);
        boardspaces.put(Piece.B4.toString(), B4);
        boardspaces.put(Piece.B5.toString(), B5);
        boardspaces.put(Piece.B6.toString(), B6);
        boardspaces.put(Piece.B7.toString(), B7);
        boardspaces.put(Piece.B8.toString(), B8);
        boardspaces.put(Piece.B9.toString(), B9);
        boardspaces.put(Piece.B10.toString(), B10);
        boardspaces.put(Piece.B11.toString(), B11);
        boardspaces.put(Piece.B12.toString(), B12);
        boardspaces.put(Piece.C1.toString(), C1);
        boardspaces.put(Piece.C2.toString(), C2);
        boardspaces.put(Piece.C3.toString(), C3);
        boardspaces.put(Piece.C4.toString(), C4);
        boardspaces.put(Piece.C5.toString(), C5);
        boardspaces.put(Piece.C6.toString(), C6);
        boardspaces.put(Piece.C7.toString(), C7);
        boardspaces.put(Piece.C8.toString(), C8);
        boardspaces.put(Piece.C9.toString(), C9);
        boardspaces.put(Piece.C10.toString(), C10);
        boardspaces.put(Piece.C11.toString(), C11);
        boardspaces.put(Piece.C12.toString(), C12);
        boardspaces.put(Piece.D1.toString(), D1);
        boardspaces.put(Piece.D2.toString(), D2);
        boardspaces.put(Piece.D3.toString(), D3);
        boardspaces.put(Piece.D4.toString(), D4);
        boardspaces.put(Piece.D5.toString(), D5);
        boardspaces.put(Piece.D6.toString(), D6);
        boardspaces.put(Piece.D7.toString(), D7);
        boardspaces.put(Piece.D8.toString(), D8);
        boardspaces.put(Piece.D9.toString(), D9);
        boardspaces.put(Piece.D10.toString(), D10);
        boardspaces.put(Piece.D11.toString(), D11);
        boardspaces.put(Piece.D12.toString(), D12);
        boardspaces.put(Piece.E1.toString(), E1);
        boardspaces.put(Piece.E2.toString(), E2);
        boardspaces.put(Piece.E3.toString(), E3);
        boardspaces.put(Piece.E4.toString(), E4);
        boardspaces.put(Piece.E5.toString(), E5);
        boardspaces.put(Piece.E6.toString(), E6);
        boardspaces.put(Piece.E7.toString(), E7);
        boardspaces.put(Piece.E8.toString(), E8);
        boardspaces.put(Piece.E9.toString(), E9);
        boardspaces.put(Piece.E10.toString(), E10);
        boardspaces.put(Piece.E11.toString(), E11);
        boardspaces.put(Piece.E12.toString(), E12);
        boardspaces.put(Piece.F1.toString(), F1);
        boardspaces.put(Piece.F2.toString(), F2);
        boardspaces.put(Piece.F3.toString(), F3);
        boardspaces.put(Piece.F4.toString(), F4);
        boardspaces.put(Piece.F5.toString(), F5);
        boardspaces.put(Piece.F6.toString(), F6);
        boardspaces.put(Piece.F7.toString(), F7);
        boardspaces.put(Piece.F8.toString(), F8);
        boardspaces.put(Piece.F9.toString(), F9);
        boardspaces.put(Piece.F10.toString(), F10);
        boardspaces.put(Piece.F11.toString(), F11);
        boardspaces.put(Piece.F12.toString(), F12);
        boardspaces.put(Piece.G1.toString(), G1);
        boardspaces.put(Piece.G2.toString(), G2);
        boardspaces.put(Piece.G3.toString(), G3);
        boardspaces.put(Piece.G4.toString(), G4);
        boardspaces.put(Piece.G5.toString(), G5);
        boardspaces.put(Piece.G6.toString(), G6);
        boardspaces.put(Piece.G7.toString(), G7);
        boardspaces.put(Piece.G8.toString(), G8);
        boardspaces.put(Piece.G9.toString(), G9);
        boardspaces.put(Piece.G10.toString(), G10);
        boardspaces.put(Piece.G11.toString(), G11);
        boardspaces.put(Piece.G12.toString(), G12);
        boardspaces.put(Piece.H1.toString(), H1);
        boardspaces.put(Piece.H2.toString(), H2);
        boardspaces.put(Piece.H3.toString(), H3);
        boardspaces.put(Piece.H4.toString(), H4);
        boardspaces.put(Piece.H5.toString(), H5);
        boardspaces.put(Piece.H6.toString(), H6);
        boardspaces.put(Piece.H7.toString(), H7);
        boardspaces.put(Piece.H8.toString(), H8);
        boardspaces.put(Piece.H9.toString(), H9);
        boardspaces.put(Piece.H10.toString(), H10);
        boardspaces.put(Piece.H11.toString(), H11);
        boardspaces.put(Piece.H12.toString(), H12);
        boardspaces.put(Piece.I1.toString(), I1);
        boardspaces.put(Piece.I2.toString(), I2);
        boardspaces.put(Piece.I3.toString(), I3);
        boardspaces.put(Piece.I4.toString(), I4);
        boardspaces.put(Piece.I5.toString(), I5);
        boardspaces.put(Piece.I6.toString(), I6);
        boardspaces.put(Piece.I7.toString(), I7);
        boardspaces.put(Piece.I8.toString(), I8);
        boardspaces.put(Piece.I9.toString(), I9);
        boardspaces.put(Piece.I10.toString(), I10);
        boardspaces.put(Piece.I11.toString(), I11);
        boardspaces.put(Piece.I12.toString(), I12);
    }

}
