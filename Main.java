package ua.prog.java.lesson7;

public class Main {

	// 1) Существуют три корабля. На каждом из них 10 (лучше - разное кол-во)
	// ящиков груза.
	// Они одновременно прибыли в порт, в котором только два
	// дока. Скорость разгрузки - 1 ящик в 0.5 сек. Напишите
	// программу, которая, управляя кораблями, позволит им
	// правильно разгрузить груз.

	public static void main(String[] args) {

		System.out.println("Ships are ready to release boxes!");

		ShipsAndDocks releaseShips = new ShipsAndDocks();

		Ship firstShip = new Ship(releaseShips, 1, 10);
		Ship secondShip = new Ship(releaseShips, 2, 20);
		Ship thirdShip = new Ship(releaseShips, 3, 15);

		Thread firstShipGo = new Thread(firstShip);
		Thread secondShipGo = new Thread(secondShip);
		Thread thirdShipGo = new Thread(thirdShip);

		firstShipGo.start();
		secondShipGo.start();
		thirdShipGo.start();

	}
}
