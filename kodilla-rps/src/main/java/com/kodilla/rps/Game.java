package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final char NEXT_GAME = 'n';
    public static final char END_GAME = 'x';

    private Rps rps = new Rps();

    private String playerName;
    private int rounds;

    public void mainLoop() {
        int option = NEXT_GAME;
        Scanner input = new Scanner(System.in);

        while (option != END_GAME) {
            showMenu();
            System.out.println("Podaj swoje imię: ");
            playerName = input.nextLine();
            System.out.println("Podaj ilość rund: ");
            rounds = input.nextInt();
            play();
            //todo pokazac menu
            showMenu();
            option = input.nextInt();
            input.nextLine();
        }
        System.out.println("Koniec gry!");
    }

    public void play() {
        int roundsCounter = 1;
        do {
            System.out.println("Runda: " + roundsCounter + "/" + rounds);
            System.out.println("Wybierz 1 - Kamień, 2 - Papier, 3 - Nożyce:");
            int playerTurn = rps.getPlayerMove();
            int computerTurn = rps.getComputerMove();

            if (computerTurn == ROCK) {
                if (playerTurn == ROCK) {
                    System.out.println("Kamień vs Kamień."); //Remis
                } else if (playerTurn == PAPER) {
                    System.out.println("Kamień vs. Papier!"); //Wygrałeś
                    rps.addPointToPlayer();
                } else if (playerTurn == SCISSORS) {
                    System.out.println("Kamień vs. Nożyce!"); //Przegrałeś
                    rps.addPointToComputer();
                }
            } else if (computerTurn == PAPER) {
                if (playerTurn == ROCK) {
                    System.out.println("Paper vs. Kamień!"); //Przegrałeś
                    rps.addPointToComputer();
                } else if (playerTurn == SCISSORS) {
                    System.out.println("Papier vs. Nożyce!"); //Wygrałeś
                    rps.addPointToPlayer();
                } else if (playerTurn == PAPER) {
                    System.out.println("Papier vs. Papier!"); //Remis
                }
            } else if (computerTurn == SCISSORS) {
                if (playerTurn == ROCK) {
                    System.out.println("Nożyce vs. Kamień!");  //Wygrałeś
                    rps.addPointToPlayer();
                } else if (playerTurn == SCISSORS) {
                    System.out.println("Nożyce vs. Nożyce"); //Remis
                } else if (playerTurn == PAPER) {
                    System.out.println("Nożyce vs Papier!"); //Przegrałeś
                    rps.addPointToComputer();
                }
            }

            System.out.println(playerName + ": " + playerTurn + " | " + " Komputer: " + computerTurn);
            System.out.println("Wynik: " + playerName + " " + rps.getPlayerPoints()+ ":" + rps.getComputerPoints() + " Komputer");
            roundsCounter++;
        } while (roundsCounter <= rounds);

        rps.pointsCounter();
    }

    public void showMenu() {
        System.out.println(ROCK + " - zagranie \"KAMIEN\"");
        System.out.println(PAPER + " - zagranie \"PAPIER\"");
        System.out.println(SCISSORS + " - zagranie \"NOŻYCE\"");
        System.out.println(NEXT_GAME + " - Nowa gra");
        System.out.println(END_GAME + " - Zakończenie gry");
    }
}
