package com.Acquire.core;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public enum Chain {
    DEAD {

        int player1 = 0;
        int player2 = 0;
        int available = 10000;
        int size = 0;
        int cost = 0;
        Background background = new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return available;
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            return cost;
        }

        @Override
        public int getMajority() {
            return 0;
        }

        @Override
        public int getMinority() {
            return 0;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "DEAD";
        }
    }, NONE {

        int player1 = 0;
        int player2 = 0;
        int available = 10000;
        int size = 0;
        int cost = 0;
        Background background = new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return available;
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            return cost;
        }

        @Override
        public int getMajority() {
            return 0;
        }

        @Override
        public int getMinority() {
            return 0;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "NONE";
        }
    }, EMPTY {

        int player1 = 0;
        int player2 = 0;
        int available = 10000;
        int size = 0;
        int cost = 0;
        Background background = new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return available;
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            return cost;
        }

        @Override
        public int getMajority() {
            return 0;
        }

        @Override
        public int getMinority() {
            return 0;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "*";
        }
    }, L {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 5;
                                } else if (size == 4) {
                                    return 4;
                                } else if (size == 3) {
                                    return 3;
                                } else if (size == 2) {
                                    return 2;
                                } else {
                                    return 0;
                                }
                            }
                            return 6;
                        }
                        return 7;
                    }
                    return 8;
                }
                return 9;
            }
            return 10;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 5000;
                                } else if (size == 4) {
                                    return 4000;
                                } else if (size == 3) {
                                    return 3000;
                                } else if (size == 2) {
                                    return 2000;
                                } else {
                                    return 0;
                                }
                            }
                            return 6000;
                        }
                        return 7000;
                    }
                    return 8000;
                }
                return 9000;
            }
            return 10000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 2500;
                                } else if (size == 4) {
                                    return 2000;
                                } else if (size == 3) {
                                    return 1500;
                                } else if (size == 2) {
                                    return 1000;
                                } else {
                                    return 0;
                                }
                            }
                            return 3000;
                        }
                        return 3500;
                    }
                    return 4000;
                }
                return 4500;
            }
            return 5000;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "L";
        }
    }, T {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 5;
                                } else if (size == 4) {
                                    return 4;
                                } else if (size == 3) {
                                    return 3;
                                } else if (size == 2) {
                                    return 2;
                                } else {
                                    return 0;
                                }
                            }
                            return 6;
                        }
                        return 7;
                    }
                    return 8;
                }
                return 9;
            }
            return 10;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 5000;
                                } else if (size == 4) {
                                    return 4000;
                                } else if (size == 3) {
                                    return 3000;
                                } else if (size == 2) {
                                    return 2000;
                                } else {
                                    return 0;
                                }
                            }
                            return 6000;
                        }
                        return 7000;
                    }
                    return 8000;
                }
                return 9000;
            }
            return 10000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 2500;
                                } else if (size == 4) {
                                    return 2000;
                                } else if (size == 3) {
                                    return 1500;
                                } else if (size == 2) {
                                    return 1000;
                                } else {
                                    return 0;
                                }
                            }
                            return 3000;
                        }
                        return 3500;
                    }
                    return 4000;
                }
                return 4500;
            }
            return 5000;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "T";
        }
    }, A {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6;
                                } else if (size == 4) {
                                    return 5;
                                } else if (size == 3) {
                                    return 4;
                                } else if (size == 2) {
                                    return 3;
                                } else {
                                    return 0;
                                }
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 10;
            }
            return 11;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6000;
                                } else if (size == 4) {
                                    return 5000;
                                } else if (size == 3) {
                                    return 4000;
                                } else if (size == 2) {
                                    return 3000;
                                } else {
                                    return 0;
                                }
                            }
                            return 7000;
                        }
                        return 8000;
                    }
                    return 9000;
                }
                return 10000;
            }
            return 11000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 3000;
                                } else if (size == 4) {
                                    return 2500;
                                } else if (size == 3) {
                                    return 2000;
                                } else if (size == 2) {
                                    return 1500;
                                } else {
                                    return 0;
                                }
                            }
                            return 3500;
                        }
                        return 4000;
                    }
                    return 4500;
                }
                return 5000;
            }
            return 5500;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "A";
        }
    }, F {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.LIMEGREEN, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6;
                                } else if (size == 4) {
                                    return 5;
                                } else if (size == 3) {
                                    return 4;
                                } else if (size == 2) {
                                    return 3;
                                } else {
                                    return 0;
                                }
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 10;
            }
            return 11;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6000;
                                } else if (size == 4) {
                                    return 5000;
                                } else if (size == 3) {
                                    return 4000;
                                } else if (size == 2) {
                                    return 3000;
                                } else {
                                    return 0;
                                }
                            }
                            return 7000;
                        }
                        return 8000;
                    }
                    return 9000;
                }
                return 10000;
            }
            return 11000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 3000;
                                } else if (size == 4) {
                                    return 2500;
                                } else if (size == 3) {
                                    return 2000;
                                } else if (size == 2) {
                                    return 1500;
                                } else {
                                    return 0;
                                }
                            }
                            return 3500;
                        }
                        return 4000;
                    }
                    return 4500;
                }
                return 5000;
            }
            return 5500;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "F";
        }
    }, W {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.SADDLEBROWN, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6;
                                } else if (size == 4) {
                                    return 5;
                                } else if (size == 3) {
                                    return 4;
                                } else if (size == 2) {
                                    return 3;
                                } else {
                                    return 0;
                                }
                            }
                            return 7;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 10;
            }
            return 11;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 6000;
                                } else if (size == 4) {
                                    return 5000;
                                } else if (size == 3) {
                                    return 4000;
                                } else if (size == 2) {
                                    return 3000;
                                } else {
                                    return 0;
                                }
                            }
                            return 7000;
                        }
                        return 8000;
                    }
                    return 9000;
                }
                return 10000;
            }
            return 11000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 3000;
                                } else if (size == 4) {
                                    return 2500;
                                } else if (size == 3) {
                                    return 2000;
                                } else if (size == 2) {
                                    return 1500;
                                } else {
                                    return 0;
                                }
                            }
                            return 3500;
                        }
                        return 4000;
                    }
                    return 4500;
                }
                return 5000;
            }
            return 5500;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "W";
        }
    }, C {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.DEEPSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 7;
                                } else if (size == 4) {
                                    return 6;
                                } else if (size == 3) {
                                    return 5;
                                } else if (size == 2) {
                                    return 4;
                                } else {
                                    return 0;
                                }
                            }
                            return 8;
                        }
                        return 9;
                    }
                    return 10;
                }
                return 11;
            }
            return 12;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 7000;
                                } else if (size == 4) {
                                    return 6000;
                                } else if (size == 3) {
                                    return 5000;
                                } else if (size == 2) {
                                    return 4000;
                                } else {
                                    return 0;
                                }
                            }
                            return 8000;
                        }
                        return 9000;
                    }
                    return 10000;
                }
                return 11000;
            }
            return 12000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 3500;
                                } else if (size == 4) {
                                    return 3000;
                                } else if (size == 3) {
                                    return 2500;
                                } else if (size == 2) {
                                    return 2000;
                                } else {
                                    return 0;
                                }
                            }
                            return 4000;
                        }
                        return 4500;
                    }
                    return 5000;
                }
                return 5500;
            }
            return 6000;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "C";
        }
    }, I {

        int player1, player2, available, size, cost;
        Background background = new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY));
        Border border = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

        @Override
        public Background getBackground() {
            return background;
        }

        @Override
        public Border getBorder() {
            return border;
        }

        @Override
        public int getPlayer1() {
            return player1;
        }

        @Override
        public int getPlayer2() {
            return player2;
        }

        @Override
        public int getAvailable() {
            return 25 - (player1 + player2);
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public int getCost() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 7;
                                } else if (size == 4) {
                                    return 6;
                                } else if (size == 3) {
                                    return 5;
                                } else if (size == 2) {
                                    return 4;
                                } else {
                                    return 0;
                                }
                            }
                            return 8;
                        }
                        return 9;
                    }
                    return 10;
                }
                return 11;
            }
            return 12;
        }

        @Override
        public int getMajority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 7000;
                                } else if (size == 4) {
                                    return 6000;
                                } else if (size == 3) {
                                    return 5000;
                                } else if (size == 2) {
                                    return 4000;
                                } else {
                                    return 0;
                                }
                            }
                            return 8000;
                        }
                        return 9000;
                    }
                    return 10000;
                }
                return 11000;
            }
            return 12000;
        }

        @Override
        public int getMinority() {
            if (size < 41) {
                if (size < 31) {
                    if (size < 21) {
                        if (size < 11) {
                            if (size < 6) {
                                if (size == 5) {
                                    return 3500;
                                } else if (size == 4) {
                                    return 3000;
                                } else if (size == 3) {
                                    return 2500;
                                } else if (size == 2) {
                                    return 2000;
                                } else {
                                    return 0;
                                }
                            }
                            return 4000;
                        }
                        return 4500;
                    }
                    return 5000;
                }
                return 5500;
            }
            return 6000;
        }

        @Override
        public void setPlayer1(int player1) {
            this.player1 = player1;
        }

        @Override
        public void setPlayer2(int player2) {
            this.player2 = player2;
        }

        @Override
        public void setAvailable(int available) {
            this.available = available;
        }

        @Override
        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "I";
        }
    };

    public abstract Background getBackground();

    public abstract Border getBorder();

    public abstract int getPlayer1();

    public abstract int getPlayer2();

    public abstract int getAvailable();

    public abstract int getSize();

    public abstract int getCost();

    public abstract int getMajority();

    public abstract int getMinority();

    public abstract void setPlayer1(int player1);

    public abstract void setPlayer2(int player2);

    public abstract void setAvailable(int available);

    public abstract void setSize(int size);

    public abstract void setCost(int cost);
}
