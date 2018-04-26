package ua.prog.java.lesson7;

public class Main {

	// 1) ���������� ��� �������. �� ������ �� ��� 10 (����� - ������ ���-��)
	// ������ �����.
	// ��� ������������ ������� � ����, � ������� ������ ���
	// ����. �������� ��������� - 1 ���� � 0.5 ���. ��������
	// ���������, �������, �������� ���������, �������� ��
	// ��������� ���������� ����.

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
