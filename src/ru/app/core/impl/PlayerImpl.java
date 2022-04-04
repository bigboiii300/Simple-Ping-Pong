package ru.app.core.impl;

import ru.app.core.Player;

import java.util.Random;
import java.util.Set;

/**
 * Класс игрока
 */
public class PlayerImpl implements Player {

    private final Set<TablePoint> playerTablePoints;
    private final Set<TablePoint> pointsForShouting;
    private int countGamePoints = 0;

    public PlayerImpl(Set<TablePoint> playerTablePoints, Set<TablePoint> pointsForShouting) {
        this.playerTablePoints = playerTablePoints;
        this.pointsForShouting = pointsForShouting;
    }

    @Override
    public TablePoint hit() {
        TablePoint point = pointsForShouting.stream().skip(new Random().nextInt(pointsForShouting.size())).findFirst().get();
        System.out.println("Player hit the " + point);
        return point;
    }

    @Override
    public Set<TablePoint> getPlayerTablePoints() {
        return playerTablePoints;
    }

    @Override
    public int getCountGamePoints() {
        return countGamePoints;
    }

    @Override
    public void calculateGamePoints() {
        ++countGamePoints;
        System.out.println(countGamePoints);
    }
}
