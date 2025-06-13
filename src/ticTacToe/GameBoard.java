package ticTacToe;
import java.util.Objects;

public class GameBoard {

    String [][] board = {{"_", "_", "_"},
                         {"_", "_", "_"},
                         {"_", "_", "_"}};

//    Showing game board to the players
    public void showBoard(){
        for (String[] strings : board) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

//    checking cell availability
    public boolean checkCellAvailability (int enteredRow, int enteredColumn){
        if (Objects.equals(board[enteredRow][enteredColumn], "_")){
            return true;
        }else{
            return false;
        }
    }

//    making sure if the board filled or not
    public boolean isBoardFilled(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Objects.equals(board[i][j],"_")){
                    return false;
                }
            }

        }
        return true;
    }

//    putting data to the cell
    public void updateBoard(int row, int column, String move){
            board[row][column]=move;
    }

//    checking for winner player
/*
    I have break the conditions into 3 parts
    if both col nad row is equal
    if row is greater than col
    if row is less than col

 */
//    public String  checkWinner(String userType, int gridRow, int gridCol){
//        if(gridRow ==gridCol){
//            if (gridRow ==1){
//                if (board[0][0]==userType){
//                    if(board[2][2]==userType){
//                        return userType;
//                    }
//                } else if (board[0][1]==userType) {
//                    if (board[2][1]==userType){
//                        return  userType;
//                    }
//                } else if (board[1][0]==userType) {
//                    if (board[1][2]==userType){
//                        return userType;
//                    }
//                } else if (board[0][2]==userType) {
//                    if (board[2][0]==userType){
//                        return userType;
//                    }
//                }
//
//            } else if (gridRow ==0) {
//                if (board[0][1]==userType){
//                    if (board[0][2]==userType){
//                        return userType;
//                    }
//                }else if (board[1][0]==userType) {
//                    if (board[2][0]==userType){
//                        return userType;
//                    }
//
//                } else if (board[1][1]==userType) {
//                    if (board[2][2]==userType){
//                        return userType;
//                    }
//                }
//            } else{
//                if (board[2][1]==userType){
//                    if (board[2][0]==userType){
//                        return userType;
//                    }
//                } else if (board[1][1]==userType) {
//                    if (board[0][0]==userType){
//                        return userType;
//                    }
//
//                } else if (board[1][2]==userType) {
//                    if (board[0][2]==userType){
//                        return userType;
//                    }
//
//                }
//            }
//        } else if (gridRow >gridCol) {
//            if (gridCol==1){
//                if (board[1][1]==userType){
//                    if (board[0][1]==userType){
//                        return userType;
//                    }
//                } else if (board[2][0]==userType) {
//                    if (board[2][2]==userType){
//                        return userType;
//                    }
//                }
//            } else if (gridRow==1) {
//                if (board[1][1]==userType){
//                    if (board[1][2]==userType){
//                        return userType;
//                    }
//                } else if (board[2][0]==userType) {
//                    if (board[0][0]==userType){
//                        return userType;
//                    }
//                }
//            }else {
//                if (board[2][1]==userType){
//                    if (board[2][2]==userType){
//                        return userType;
//                    }
//                } else if (board[1][0]==userType) {
//                    if (board[0][0]==userType){
//                        return userType;
//                    }
//
//                } else if (board[1][1]==userType) {
//                    if (board[0][2]==userType){
//                        return userType;
//                    }
//                }
//            }
//        }else {
//            if (gridRow==1){
//                if (board[1][1]==userType){
//                    if (board[1][0]==userType){
//                        return userType;
//                    }
//                } else if (board[2][2]==userType) {
//                    if (board[0][2]==userType){
//                        return userType;
//                    }
//                }
//            } else if (gridCol==1) {
//                if (board[1][1]==userType){
//                    if (board[2][1]==userType){
//                        return userType;
//                    }
//                }else if (board[0][0]==userType){
//                    if (board[0][2]==userType){
//                        return userType;
//                    }
//                }
//            }else {
//                if (board[0][1]==userType){
//                    if (board[0][0]==userType){
//                        return userType;
//                    }
//                } else if (board[1][2]==userType) {
//                    if (board[2][2]==userType){
//                        return userType;
//                    }
//
//                } else if (board[1][1]==userType) {
//                    if (board[2][0]==userType){
//                        return userType;
//                    }
//
//                }
//            }
//        }
//        return null;
//    }

    public boolean  checkWinner(String userType){
        if(board[0][0] == userType && board[0][1] == userType && board[0][2] == userType){
            return true;
        } else if (board[0][0] == userType && board[1][0] == userType && board[2][0] == userType) {
            return true;
        } else if (board[0][0] == userType && board[1][1] == userType && board[2][2] == userType) {
            return true;
        } else if (board[0][1] == userType && board[1][1] == userType && board[2][1] == userType) {
            return true;
        } else if (board[0][2] == userType && board[1][2] == userType && board[2][2] == userType) {
            return true;
        } else if (board[0][2] == userType && board[1][1] == userType && board[2][0] == userType) {
            return true;
        } else if (board[1][0] == userType && board[1][1] == userType && board[1][2] == userType) {
            return true;
        } else if (board[2][0] == userType && board[2][1] == userType && board[2][2] == userType) {
            return true;
        }else {
            return false;
        }
    }
    



}
