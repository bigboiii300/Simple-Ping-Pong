# ОПИСАНИЕ ЗАДАЧИ "Simple ping-pong"
Необходимо реализовать при помощи программного кода,<br>
написанного на Java или Kotlin игру "Simple ping-pong":

<b>Дано:</b><br>
Класс для обозначения точки на сетке стола - TablePoint.java<br>
Класс стола для пинг-понга - PingPongTable.java<br>
Класс игрока - PlayerImpl.java<br>
Класс игры - пустая имплементация в GameImpl.java<br>

<b>Задача</b>:<br>
Необходимо при помощи существующих классов реализовать игру двух игроков под присмотром судьи.

<i>Написать реализацию метода hit PlayerImpl</i><br>
Каждый удар (hit) игрока должен возвращать рандомную точку из набора точек для удара (pointsForShouting).

<i>Написать реализацию метода run GameImpl</i>:<br>
Алгоритм реализации:<br>
При каждом ударе игрока производится проверка, попал ли игрок по столу соперника или нет.<br>
Факт удара фиксируется в console (попал или не попал и по какой точке был совершен удар).<br>
В случае, если игрок не попадает по столу соперника, очко присуждается его оппонента (общий счет выводится в консоль).<br>
Очко разыгрывается до тех пор, пока один из игроков не промахнется по столу соперника.<br>
Очки суммируются и тот, кто наберет первым 11 очков, будет победителем.<br>

<b>Критерии приемки задания:</b><br>
Использованы классы, представленные в графе Дано.<br>
Код написан на языке Java либо Kotlin.<br>
Код работает. В консоли фиксируется каждый розыгрыш и точку удара, а так же попал игрок по столу соперника или нет.<br>
При каждом запуске программы розыгрыш должен быть уникальным.<br>
