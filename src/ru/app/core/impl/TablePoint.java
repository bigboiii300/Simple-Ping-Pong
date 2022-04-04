package ru.app.core.impl;

import java.util.Objects;

/**
 * Класс для обозначения точки на сетке стола
 */
public class TablePoint {
    public int x;
    public int y;

    public TablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TablePoint that)) return false;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "TablePoint{x=" + x + ", y=" + y + "}";
    }
}