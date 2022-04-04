package ru.app.core.impl;

import ru.app.core.Game;
import ru.app.core.Player;

import java.util.Set;

/**
 * Реализация игры
 */
public class GameImpl implements Game {
    private static final int MAXIMUM_GAME_POINT = 11;
    private int gamePointsFirst = 0;
    private int gamePointsSecond = 0;

    @Override
    public void run(PingPongTableImpl pingPongTable, Player playerOne, Player playerTwo) {
        System.out.println("\nStart game!");
        Set<TablePoint> playerOnePlayerTablePoints = playerOne.getPlayerTablePoints();
        Set<TablePoint> playerTwoPlayerTablePoints = playerTwo.getPlayerTablePoints();

        while (gamePointsFirst != MAXIMUM_GAME_POINT && gamePointsSecond != MAXIMUM_GAME_POINT) {
            hitFirstPlayer(playerOne, playerTwo, playerTwoPlayerTablePoints);
            if (gamePointsSecond != 11) {
                hitSecondPlayer(playerOne, playerTwo, playerOnePlayerTablePoints);
            }
        }
        getWinner();
    }

    /**
     * Вывод в консоль победителя игры.
     */
    private void getWinner() {
        if (gamePointsFirst > gamePointsSecond) {
            System.out.println("The first player won!");
        } else {
            System.out.println("The second player won!");
        }
    }

    /**
     * Вывод в консоль текущего общего счета.
     */
    private void getCurrentScore() {
        System.out.println("\nThe current score:");
        System.out.println("First player: " + gamePointsFirst);
        System.out.println("Second player: " + gamePointsSecond);
    }

    /**
     * Удар первого игрока
     *
     * @param playerOne                  Первый игрок
     * @param playerTwo                  Второй игрок
     * @param playerTwoPlayerTablePoints Стол второго игрока
     */
    private void hitFirstPlayer(Player playerOne, Player playerTwo, Set<TablePoint> playerTwoPlayerTablePoints) {
        System.out.println("\nThe first player's turn");
        TablePoint firstPlayerHit = playerOne.hit();
        if (playerTwoPlayerTablePoints.contains(firstPlayerHit)) {
            System.out.println("First player hit the table");
        } else {
            System.out.println("First player didn't hit the table. Game point is added to the second player");
            playerTwo.calculateGamePoints();
            gamePointsSecond = playerTwo.getCountGamePoints();
            getCurrentScore();
        }
    }

    /**
     * Удар второго игрока
     *
     * @param playerOne                  Первый игрок
     * @param playerTwo                  Второй игрок
     * @param playerOnePlayerTablePoints Стол первого игрока
     */
    private void hitSecondPlayer(Player playerOne, Player playerTwo, Set<TablePoint> playerOnePlayerTablePoints) {
        System.out.println("\nThe second player's turn");
        TablePoint secondPlayerHit = playerTwo.hit();
        if (playerOnePlayerTablePoints.contains(secondPlayerHit)) {
            System.out.println("Second player hit the table");
        } else {
            System.out.println("Second player didn't hit the table. Game point is added to the first player");
            playerOne.calculateGamePoints();
            gamePointsFirst = playerOne.getCountGamePoints();
            getCurrentScore();
        }
    }
}
