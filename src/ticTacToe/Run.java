package ticTacToe;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        boolean gameEnd = false;

        GameBoard gameBoard = new GameBoard();
        Player player = new Player();
        GameRunner gameRunner = new GameRunner();
        int move = 1;

//        printing stater message...
        gameRunner.startMessage();

//        game begun
        while (!gameEnd){
//            selecting player type
            String playerMode=player.userType();
//            ask player for turn
            gameRunner.getPlayerMove(playerMode);

            boolean inValidMove= false;
//            get the row that the player entered
            int enteredRow = gameRunner.getEnteredRow();
//            get the row that the player entered
            int enteredCol = gameRunner.getEnteredCol();

//            Checking for invalid move
            while (!inValidMove) {
//                check if the user enter greater than grid value(index out of bound)
                if (enteredRow>=3 || enteredCol>=3){
                    System.out.println("invalid move...");
                    System.out.println();
                    gameRunner.getPlayerMove(playerMode);
                    enteredRow = gameRunner.getEnteredRow();
                    enteredCol = gameRunner.getEnteredCol();
                }else{
                    boolean isCellAvailable = gameBoard.checkCellAvailability(enteredRow, enteredCol);
                    if (isCellAvailable) {
                        gameBoard.updateBoard(enteredRow, enteredCol, playerMode);
                        inValidMove = true;

                    } else {
                        System.out.println("invalid move...");
                        System.out.println();
                        gameRunner.getPlayerMove(playerMode);
                        enteredRow = gameRunner.getEnteredRow();
                        enteredCol = gameRunner.getEnteredCol();
                    }
                }

            }
            gameBoard.showBoard();

//            checking if anyone wins after every move.
            boolean isWinner = gameBoard.checkWinner(playerMode);
            boolean isBoardFilled = gameBoard.isBoardFilled();

            if (isWinner){
                player.declareWinner(playerMode);
                gameEnd = true;
            }else if (isBoardFilled) {
                gameRunner.matchDrawMessage();
                gameEnd = true;
            }else {
                move++;
            }
        }
        gameRunner.endMessage();


    }
}
