package ru.app.core;

import ru.app.core.impl.PingPongTableImpl;

public interface Game {
    void run(PingPongTableImpl pingPongTable, Player playerOne, Player playerTwo);
}
