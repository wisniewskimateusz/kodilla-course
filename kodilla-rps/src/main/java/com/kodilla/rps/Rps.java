package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

    private static Scanner input = new Scanner(System.in);
    private int playerPoints;
    private int computerPoints;

    public Rps() {
        playerPoints = 0;
        computerPoints = 0;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    public void addPointToPlayer() {
        setPlayerPoints(getPlayerPoints() + 1);
    }

    public void addPointToComputer() {
        setComputerPoints(getComputerPoints() + 1);
    }

    public int getComputerMove() {
        int computerMove;
        Random random = new Random();
        int input = random.nextInt(3) + 1;
        if (input == 1)
            computerMove = Game.ROCK;
        else if(input == 2)
            computerMove = Game.PAPER;
        else
            computerMove = Game.SCISSORS;
        return computerMove;
    }

    public int getPlayerMove() {
        return input.nextInt();
    }

    //todo checkWin? nazwa ktora powie nam ze jest sprawdzany koncowy wynik
    public void pointsCounter() {
        if (playerPoints > computerPoints) {
            System.out.println("Gracz wygrał!");
        } else if (playerPoints == computerPoints) {
            System.out.println("Remis!");
        } else {
            System.out.println("Komputer wygrał");
        }
    }
}
