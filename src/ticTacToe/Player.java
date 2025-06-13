package ticTacToe;
import java.util.Objects;

public class Player  {
    String playerType = "O";

    public String userType(){
        if (Objects.equals(playerType, "X")){
            playerType="O";
        }else {
            playerType = "X";
        }
        return playerType;
    }


    public void declareWinner(String player){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("\t****---Hurray!... You won Player "+player+"---****");
        System.out.println("***************************************************");
    }



}
